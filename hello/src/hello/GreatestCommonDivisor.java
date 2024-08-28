package hello;
import java.util.Scanner;
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		//
		int a = in.nextInt();
		int b = in.nextInt();
		int max = 0;
		int divisor=1;
		if(a<b)
		{
			max=a;
		}
		else if(a>b)
		{
			max=b;
		}
		for(int i=2;i<max;i++)
		{
			if((a%i==0)&&(b%i==0))
			{
				divisor=i;
			}
		}
		System.out.print(divisor);
	}

}
