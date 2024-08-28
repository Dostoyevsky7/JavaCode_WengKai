package coins;
import java.util.HashMap;
import java.util.Scanner;
public class Coins {
	private HashMap<Integer, String> coinNames = new HashMap<Integer, String>();
	/*
	 * 一个新的容器，从容器的角度看像HashSet
	 * 其实类似python中的dictionary
	 * 注意！
	 * 在规定HashMap的语句中HashMap<Integer, String>
	 * 尖括号里必须是Integer而不能是Int
	 * 因为这是一个对象，所以里面的也应该是对象Integer，而不是基本变量int
	 * Integer是一个类，包含int
	 */
	public Coins() {
		coinNames.put(1,"penny");
		coinNames.put(10,"dime");
		coinNames.put(25,"quarter");
		coinNames.put(50,"half-dollar");
		coinNames.put(50,"half of one dollar");
		System.out.println(coinNames.size());
		System.out.println(coinNames);
		/*
		 * 当你这样规定的时候，认为size=4，即只有4对key-value
		 * 重复的key会覆盖，key是唯一的！
		 * 而且HsahMap可以直接输出
		 * 结果是{1=half of one dollar, 50=half-dollar, 25=quarter, 10=dime}
		 * 注意到他的顺序是和赋值的顺序相反的
		 */
		//想要遍历整个HashMap，没有直接的办法
		for(Integer k : coinNames.keySet()) { //注意这里也是Integer，因为这里你也在规定类的功能
			System.out.println(coinNames.get(k));
		}
	}
	public String getName(int amount) {
		return coinNames.get(amount);
	}
	public String getNameAdvanced(int amount) {
		if(coinNames.containsKey(amount)) {
			return coinNames.get(amount);
		}
		else {
			return "not found";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coins coin = new Coins();
		System.out.println(coin.getName(amount));
		/*
		 * 如果输入的是15，返回的是null
		 * 因为这个HashMap里面的东西都是对象
		 * 多以返回的一定是这个类的管理者而不是拥有者
		 * 不存在，就返回null
		 */
		System.out.println(coin.getNameAdvanced(amount));
	}

}
