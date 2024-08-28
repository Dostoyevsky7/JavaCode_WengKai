package VendingMachine;
import java.util.Scanner;
//接下来是创建类的过程，规定vendingmachine这个类应该有哪些变量和操作
public class vendingmachine {
	int price=15;
	int balance=0;
	int total;
	
	void setPrice(int price)
	{
		this.price = price;
		/*
		 * 在此处我想通过用户输入来规定price,但是price = price是没用的
		 * 因为在这个大括号里面，price都仅仅指向用户输入的那个函数内部的price变量（即本地变量）
		 * 不会指向外面那个price=80的本地变量
		 * 而this指的是“这个对象”,比如vm.showBalance()的时候
		 * this指的就是这次用到的vm这个对象
		 * 比如，如果我有vm.showBalance()和vm1.showBalance()
		 * 它要如何知道show balance到底是展示谁的balance呢？
		 * 靠this来建立起本次对象(vm或者vm1)和函数showBalance()的关系
		 * 让showBalance()里面的balance本地变量=vm(或者vm1)建立的成员变量balance
			 * 关于成员变量和本地变量：
			 * 成员变量是在函数之外的，在函数里面规定的变量则是本地变量，本地变量离开了函数的大括号就不存在了
			 * 成员变量的作用域从对象建立的时候开始
			 * 而不是类的里面开始！因为类只是制定规则，具体的对象才产生具体的成员变量
			 * 本地变量的作用域从函数大括号开始，大括号结束
		 * 因此在这里，使用this.price = price
		 * 意思是让这个对象里面的成员变量price=setPrice()规定的本地变量price
		 */
		System.out.println("price is: "+price);
		showBalance();
		//在一个函数内部召唤其他的函数不需要this.shwBalance()因为this会传递下去
	}
	
	void showPrompt()
	{
		System.out.println("Welcome.Please put in money:");
	}
	
	void insertMoney(int amount)
	{
		balance = balance + amount;
	}
	
	void showBalance()
	{
		System.out.println("your balance now:"+balance);
	}
	
	void giveFood()
	{
		if(balance>=price)
		{
			System.out.println("This is your food.");
			balance-=price;
			total+=price;
		}
	}
	
	vendingmachine()
	{
		total = 0;
	}
	vendingmachine(int price)
	{
		this(); //使用this()可以调用没有参数的vendingmachine()
		//但是这个this()只能在构造函数里出现，只能是这个构造函数的第一句，只能使用一次
		this.price = price;
	}
	/*
	 * vendingmachine()是一个“构造函数”
	 * 构造函数指的是名称和类名称一样的函数
	 * 构造函数的作用：在一个对象被创建的时候，会立即执行构造函数
	 * vendingmachine()和vendingmachine(int price)互相为重载关系
	 * 重载指的是名称一样，但是参数类型不一样
	 * vendingmachine()没有参数，vendingmachine(int price)需要输入
	 * 在创建vm之后，程序进行的顺序：
	 * new vm --> 构造函数vendingmachine() --> 调到外面，执行int price=15;
	   --> int balance=0 --> int total --> 进入构造函数里面，total=0 -->
	   交给vm管理，然后执行下面的int p = in.nextInt();
		int p = in.nextInt() --> vm.setPrice(p)等等
	 * 在vendingmachine vm = new vendingmachine()语句中，会自行判断没有输入
	 * 所以调用vendingmachine()这个构造函数
	 * vendingmachine vm1 = new vendingmachine(35)有输入
	 * 调用vendingmachine(int price)这个构造函数
	 */
	
	//创建完vendingmachine这个类，就可以用类来创建对象
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		vendingmachine vm = new vendingmachine(); //创建一个叫vm的对象
		int p = in.nextInt();
		vm.setPrice(p);
		vm.showPrompt();
		int m = in.nextInt();
		vm.insertMoney(m); //调用函数(?)
		vm.showBalance();
		vm.giveFood();
		vm.showBalance();
		//创建另一个对象vm1
		vendingmachine vm1 = new vendingmachine(35);
		vm1.showPrompt();
		int n = in.nextInt();
		vm1.insertMoney(n);
		vm1.showBalance();
		vm1.giveFood();
		vm1.showBalance();
	}

}
