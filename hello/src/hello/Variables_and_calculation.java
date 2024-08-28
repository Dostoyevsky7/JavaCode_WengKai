package hello;
import java.util.Scanner;
public class Variables_and_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter your price");
		// println()指的是自动换行，print就不会自动换行
		int price = in.nextInt();
		// in.nextInt指读取下一个遇到的整数
		// ‘变量类型 变量名’来创造变量，变量类型无法更改
		System.out.println("enter your money");
		int amount = in.nextInt();
		System.out.println(amount + "-" + price + "=" + (amount-price));
		// 在java中，int+string是语法正确的，但是结果是一个string
		// 所以如果后面(amount-price)不加括号，那就输出"100-20=100-20"
	}

}
