import java.util.*;        
import java.lang.*;        
        
public class Prime 
{        
    public static void main(String[] args)         
    {        
        Scanner input = new Scanner(System.in);        
        int num = 0;  
        while(input.hasNextInt())  
        {      
            num = input.nextInt();  
            int tmp = num;        
            int check = 0;        
            for(int i=2 ; i<=num ; i++)        
            {        
                if(tmp % i == 0)        
                {        
                    tmp /= i;        
                    if(check == 0)        
                    {        
                        System.out.print(i);        
                    }        
                    else        
                    {        
                        System.out.print(" " + i);         
                    }        
                    check = 1;        
                    i--;        
                }        
            }        
            System.out.println();   
        }       
    }        
}  