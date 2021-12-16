package cslab;

abstract class shape
{
	abstract void numberOfSides();
}
class rectangle extends shape
{
	void numberOfSides() 
	{
	System.out.println("I am Rectangle , I have 4 sides!\n");
	}
}
class triangle extends shape
{
	void numberOfSides() 
	{
		System.out.println("I am Triangle , I have 3 sides!\n");

	}
}
class Hexagon extends shape
{
	void numberOfSides() 
	{
		System.out.println("I am Hexagon , I have 6 sides!");

	}
}
public class abstractdemo{
	public static void main(String[] args)
	{
		rectangle ob= new rectangle();
		ob.numberOfSides();
		triangle ob1=new triangle();
		ob1.numberOfSides();
		Hexagon ob2=new Hexagon();
		ob2.numberOfSides();
	}
}
