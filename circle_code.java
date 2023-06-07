//* 3.2 PROGRAM TO CALCULATE THE AREA OF CIRCLE*/


class circle_code
{
	private int r=12;
	private double pi=3.14;
	private double area;

	void cal()
	{
	area=pi*r*r;
	}

	void display()
	{
	System.out.println("Radius of Circle : "+r);
	System.out.println("Area : "+area);
	}
}

class circle
{
	public static void main(String args[])
	{
	circle_code obj=new circle_code();
	obj.cal();
	obj.display();
	}
}