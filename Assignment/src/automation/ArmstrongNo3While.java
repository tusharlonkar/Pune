package automation;

public class ArmstrongNo3While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1,b,c=0;
		
		while (a<1000)
		{	
			int d = a;
			b = d%10;
			c = c + (b*b*b);
			d = d/10;
		}
		if (c == a)
		{
			System.out.println(a);
		}
//		else
//		{
//			System.out.println("aaa");
//		}
		c=0;
        a++; 
	}

}
