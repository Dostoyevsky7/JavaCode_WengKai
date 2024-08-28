package hello;
import java.util.Scanner;
public class Euclid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		//
		int a = in.nextInt();
		int b = in.nextInt();
		int mod;
		int gcd = 1;
		do
		{
			mod = a%b;
			a=b;
			b=mod;
			gcd = a;
		}while(mod>0);
		System.out.println(gcd);
		System.out.println("long live Euclid");
	}

}
