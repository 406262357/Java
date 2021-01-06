import java.util.*;            
import java.lang.*;   
import java.math.*;           
      
public class PD
{            
    public static void main(String[] args)             
    {            
        Scanner input = new Scanner(System.in);  
        String num = input.nextLine();  
        int time = Integer.parseInt(num);  
        for(int i=0 ; i<time ; i++)  
        {  
            String s = input.nextLine();  
            // System.out.println(s + " " + "s");  
            // System.out.println(s + " " + "s");  
            String str = input.nextLine();  
            // System.out.println(str + "  str");  
            String s_change = input.nextLine();  
            // System.out.println(s_change + "  s_change");  
            StringBuffer sb = new StringBuffer(s);  
            // System.out.println(s.length());  
            while(true)  
            {  
                int index = sb.indexOf(str);  
                if(index == -1)  
                    break;  
                sb.replace(index,index+str.length(),s_change);  
            }  
  
            System.out.println(sb.reverse());  
        }  
    }  
  
}  