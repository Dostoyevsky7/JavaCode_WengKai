package hello;
import java.util.Scanner;
public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		int a = 0;
		int digit = 0;
		// start the project
		int n = in.nextInt();
		do
		{
			a = a+1;
			digit = digit+1;
		}while ((int)(n/(Math.pow(10, a)))> 0);//do while循环在while句后有分号！
		System.out.print("the number of digit is "+digit);
	}
}
/*while循环：先检验条件，满足了再执行操作；
do while循环：先进入循环体操作一次，判断条件是否符合，不符合跳出循环，符合了进行下一轮循环*/