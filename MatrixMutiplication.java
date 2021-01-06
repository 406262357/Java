import java.util.*;            
import java.lang.*;   
import java.math.*;            
      
public class MatrixMutiplication         
{            
    public static void main(String[] args)             
    {            
        Scanner input = new Scanner(System.in);  
        while(input.hasNext())  
        {  
            int num = input.nextInt();  
            for(int i=0 ; i<num ; i++)  
            {  
                int a,b;  
                a = input.nextInt();  
                b = input.nextInt();  
                int[][] matrix1 = new int[a+5][b+5];  
                for(int q=0 ; q<a ; q++)  
                {  
                    for(int w=0 ; w<b ; w++)  
                    {  
                        matrix1[q][w] = input.nextInt();      
                    }  
                }  
                int c,d;  
                c = input.nextInt();  
                d = input.nextInt();  
                int[][] matrix2 = new int[c+5][d+5];  
                for(int q=0 ; q<c ; q++)  
                {  
                    for(int w=0 ; w<d ; w++)  
                    {  
                        matrix2[q][w] = input.nextInt();  
                    }  
                }  
                int[][] ans = new int[a+5][d+5];  
                for(int t=0 ; t<a ; t++)  
                {  
                    for(int q=0 ; q<d ; q++)  
                    {  
                        for(int e=0 ; e<c ; e++)  
                        {  
                            ans[t][q] = ans[t][q] + matrix1[t][e] * matrix2[e][q];  
                        }  
                    }  
                }  
                for(int q=0 ; q<a ; q++)  
                {  
                    for(int w=0 ; w<d ; w++)  
                    {  
                        if(w != d-1)   
                        {  
                            System.out.print(ans[q][w] + " ");  
                        }  
                        else  
                        {  
                            System.out.print(ans[q][w]);  
                        }  
                    }  
                    System.out.println();  
                }  
                if(i != num-1)  
                    System.out.println();  
            }         
        }  
    }  
}  