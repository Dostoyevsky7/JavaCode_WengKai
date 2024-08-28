package hello;
import java.util.Scanner;
public class coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		//
		double number = in.nextDouble();
		int a=0;
		int b=0;
		int c=0;
		while(a*0.5<number)
		{
			a++;
		}
		a-=1;
		number -= a*0.5;
		if(number==0)
		{
			System.out.print(a+"张5角");
		}
		else if(number!=0)
		{
			while(b*0.2<number)
			{
				b++;
			}
			b-=1;
			number -= b*0.2;
			if(number==0)
			{
				System.out.print(a+"张5角，"+b+"张2角");
			}
			else if(number !=0)
			{
				while(c*0.1<number)
				{
					c++;
				}
				c-=1;
				System.out.print(a+"张5角，"+b+"张2角，"+c+"张1角");
			}
		}
	}

}
