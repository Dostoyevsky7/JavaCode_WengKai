package hello;
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		Scanner in = new Scanner(System.in);
		//a random number [1,100]
		int number = (int)(Math.random()*100+1);//Math.random生成[0,1)
		//begin guess
		int guess;
		int n = 0;
		do
		{
			guess = in.nextInt();
			n = n+1;
			if (guess > number)
			{
				System.out.println("too large!");
			}
			else if (guess < number)
			{
				System.out.println("too small!");
			}
		}while (guess != number);
		System.out.println("bingo!");
		System.out.println("you guessed "+(n-1)+" times");
	}

}
