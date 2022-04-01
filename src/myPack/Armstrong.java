package myPack;

public class Armstrong {

	public static void main(String[] args) {
		
		int n=270,temp,r,sum=0;
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
		{
			System.out.println("It's an armstrong number");
		}
		else
		{
			System.out.println("It's not an armstrong number");
			System.out.println("Hello World");
		}
	}
}
