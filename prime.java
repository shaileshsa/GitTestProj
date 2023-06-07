class prime
{
	public static void main(String args[])
	{
	int i,num=1,n=20;

	System.out.println("Value of N : "+n);

	while(num<=n)
	{
	i=2;
        		while(i<=num)
		{
		if(num%i==0)
		break;
		i++;
		}

		if(i==num)
		System.out.println(num+"  is Prime");
		num++;
		}
	}
}