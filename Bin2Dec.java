import java.util.*;  
  
public class Bin2Dec
{  
    public static void main(String[] args)   
    {  
        Scanner input = new Scanner(System.in);  
        while(true)  
        {  
            String s = input.nextLine();  
            int ans = 0;  
            int time = 0;  
            try  
            {  
                for(int i=s.length()-1 ; i>=0 ; i--)  
                {  
                    if(s.charAt(i) == '0' || s.charAt(i) == '1')  
                    {  
                        int tmp = s.charAt(i)-48;  
                        for(int q=0 ; q<time ; q++)  
                        {  
                            tmp *= 2;  
                        }  
                        ans += tmp;  
                        time++;  
                          
                    }  
                    else  
                    {  
                        throw new MyNumberFormatException();  
                    }  
                }  
                System.out.println(ans);  
            }  
            catch(MyNumberFormatException ex)  
            {  
                System.out.print(ex.toString());  
            }  
        }  
    }  
}  
  
class MyNumberFormatException extends Exception  
{  
    public String toString()  
    {  
        return "Incorrect Binary Format\n";  
    }  
}  