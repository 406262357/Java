import java.util.*;            
import java.lang.*;            
      
public class MagicSquare         
{            
    public static void main(String[] args)             
    {            
        Scanner input = new Scanner(System.in);   
        int[][] matrix = new int[105][105];    
        int first = 0;         
        while(input.hasNext())  
        {  
            if(first == 1)  
                System.out.println();  
            first = 1;  
            int num = input.nextInt();  
            if(num % 2 == 0)  
            {  
                System.out.println("It is not an odd number.");  
                continue;  
            }  
            else  
            {  
                matrix[num-1][((num+1)/2)-1] = 1;  
                for(int cnt=2 , i=num-1 , j=((num+1)/2)-1; cnt<=num*num ; cnt++)  
                {  
                    if(cnt % num != 1)  
                    {  
                        i++;  
                        j++;  
                        if(i == num)  
                            i=0;  
                        if(j == num)  
                            j=0;  
                        matrix[i][j] = cnt;  
                    }  
                    else  
                    {  
                        i--;  
                        if(i == -1)  
                        {  
                            i=num-1;  
                        }  
                        matrix[i][j] = cnt;  
                    }  
                }  
                int sum = num * ((num*num)+1) / 2;  
                System.out.println(sum);  
                for(int i=0 ; i<num ; i++)  
                {  
                    for(int j=0 ; j<num ; j++)  
                    {  
                        System.out.printf("%5d",matrix[i][j]);  
                    }  
                    System.out.println();  
                }  
  
            }  
        }  
    }               
}  