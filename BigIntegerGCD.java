import java.util.*;            
import java.lang.*;   
import java.math.*;            
      
public class BigIntegerGCD         
{            
    public static void main(String[] args)             
    {            
        Scanner input = new Scanner(System.in);   
        while(input.hasNext())  
        {  
            String s = input.next();  
            BigInteger a = new BigInteger(s);  
            s = input.next();  
            BigInteger b = new BigInteger(s);  
            BigInteger gcd = a.gcd(b);  
            BigInteger lcm = a.multiply(b);  
            lcm = lcm.divide(gcd);  
            System.out.println(gcd + " " + lcm);   
            int cnt = 0;  
            while(cnt<5)  
            {  
                BigInteger next = lcm.nextProbablePrime();  
                if(cnt != 4)  
                    System.out.print(next + " ");  
                else  
                    System.out.println(next);  
                cnt++;  
                lcm = next;  
            }  
        }  
    }               
}  