/* 3.1 PROGRAM TO DIPSLAY STUDENTS DETAILS USING CLASS & OBJECTS */ 


class stud_details
{
	private String name=" ";
	private int roll_no;
	private int sub1,sub2,total;
	private float per;
	
	void data()
	{
	roll_no=101;
	name="KD";
	sub1=18;
	sub2=20;
	total=sub1+sub2;
	per=(total/100)*40;
	}

	void display()
	{
	System.out.println("Roll No.: "+roll_no);
	System.out.println("Name : "+name);
	System.out.println("Marks in Subject1 : "+sub1);
	System.out.println("Marks in Subject2 : "+sub2);
	System.out.println("Total Marks : "+total);
	System.out.println("Percentage Secured : "+per);
	}
}

class student
{
	public static void main(String args[])
	{
	stud obj=new stud();
	obj.data();
	obj.display();
	}
}
