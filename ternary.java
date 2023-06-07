class ternary
{
	public static void main(String args[])
	{
	int a=3,b=7,c=0;
	int result;
	result=(a>b ? a:b)>c ? (a>b ? a:b) : c;
	System.out.println("The Greatest no among "+a+","+b+","+c+" is "+result);
	}
}
