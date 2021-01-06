import java.util.*;            
import java.lang.*;   
import java.math.*;            
      
public class PalindromicPrime      
{            
    public static void main(String[] args)             
    {            
        Scanner input = new Scanner(System.in);  
  
        while(input.hasNext())  
        {  
            int num = input.nextInt();  
            if(num == 0)  
                System.out.println();  
            int cnt = 1;  
            for(int i=2 ; cnt<=num ; i++)  
            {  
                if(checkprime(i) && checkPalindrome(i))  
                {  
                    if(cnt == num || cnt % 10 == 0 && cnt != 0)  
                        System.out.println(i);  
                    else  
                        System.out.print(i + " ");  
                    cnt++;  
                }  
            }  
        }  
  
    }     
  
    public static boolean checkprime(int a)  
    {  
        if(a == 2)  
            return true;  
        else if(a < 2)  
            return false;  
        else  
        {  
            for(int i=2 ; i<Math.sqrt(a)+1 ; i++)  
            {  
                if(a % i == 0)  
                    return false;  
            }  
        }  
        return true;  
    }         
    public static boolean checkPalindrome(int a)  
    {  
        if(a == reverse(a))  
            return true;  
        else  
            return false;  
    }     
    public static int reverse(int a)  
    {  
        int tmp = 0;  
        while(a != 0)  
        {  
            tmp*=10;  
            tmp += a % 10;  
            a /= 10;  
        }  
        return tmp;  
    }  
}  