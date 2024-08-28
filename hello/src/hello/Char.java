package hello;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'A'; //char中只能含有一个字符
		char b = 'D';
		System.out.print(b-a);//字符做加减运算，是用对应Unicode运算
		char c = (char)69;//69为Unicode,对应E
		System.out.print(c);
		char d = (char)(b+3);//b+3为D后三个，为G
		//char做了加减运算之后的值就是数字，一定记得转换回char
		System.out.print(d);
		char e = (char)(a+'a'-'A');//以此实现大小写转换
		System.out.print(e);
		//在Unicode中,a>A,B>A,汉字>字母
		char f = '\u0041';//直接用Unicode表示，41为16进制，为65(A)
		System.out.print(f);
	}
}
