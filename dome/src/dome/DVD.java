package dome;

public class DVD extends Item{
	private String title;
	private String director;
	private String type;
//	private int time;
//	private String comment;
	//魔法：使用Source-Generate constructor using field
	public DVD(String title, String director, String type, int time, String comment) {
		super(title,time,comment);
		/*
		 * 这个super()一开始报错就是因为它想要去父类访问一个没有参数的构造器
		 * 但是Item那里只有一个构造器，用来构造title
		 * 那个构造器有参数，参数是title
		 * 所以它认为找不到，报错啦
		 * 把这一行的super()删掉，还是报错，因为eclipse默认会有一个没有参数的构造器的
		 */
		this.title = title; //这里的title是DVD(子类)的title，而不是父类
		this.director = director;
		this.type = type;
//		this.time = time;
//		this.comment = comment;
	}

	public String value() {
		return type+":"+title;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD d = new DVD("crime and punishment","Dostoyevsky","thriller",1200,"incredible");
		d.print();
	}
	
	public void print() {
		System.out.println("title:");
		System.out.println(super.value());
		System.out.println(value());
	}
	/*
	 * 在这个例子中，出现了一个问题
	 * 父类Item有value()函数，子类DVD也有value()函数
	 * 当在新定义的print()函数里面用到value()的时候，会调用父类的还是子类的？
	 * 子类的。（“就近原则”：子类的value()离print()近）
	 * 但是super.value()就可以帮它调用父类的
	 * 这个变量名类似：
	 * 有同名变量title的时候，this.title指的是子类的title而不是父类的
	 */
}
