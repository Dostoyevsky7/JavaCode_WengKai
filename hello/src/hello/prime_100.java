package hello;

public class prime_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int n;
		int a;
		for (n=1;n<=100;n++)
		{
			for (a=1;a<=n;a++)
			{
				if ((n%a == 0)&(a>1)&(a<n))
				{
					break;
				}
				else if (a == n)
				{
					System.out.println(n);
				}
			}
		}
			
	}

}
