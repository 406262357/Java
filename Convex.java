import java.util.*;  
import java.math.*;  
public class Convex
{  
    public static void main(String[] args)   
    {  
        Scanner input = new Scanner(System.in);  
        boolean flag = false;  
        while(input.hasNext())  
        {  
            if(flag)  
                System.out.println();  
            flag = true;  
            int time = input.nextInt();  
            double[] x = new double[time];  
            double[] y = new double[time];  
            double[] side = new double[time];  
            double ans = 0;  
            for(int i=0 ; i<time ; i++)  
            {  
                x[i] = input.nextDouble();  
                y[i] = input.nextDouble();  
            }  
            for(int i=0 ; i<time ; i++)  
            {  
                if(i == time-1)  
                {  
                    ans += (x[i]*y[0]-x[0]*y[i]);  
                }  
                else  
                {  
                    ans += (x[i]*y[i+1]-x[i+1]*y[i]);  
                }  
            }  
            ans /= 2;  
            System.out.printf("%.3f\n",Math.abs(ans));  
        }      
    }  
}  