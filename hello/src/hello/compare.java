package hello;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 加减乘除等运算优先级比比较的优先级高：7>=4+5是False
 * ==或!=的优先级比其他的低：5>3 == 6>4是True因为True = True
 * True和False不能比较大小
 * 一个int和一个float可以比较大小
		*/
			double a = 1.0;
			double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
			System.out.println(b);
			//b=0.9999999999999999
			System.out.println(a==b);
			System.out.println(Math.abs(a-b)<1e-6);
			//在比较两个float时，往往采用Math.abs()<1e-6,1e-6是个较小的数
	}

}
