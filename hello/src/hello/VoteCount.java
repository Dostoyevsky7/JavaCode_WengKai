package hello;
import java.util.Scanner;
public class VoteCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		//用户输入未知个数的[0-9]的数字，以-1标志结束，储存并统计这些数字各出现了几次
		//在未知输入多少个数字的时候怎么办？
		int[] vote = new int[10];
		int x = in.nextInt();
		while(x!=-1)
		{
			if(x>0 && x<9)
			{
				vote[x]+=1;
				//让下标自己成为那个数字，这样数组储存的就是数字出现的次数啦！
			}
			x = in.nextInt();
		}
	}

}
