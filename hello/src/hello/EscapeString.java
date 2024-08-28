package hello;

public class EscapeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//\b表示“回退一格”，但是eclipse不执行，要去terminal
		System.out.println("abc\bd");
		//\t表示“到下一个表格位”，保证对齐
		System.out.println("abc\t123");
		System.out.println("a\t123");
		//\n换行，\r回车，在打字机时代是两个动作，但是现在都表示换行
		System.out.println("a\nb");
		System.out.println("a\rb");
	}

}
