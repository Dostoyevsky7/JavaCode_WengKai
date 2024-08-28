package hello;
import java.util.Scanner;
public class Prime5oArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] prime = new int[50];
		prime[0]=2;
		int pnumber = 1;
		int number;
		boolean isPrime=true;
		for(number=3;pnumber<50;number++,isPrime=true)
		{
			for(int i=0;i<pnumber;i++)
			{
				if(number%prime[i]==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime==true)
			{
				prime[pnumber]=number;
				pnumber++;
			}
		}
		for(int j=0;j<50;j++)
		{
			System.out.println(prime[j]);
		}
		
	}

}
