import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        String color = input.next();
        Boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setFilled(filled);
		triangle.setColor(color);
        System.out.println(triangle.toString());
        System.out.printf("The area is ");
        System.out.println(triangle.getArea());
        System.out.printf("The perimeter is ");
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getColor());
        System.out.println(triangle.isFilled());
    }
}



class GeometricObject
{

	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color , boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}

	public String getColor()
	{
		return color;
	}

	public boolean isFilled()
	{
		return filled;
	}

	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
}


class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	public Triangle()
	{

	}

	public Triangle(double side1 , double side2 , double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double setSide1()
	{
		return side1;
	}
	public double setSide2()
	{
		return side2;
	}

	public double setSide3()
	{
		return side3;
	}

	public void setSide1(double side1)
	{
		this.side1 = side1;
	}

	public void setSide2(double side1)
	{
		this.side2 = side2;
	}
	public void setSide3(double side1)
	{
		this.side3 = side3;
	}

	public double getArea()
	{
		double tmp = getPerimeter() / 2;
		return Math.sqrt(tmp * (tmp-side1) * (tmp-side2) * (tmp-side3));
	}

	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}


	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
