package hello;
import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		//a switch-case 
		int type = in.nextInt();
		switch (type) //switch(type)只能接受type是个正整数
		{
		case 1: //case1指的是type=1
			System.out.print("hi");
			break; //break使跳出这个switch-case！没有break就无法结束
		case 2: 
			System.out.print("hello");
			break;
		case 3: 
			System.out.print("bye");
			break;
		default: 
			System.out.print("jibber-jabber");
			break;
		}
		
	}

}
