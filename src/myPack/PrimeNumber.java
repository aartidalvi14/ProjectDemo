package myPack;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=29;
		boolean isPrime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			System.out.println(num + " is a Prime Number");
		}
		else
		{
			System.out.println(num + " is not a Prime Number");
			System.out.println("Hello World");
		}
	
	}
}
