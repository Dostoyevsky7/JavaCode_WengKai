package hello;
import java.util.Scanner;
public class coins_allconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		//
		double number = in.nextDouble();
		int a=0;
		int b=0;
		int c=0;
		for (a=0;a<=(number/0.5);a++)
		{
			Loop: //loop标记它接下来的这个循环，因此break loop就可以直接跳出整个这个循环，否则单加break只能跳出它上面那个for
			for (b=0;b<=(number/0.2);b++)
			{
				for (c=0;c<=(number/0.1);c++)
				{
					if (a*0.5+b*0.2+c*0.1 == number)
					{
						System.out.println(a+"张5角，"+b+"张2角，"+c+"张1角");
						break Loop;
					}
				}
			}
		}
	}

}
