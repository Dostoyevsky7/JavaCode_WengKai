package notebook;
import java.util.HashSet;
public class AboutSet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		s.add("this is a HashSet");
		s.add("hello");
		s.add("i am so sad");
		s.add("hello");
		System.out.println(s);
		/*
		 * HashSet是另外一种容器，就像ArrayList是一种泛型容器一样
		 * HashSet名为集合，具有互异性
		 * HashSet里面没有重复的元素，有重复的就取最后那一次
		 * set并不排序
		 * HashSet可以直接print出来
		 */
	}

}
