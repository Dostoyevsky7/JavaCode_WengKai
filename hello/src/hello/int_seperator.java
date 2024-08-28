package hello;
import java.util.Scanner;
public class int_seperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		//
		int a = 1;
		int digit = 0;
		int n;
		int number = in.nextInt();
		while ((int)(number/(Math.pow(10, a)))> 0)
		{
			a = a+1;
			digit = digit+1;
		}
		int p = a-1;
		do
		{
			n = (int)(number/(Math.pow(10, p)));
			System.out.println(n%10);
			p = p-1;
		}while(p>=0);
	}

}
