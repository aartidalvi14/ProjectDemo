package myPack;

public class Palindrome {

public static void main(String[] args) {
		
		int n=121,temp,r,sum=0;
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		if(temp==sum)
		{
			System.out.println("It's a Palindrome");
		}
		else
		{
			System.out.println("It's not a Palindrome");
		}
	}
}
