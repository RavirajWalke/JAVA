
public class stringCheck {
	public static void main(String[] args)
	{

		String s = "ab"+"12";
		String t = "ab"+12;
		String u = new String("ab12");
		System.out.print(s);
		System.out.print(t);
		System.out.print(u);
		System.out.print((s==t)+" "+(s==u));
	}

}
