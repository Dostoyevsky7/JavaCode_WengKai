package hello;
import java.util.Scanner;
public class float_and_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("enter your foot");
		int foot = in.nextInt();
		System.out.print("enter your inch");
		int inch = in.nextInt();
		System.out.println((foot+inch/12)*0.3048);
		/* "foot+inch/12"用整数除以整数，java认为结果是一个整数
		如果是"fott+inch/12.0"那计算结果就是float */
		double inch_correct = in.nextInt();
		//double指的是双精度浮点数
		//把一个int存在一个double变量里面没有问题，输入9结果是9.0
		System.out.println((foot+inch_correct/12)*0.3048);
		System.out.println((int)((foot+inch_correct/12)*0.3048));
		//(int)的作用是把(int)后面的那个东西的数据类型转换成int；
		//因为想让整个计算结果改变数据类型，所以给整个加上括号
	}

}
