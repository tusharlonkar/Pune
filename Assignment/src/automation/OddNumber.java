package automation;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		System.out.println("please enter number");
		Scanner s = new Scanner(System.in);
		for (int i=0; i<10; i++)
		{
		int a = s.nextInt();
		if (a%2==0)
		{
			System.out.println("no. is even");
		}
		else
		{
			System.out.println("no. is odd");
		}
		}
		
//		for (int i=0; i<1000; i++)
//		{
//			int a = i%2;
//			if (a==0)
//			{
//				System.out.println(i);
//			}
//		}
		

	}

}
