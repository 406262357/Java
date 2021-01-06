import java.util.*;
import java.math.*;
public class test
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean first = false;
        while(true)
        {
            int time = input.nextInt();
            if(time == -1)
                break;
            if(first)
                System.out.println();
            first = true;
            char[][] ch = new char[time][time];
            for(int i=0 ; i<time ; i++)
            {
                for(int q=0 ; q<time ; q++)
                {
                    ch[i][q] = input.next().charAt(0);
                }
            }
            boolean flag = false;
            for(int i=0 ; i<time ; i++)
            {
                for(int q=0 ; q<time ; q++)
                {
                    for(int w=0 ; w<time ; w++)
                    {
                        if(i == q && q == w)
                            continue;
                        if(ch[i][q] == ch[i][w])
                        {
                            flag = true;
                            break;
                        }
                        if(flag)
                            break;
                    }
                    
                }
                if(flag)
                    break;
            }
            for(int i=0 ; i<time ; i++)
            {
                 for(int q=0 ; q<time ; q++)
                {
                    for(int w=0 ; w<time ; w++)
                    {
                        if(i == q && q == w)
                            continue;
                        if(ch[i][q] == ch[w][i])
                        {
                            flag = true;
                            break;
                        }
                    }
                    if(flag)
                        break;
                }
            }
            if(flag)
            {
                System.out.println("The input array is not a Latin square");
            }
            else
            {
                System.out.println("The input array is a Latin square");
            }
        }
    }
}
