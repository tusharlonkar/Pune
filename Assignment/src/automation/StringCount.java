package automation;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Velo city";
		
		System.out.println(a.length());
		
		int count = 0;
		
		for (int i=0; i<a.length(); i++)
		{
			if (a.charAt(i)!= ' ')
				count++;				
		}
		
		System.out.println(count);
				

	}

}
