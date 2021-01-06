import java.util.*;  
import java.lang.*;  
import java.awt.geom.*;  
import java.math.*;  
public class DemoTriangle
{  
    public static void main(String[] args)   
    {  
        Scanner input = new Scanner(System.in);  
        int time = input.nextInt();  
        for(int i=0 ; i<time ; i++)  
        {  
            double x1 = input.nextDouble();  
            double y1 = input.nextDouble();  
            Point2D point1 = new Point2D.Double(x1,y1);  
            double x2 = input.nextDouble();  
            double y2 = input.nextDouble();  
            Point2D point2 = new Point2D.Double(x2,y2);  
            double x3 = input.nextDouble();  
            double y3 = input.nextDouble();  
            Point2D point3 = new Point2D.Double(x3,y3);  
            if((x1-x2)/(y1-y2) == (x2-x3)/(y2-y3))  
            {  
                System.out.println("Just Line!");  
                continue;  
            }  
  
            Triangle triangle = new Triangle(point1,point2,point3);  
            triangle.setSide1();  
            triangle.setSide2();  
            triangle.setSide3();  
            double side1 = triangle.getSide1();  
            double side2 = triangle.getSide2();  
            double side3 = triangle.getSide3();  
            for(int q=0 ; q<2 ; q++)  
            {  
                if(side1 > side2)  
                {  
                    double tmp = side1;  
                    side1 = side2;  
                    side2 = tmp;  
                }  
                if(side2 > side3)  
                {  
                    double tmp = side2;  
                    side2 = side3;  
                    side3 = tmp;  
                }  
            }  
  
            System.out.printf("%.3f %.3f %.3f ",side1,side2,side3);  
            System.out.printf("%.3f\n",triangle.getArea());  
        }  
    }  
}  
  
  
class Triangle  
{  
    private Point2D point1;  
    private Point2D point2;  
    private Point2D point3;  
    private double side1;  
    private double side2;  
    private double side3;  
    public Triangle(Point2D point1 , Point2D point2 , Point2D point3)  
    {  
        this.point1 = point1;  
        this.point2 = point2;  
        this.point3 = point3;  
    }  
    public double getSide1()  
    {  
        return point1.distance(point2);  
    }  
  
    public double getSide2()  
    {  
        return point2.distance(point3);  
    }  
    public double getSide3()  
    {  
        return point3.distance(point1);  
    }  
    public double getS()  
    {  
        return (side1 + side2 + side3)/2;  
    }  
    public void setSide1()  
    {  
        this.side1 = point1.distance(point2);  
    }  
    public void setSide2()  
    {  
        this.side2 = point2.distance(point3);  
    }  
    public void setSide3()  
    {  
        this.side3 = point3.distance(point1);  
    }  
  
    public double getArea()  
    {  
        double s = (side1 + side2 + side3) / 2;  
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));  
    }  
}  