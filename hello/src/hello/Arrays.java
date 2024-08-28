package hello;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		//create an array
		int[] numbers = new int[5];
		/*
		 * the type of elements is fixed
		 * new:初始化；创建一个新的数组
		 * the amount of the array must be given
		 * an array cannot change its amount大小不变
		 * array的下标不含有-1或负数，从0开始递增
		 */
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=in.nextInt();
		}
		System.out.print(numbers); //print out "[I@1794d431"
		
		//another way to create an array跳过new初始化直接赋值
		int[] a = {1,3,5,7,9};
		int[] b = a;
		b[2] = 6;
		System.out.print(a[2]);
		/*
		 * 当赋值int[]b=a的时候，相当于赋予a和b管理同一个数组的权限
		 * 所以更改b[2]相当于更改了数组，因此a[2]也改变
		 * a和b拥有数组的管理权限，而不是拥有权限，和基本变量的赋值不一样
		 * 因此在检验两个数组是否相等时，检验的是他们是否拥有同一个数组的管理权限，而非内容是否相同
		 */
		int[] c = {1,3,6,7,9};
		System.out.print(a==b); //true
		System.out.print(a==c); //false
		//创建一个数值一样但是不同（权限不同）的数组：循环复制黏贴
		int[] d = new int[a.length];
		for(int j=0;j<a.length;j++)
		{
			d[j] = a[j];
		}
	}

}
