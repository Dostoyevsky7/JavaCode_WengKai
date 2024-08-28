package hello;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		int input;
		do
		{
			input = in.nextInt();
			n = n+1;
			sum = sum+input;
		}while(input!=-1);
		if (n>1)
		{
			double average = (sum+1)/(n-1);
		System.out.print("the average of "+(n-1)+" numbers is "+average);
		}
	}

}
