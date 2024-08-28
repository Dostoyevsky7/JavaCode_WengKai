package hello;
import java.util.Scanner;
public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		int a = 0;
		int digit = 0;
		// start the project
		int n = in.nextInt();
		while ((int)(n/(Math.pow(10, a)))> 0)
		{
			a = a+1;
			digit = digit+1;
		}
		System.out.print("the number of digit is "+digit);
	}
}
