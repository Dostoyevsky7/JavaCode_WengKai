package notebook;
import java.util.ArrayList;
public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();
	/*
	 * ArrayList是一个类，是一个容器类
	 * 容器类的意思是用于存放对象
	 * 在定义一个容器类的时候，需要两个变量：容器的类型+元素的类型
	 * ArrayList(容器)+<String>(元素)
	 * 表示用ArrayList储存String，可以储存任意数量
	 */
	
	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s, int index) {
		notes.add(index, s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public boolean removeNote(int index) {
		notes.remove(index);
		return notes.isEmpty();
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
		notes.toArray(a); 
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.add("this is me preying that");
		nb.add("please dont be in love with someone else");
		nb.add("please dont have somebody waiting on you",1);
		String[] a = nb.list();
		System.out.println(a);
		for(String s:a) {
			System.out.println(s);
			s = "q";
			/*
			 * 在这个循环中，一开始for(String s:a)即把字符串s指向a
			 * 相当于s和a[i]共同管理(指向)a里面的字符串
			 * 如果s = "q"，相当于把s指向另一个字符串名为"q"
			 * 所以再次print a打出来还是原来的，并不会变成"q"
			 * 
			 * 除了像int,boolean,double等之类的基本类型
			 * String是一个对象，NoteBook和VendingMachine也都是类
			 * 对象数组也可以使用for each循环
			 * String这里无法使用for each循环是因为：
			 * String类的内容无法更改，所以在此处无法直接赋值改变a里面的值
			 */
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(a);
	}

}
