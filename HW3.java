import java.util.*;            
import java.lang.*;   
import java.math.*;            
      
public class HW3      
{            
    public static void main(String[] args)             
    {            
        Scanner input = new Scanner(System.in);  
        while(input.hasNext())  
        {  
            String s = input.nextLine();  
            StringTokenizer st = new StringTokenizer(s,"\\+|-|\\*|/|(|)|%",true);  
            String[] token = new String[100];  
            String[] num = new String[100];  
            String[] op = new String[100];   
            int index = 0;  
            int op_index = 0;  
            int num_index = 0;  
            float ans = 0;  
            while(st.hasMoreElements())  
            {  
                token[index] = st.nextToken();  
                index++;  
            }  
            for(int i=0 ; i<index ; i++)  
            {  
                if(token[i].equals("+") || token[i].equals("-") || token[i].equals("*") || token[i].equals("/") || token[i].equals("(") || token[i].equals(")") || token[i].equals("%"))  
                {  
                    op[op_index] = token[i];  
                    op_index++;  
                }  
                else  
                {  
                    float tmp = Float.parseFloat(token[i]);  
                    ans = tmp + ans;  
                    num[num_index] = token[i];  
                    num_index++;  
                }  
            }  
            for(int i=0 ; i<num_index ; i++)  
            {  
                if(i == num_index-1)  
                {  
                    System.out.println(num[i]);  
                }  
                else  
                {  
                    System.out.print(num[i] + " ");  
                }  
            }  
            for(int i=0 ; i<op_index ; i++)  
            {  
                if(i == op_index-1)  
                {  
                    System.out.println(op[i]);  
                }  
                else  
                {  
                    System.out.print(op[i] + " ");  
                }  
            }  
            System.out.printf("%.3f\n",ans);  
        }  
    }  
}  