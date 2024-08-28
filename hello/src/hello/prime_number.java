package hello;
import java.util.Scanner;
public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		//
		int number = in.nextInt();
		int a = 2;
		int test;
		do
		{
			test = number/a;
			a++;
		}while(test*a!=number);
		if (a==number)
		{
			System.out.print(number+" is a prime number");
		}
		else
		{
			System.out.print(number+" is not a prime number");
		}
	}

}
