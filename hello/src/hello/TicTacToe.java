package hello;
import java.util.Scanner;
public class TicTacToe {
//二维数组：三子棋如何判断获胜
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int ttt[][] = new int[4][4];
		boolean win = false;
		int winner=0;
		int i;
		int j=0;
		int corner1=0;
		int corner2=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				ttt[i][j]=in.nextInt();
				ttt[i][3]+=ttt[i][j];
				ttt[3][j]+=ttt[i][j];
				corner1+=ttt[i][i];
				corner2+=ttt[i][2-i];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if((ttt[i][3]==3)|(ttt[3][j]==3)|(corner1==3)|(corner2==3))
				{
					win=true;
					winner=1;
				}
				if((ttt[i][3]==0)|(ttt[3][j]==0)|(corner1==0)|(corner2==0))
				{
					win=true;
					winner=0;
				}
			}
		}
		if((win==true)&&(winner==1))
		{
			System.out.print("winner is 1");
		}
		if((win==true)&&(winner==0))
		{
			System.out.print("winner is 0");
		}
	}

}
