package hello;
import java.util.Scanner;
public class SumFunction {
	public static void sum(int a, int b)
	//此处void指的是这个函数不返回任何值
	{
		int sum = 0;
		int i;
		for(i=a;i<=b;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void swap(int a,int b)
	{
		int store=a;
		a = b;
		b = store;
		System.out.println(a);
		System.out.println(b);
	}
	//要返回值的函数如何设计
	public static int max(int a,int b)
	{
		int max=0;
		if(a>b)
		{
			max = a;
		}
		else if(a<b)
		{
			max = b;
		}
		return max;
	}
	//要返回值的函数在public static处就应该声明返回的类型，并且应该有return
	//return结束函数，所以每个函数最好只有一个return出口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		sum(a,b);
		System.out.println(max(a,b));
		swap(a,b);
		System.out.print(a+"and"+b);
		/*
		 * 在最后一步中可以看到，函数swap并没有改变输入的a和b的值
		 * 向函数输入的只是值，而不是那个变量！
		 */
	}

}
