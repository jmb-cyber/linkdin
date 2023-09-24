/*
Q30	print fibonacci series (till to 10000)
*/


class Q30
{
	public static void main(String[] args) 
	{
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1+", "+n2+ ", ");
		n3 = n1 + n2;
		while(n3 < 1000)
		{
			System.out.print(n3+ ", ");
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
				
	}
}