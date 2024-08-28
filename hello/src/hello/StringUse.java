package hello;
import java.util.Scanner;
public class StringUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		/*
		 * String是一个类，不是像int一样的普通变量
		 * 规定String的时候要使用new来初始化（类似array）
		 */
		String s = new String("Hello");
		String t = "a string"; //直接赋值
		System.out.println(s+" this is "+t);
		
		//how to input a string
		String r;
		String rl;
		r = in.next(); //in.next读取下一个单词，以空格为分隔符
		rl = in.nextLine(); //in.nextline读取下一行
		System.out.println(r);
		System.out.println(rl);
		
		//string和array一样是管理者，因此==检查的是是否管理着同一个字符串
		System.out.println(s=="Hello"); //false
		System.out.println(s.equals("Hello")); //true
		//只有.equals才表示内容是否相同
		
		//比较两个string的大小
		String s1 = "abc";
		String s2 = "abd";
		System.out.println(s1.compareTo(s2));
		//1表示s1>s2,-1表示s2>s1,0表示相等
		
		//获得string的长度
		int l1 = s1.length(); //与array不同，.length()加括号！
		//因为length()是个函数，但是array的length是个内在属性
		System.out.println(l1);
		
		//读取/substring
		System.out.println(s.charAt(0));//index从0开始
		String sub1 = s.substring(2);//从2到最后
		System.out.println(sub1);
		String sub2 = s.substring(2,4);//[2,4)，不包含4
		
		//在字符串中寻找字符串
		String fs = "ABSDKD10387";
		System.out.println(fs.indexOf('B'));
		System.out.println(fs.indexOf("DKD"));//返回第一个D位置
		System.out.println(fs.indexOf('D',4));//从index=4开始寻找(包括4)
		
		//对字符串的操作都不能直接修改字符串原本的值
		fs = fs.toLowerCase();//只有这样赋值回去才可以，fs.toLowerCase()本身是不能改变fs的值的
		System.out.println(fs);
	}

}
