package hello;

public class PackageUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int是单个数据的类型，Interger是一个package;
		 * boolean是数据类型，Boolean是一个package;
		 * 首字母大写是对应的package
		 * package可以直接赋值，也可以提供一些“服务”
		 */
		Integer k = 10; //可以对package直接赋值
		System.out.println(Integer.MAX_VALUE);//32bit能表示的max
		System.out.println(Character.isDigit('1'));
		//检验是否是数字!这是处理文本的能力
		System.out.println(Character.isLowerCase('a'));
		//检验是否是小写
		System.out.println(Character.toLowerCase('A'));
		//转换为小写
	}

}
