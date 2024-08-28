package dome;
import java.util.ArrayList;
public class DataBase {
//	private ArrayList<CD>CDlist = new ArrayList<CD>();
//	private ArrayList<DVD>DVDlist = new ArrayList<DVD>();
//  改进后的：
	private ArrayList<Item>Itemlist = new ArrayList<Item>();
	
//	public void addCD(CD cd) {
//		CDlist.add(cd);
//	}
//	public void addDVD(DVD dvd) {
//		DVDlist.add(dvd);
//	}
//  改进后的：
	public void add(Item item) {
		Itemlist.add(item);
	}
	
//	public void listCD() {
//		for(CD cd:CDlist) {
//			System.out.println(cd.value());
//		}
//	}
//	public void listDVD() {
//		for(DVD dvd:DVDlist) {
//			System.out.println(dvd.value());
//		}
//	}
//改进后的：
	public void listItem() {
		for(Item item:Itemlist) {
			System.out.println(item.value());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase db = new DataBase();
		CD cd1 = new CD("Definitely Maybe","Oasis",5,107,"great");
		db.add(cd1);
		db.listItem();
		DVD dvd1 = new DVD("Opera", "Nora Jones", "comedy", 134, "great");
		db.add(dvd1);
		db.listItem();
		dvd1.print();
		VideoGame vg = new VideoGame("MineCraft",300, "great", 600);
		db.add(vg);
		db.listItem();
	}

}

/*
 * 现在的情况是有一个类DataBase，它的类下面有一个对象Item
 * Item管着CD和DVD，即CD和DVD继承了Item
 * 但是DataBase不认识CD和DVD了，只认识Item
 * 因为DataBase只认识Item，而且DataBase对Item的认识中，Item需要有value()函数
 * 所以，只要在Item类里有value()这个函数就行，CD和DVD中有没有value()的规定没关系
 * 例如，把CD中的value()注释掉，db.list()输出结果如下：
 * Item is printing
 * Item is printing
 * comedy:Opera
 * 说明：CD和DVD“继承”的意思是获得Item（父类）拥有的一切
 * 在此基础上，进行覆盖(比如DVD有value()，就覆写了原本Item的value()。)
 * 比如说，在for循环里声明变量是Item，如果在运行的时候接收到的是CD，那就用CD.value()
 * 这就不局限于声明变量，而是动态变量
 * 子类和父类中存在名称一样、参数一样的函数，就构成覆盖关系
 * 调用父类中存在覆盖关系的函数时，会调用变量当时多管理的对象所属的类的函数
 * 并不需要判断变量类型，只要输入Item.value()对应的函数就会被调用出来
 */
