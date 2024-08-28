package hello;
import java.util.Scanner;
public class Sumup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		//
		int n = in.nextInt();
		int i;
		double sum = 0;
		for (i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum -= 1.0/i;
			}
			else if(i%2!=0)
			{
				sum += 1.0/i;
			}
		}
		System.out.printf("%.2f",sum); //"%.2f"可以四舍五入保留两位小数
	}

}
