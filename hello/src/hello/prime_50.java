package hello;

public class prime_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int number=0;
		int a;
		while(n<=49)
		{
			number++;
			for(a=1;a<=number;a++)
			{
				if((number%a==0)&(a!=1)&(a!=number))
				{
					break;
				}
				else if(a==number)
				{
					n++;
					System.out.println(number+" number:"+n);
				}
			}
		}
	}

}
