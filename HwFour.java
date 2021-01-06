import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack stk = new Stack();
		String str = input.next();
		Boolean flag = true;
		int start = 0;
		StringTokenizer result = new StringTokenizer(str,"\\+|-|\\*|/|(|)|%",true);
		String[] array = new String[1000];
		int index = 0;
		while(result.hasMoreElements()){
			array[index] = result.nextToken();
			index++;
		}
		// ----------------------ok-----------------------
		while(stk.empty()){
			int icp = 0;
			icp = ICP(array[start]);
			if(icp==0){
				System.out.print(array[start]);
				System.out.print(" ");
			}
			else{
				stk.push(array[start]);
			}
			start++;
		}
		for(int i = start;i<index;i++){
			if(stk.empty()){
				stk.push(array[i]);
			}
			else{
				int in_icp = 0;
				int stk_isp = 0;
				String pop_string =(String) stk.peek();
				in_icp = ICP(array[i]);
				stk_isp = ISP(pop_string);
				// System.out.println("icp:"+in_icp);
				// System.out.println("isp:"+stk_isp);
				if(in_icp==0&&!array[i].equals(")")){
					System.out.print(array[i]);
					System.out.print(" ");			
				}
				if(in_icp>0&&!array[i].equals(")")){
					if(in_icp>stk_isp){
						// System.out.println("pushed");
						stk.push(array[i]);
					}
					if(in_icp<=stk_isp){
						while(flag){
							int isp = 0;
							if(!stk.empty()){
								String out = (String) stk.peek();
								isp = ISP(out);
							}
							else{
								stk.push(array[i]);
								break;
							}
							if(in_icp<=isp){
								String output = (String) stk.peek();
								// System.out.println("output: " + output);
								if(output.equals("(")){
									stk.pop();
								}
								if(!output.equals("(")){
									System.out.print(output);
									System.out.print(" ");
									stk.pop();
								}
							}
							else{
								stk.push(array[i]);
								// flag = false;
								break;
							}
							// stk.push(array[i]);
						}
					}
					// String check = (String) stk.peek();
					// System.out.println("check: "+ check);
				}
				if(array[i].equals(")")){
					boolean end = true;
					while(end){
						String last = (String) stk.peek();
						// System.out.println("last:" + last);
						if(!last.equals("(")){
							System.out.print(last);
							System.out.print(" ");
							stk.pop();
						}
						else{
							stk.pop();
							break;
						}
					}
				}
			}
			
		}
		while(!stk.empty()){
			String fin = (String) stk.peek();
			System.out.print(fin);
			System.out.print(" ");
			stk.pop();
		}
		System.out.println();
	}
	// icp <= isp 輸出堆疊直到 icp > isp
	// icp > isp 把此token加入至堆疊當中
	public static int ICP(String str){
		if(str.equals("+")||str.equals("-"))
			return 1;
		else if(str.equals("*")||str.equals("/")||str.equals("%"))
			return 2;
		else if(str.equals("("))
			return 4;
		else
			return 0;
	}
	public static int ISP(String str){
		if(str.equals("+")||str.equals("-"))
			return 1;
		else if(str.equals("*")||str.equals("/")||str.equals("%"))
			return 2;
		else
			return 0;	
	}
}