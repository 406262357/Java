import java.util.*;

public class qwe
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {
            double a = input.nextDouble();
            double b = input.nextDouble();
            Complex one = new Complex(a,b);
            a = input.nextDouble();
            b = input.nextDouble();
            Complex two = new Complex(a,b);
        }    
    }
}

class Complex
{
    private double a;
    private double b;
    public class Complex()
    {
        this.a = 0;
        this.b = 0;
    }
    public class Complex(double a , double b)
    {
        this.a = a;
        this.b = b;
    }

    public double sum(complex a , complex b)
    {

    }
}