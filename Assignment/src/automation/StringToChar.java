package automation;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Velocity";
		
		//a.indexOf(0);
		System.out.println(a.indexOf("V"));
		
		char b [] = a.toCharArray();
		
		for (int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}

	}

}
