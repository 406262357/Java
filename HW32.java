import java.util.*;  
  
public class HW32  
{  
    public static void main(String[] args)   
    {  
        Scanner input = new Scanner(System.in);  
        Stack st = new Stack();  
        String s = input.nextLine();  
        StringTokenizer stto = new StringTokenizer(s,"\\+|-|\\*|/|(|)|%",true);  
        String[] token = new String[10000];  
        int index = 0;  
        int token_index = 0;  
        while(stto.hasMoreElements())  
        {  
            token[index] = stto.nextToken();  
            index++;  
        }       
  
        while(st.empty())  
        {  
            int tmp = priority(token[token_index]);  
            if(tmp == 0)  
            {  
                System.out.print(token[token_index] + " ");  
            }  
            else  
            {  
                st.push(token[token_index]);  
            }  
            token_index++;  
        }  
        for(int i=token_index ; i<index ; i++)  
        {  
            if(st.empty())  
            {  
                st.push(token[i]);  
            }  
            else  
            {  
                int priority , st_priority;  
                String tmp = (String) st.peek();  
                priority = priority(token[i]);  
                st_priority = priority_check(tmp);  
                if(priority == 0 && !token[i].equals(")"))  
                {  
                    System.out.print(token[i] + " ");  
                }  
                if(priority > 0 && !token[i].equals(")"))  
                {  
                    if(priority > st_priority)  
                    {  
                        st.push(token[i]);  
                    }  
                    else  
                    {  
                        while(true)  
                        {  
                            if(st.empty())  
                            {  
                                st.push(token[i]);  
                                break;  
                            }  
                            else  
                            {  
                                tmp =(String) st.peek();  
                                st_priority = priority_check(tmp);  
                            }  
                            if(priority <= st_priority)  
                            {  
                                tmp = (String) st.peek();  
                                if(tmp.equals("("))  
                                {  
                                    st.pop();  
                                }  
                                else                                
                                {  
                                    System.out.print(tmp + " ");  
                                    st.pop();  
                                }  
                            }  
                            else  
                            {  
                                st.push(token[i]);  
                                break;  
                            }  
                        }  
                    }  
                }  
                if(token[i].equals(")"))  
                {  
                    while(true)  
                    {  
                        tmp = (String) st.peek();  
                        if(tmp.equals("("))  
                        {   
                            st.pop();  
                            break;  
                        }  
                        else  
                        {  
                            System.out.print(tmp + " ");  
                            st.pop();  
                        }  
                    }  
                }  
            }  
        }  
        while(!st.empty())  
        {  
            String tmp = (String)st.peek();  
            System.out.print(tmp + " ");  
            st.pop();  
        }  
        System.out.println();  
    }    
  
  
  
  
  
  
  
    public static int priority(String s)  
    {  
        if(s.equals("("))  
            return 3;  
        else if(s.equals("*") || s.equals("/") || s.equals("%"))  
            return 2;  
        else if(s.equals("+") || s.equals("-"))  
            return 1;  
        else  
            return 0;  
    }  
  
    public static int priority_check(String s)  
    {  
        if(s.equals("*") || s.equals("/") || s.equals("%"))  
            return 2;  
        else if(s.equals("+") || s.equals("-"))  
            return 1;  
        else  
            return 0;  
    }  
}  