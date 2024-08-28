package clock;

public class Display {
	private int limit = 0;
	private int value = 0;
	/*
	 * private只能用于成员变量或成员函数
	 * private意思是这个变量/函数只能在这个类里面访问
	 * 比如在Clock类里面的对象就无法使用minute.value
	 * 起到保护变量、防止被随意更改的作用
	 * 但是private是针对类而不是对象！
	 * 也就是说，如果再创建一个Display的对象，是可以访问d.value的
	 * 成员变量应该是private，除非有很好的理由
	 * public则是谁都可以访问
	 * 如果在成员前面没有加public或者private限定，那么是"friendly"
	 * 同一个包(package)的其他类可以访问它
	 * 一个类(class)如果是public，那么任何人都可以用这个类来定义变量
	 * 如果类是public,那这个类必须在一个源代码文件里，并且文件名与类名相同
	 * 一个源代码文件(.java文件)是一个编译单元(compilation unit)
	 * 意思是编译的时候一次对一个编译单元进行编译
	 * 一个编译单元里可以有很多java类
	 * 当一个单元里有多个类的时候，只有一个类可以是public，可以全都不是
	 * (因为每一个public class都要在自己的文件里)
	 * 如果一个class前面没有public，只能在这个包里面使用
	 * 如果想要在别的包里使用它，就import(如import display（包）.Display（类）)
	 * 如果不再开头import,那么在使用到这个类的时候都要给出全名如display.Display
	 * 有一个包叫clock,当我在java project下新建一个包叫clock.learn
	 * clock.learn的位置不是和clock并列,而是在clock包下面有一个包clock.learn
	 */
	
	public Display(int limit)
	{
		this.limit = limit;
	}
	
	public void increase()
	{
		value ++;
		if(value==limit) {
			value = 0;
		}
	}
	
	public int show() {
		return(value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display(24);
		while(true) {
			d.increase();
			System.out.println(d.show());
		}
	}

}

/*
 * static的意思是“静态的”
 * static可以用于变量，也可以用于函数
 * static用于变量时，这个变量是类变量:变量不属于对象，而属于这个类！
 * 即这个变量是这个类自带的，并且在类被规定的时候就已经初始化了
 * 对比成员变量：在对象被定义之后，成员变量才被初始化
 * 所有这个类定义的对象都共同拥有这个类变量
 * 比如我在Display这个类规定了static int s = 1;
 * d1.s = 2,输出d2.s结果也等于2,尽管d1和d2是不同的两个对象
 * 
 * 同理，static是类函数，属于类而不属于任何对象
 * 可以在类函数里访问别的类函数，也可以通过对象来访问类函数
 * 但是类函数只能访问类变量，无法访问成员变量
 * 因为类函数属于类，无法和任何'对象-specific'的变量/函数挂钩
*/
