package hello;

public class Prime100Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] isPrime = new boolean[100];
		for (int i=2;i<isPrime.length;i++)
		{
			isPrime[i]=true;
		}
		for (int i=2;i<isPrime.length;i++)
		{
			if(isPrime[i]==true)
			{
				int number = 99/i;
				for (int j=2;j<=number;j++)
				{
					isPrime[i*j]=false;
				}
			}
		}
		for (int k=2;k<isPrime.length;k++)
		{
			if(isPrime[k]==true)
			{
				System.out.println(k);
			}
		}
	}

}
