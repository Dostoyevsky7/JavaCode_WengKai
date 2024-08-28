package clock;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);

	/*
	 * 一个类(Clock)中，他的成员变量可以是别的类(Display)的对象
	 * 同一个类(Display)的不同对象(hour和minute)
	 * 他们的交互可以在一个另外的类(Clock)实现!
	 */
	
	public void run() {
		while(true) {
			minute.increase();
			if(minute.show()==0) {
				hour.increase();
			}
		System.out.printf("%02d:%02d\n",hour.show(),minute.show());
		//02表示两位，d表示整数，\n换行
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		c.run();
	}

}
