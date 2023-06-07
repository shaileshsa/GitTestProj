// * 2.3 PROGRAM REVERSE THE GIVEN 3 DIGITS*/
class reversedigits
{
	public static void main(String args[])
	{
		int num , temp ; 
		num = 123;
		System.out.println(" The Number is : "+num);
		
		System.out.print(" The Reverse Number is : ");
		do
		{
			temp = num % 10 ;
			System.out.print(temp);
			num = num / 10 ;
		}
		while (num != 0) ;
	
	}
}