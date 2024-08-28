package dome;

public class Item {
	/*
	 * 由于CD和DVD两个类下面的对象也很相似，想要把共同的对象放入Item中
	 * 但如果代码是private String title;
	 * 那么CD和DVD就无法访问到
	 * 因为即使是继承，但是private也不允许子类更改
	 * 所以一种是换成：
	 * protected String title;
	 * protected可以保护变量不被其他无关的类影响，但是子类可以访问和改变
	 * 另一种方法如下，它更好地揭示了继承的内在顺序：
	 */
	private String title;
	private int time;
	private String comment;
	public Item(String title,int time, String comment) {
		super();
		this.title = title;
		this.time = time;
		this.comment = comment;
	}
	public Item() {
		/*
		 * 因为DVD在报错，所以加上一个没有参数的构造器Item()
		 * 这是重载，复习！
		 * 这下DVD不报错了
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String value() {
		// TODO Auto-generated method stub
		return "Item is printing: ";
	}

}
