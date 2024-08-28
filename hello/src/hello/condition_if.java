package hello;

import java.util.Scanner;

public class condition_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		System.out.print("input value x");
		int x = in.nextInt();
		System.out.print("input value y");
		int y = in.nextInt();
		System.out.print("input value z");
		int z = in.nextInt();
		int max;
		if (x>=y)
			{
			max = x;
			}
		else
			{
			max = y;
			}
		if (z>=max)
			{
			max = z;
			}
		System.out.println("mamximum is"+z);
		/*注意：else总是和最近的那个if匹配，有时候这和对齐没有关系
		 * 在if后面总是加上大括号，这样不容易混淆
		 */
		}

}