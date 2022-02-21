package automation;

public class PrimeNumber {

	public static void main(String[] args) {
		int a =33;
		int b =0;
		for (int i=2; i<a; i++)
		{
			if (a%i==0)
			{
				b = b+1;
			}
		}
		if(b==0)
		{
		 System.out.println("no. is prime");
		}
		else
		{
			System.out.println("no. is composite");
		}
	}

}
