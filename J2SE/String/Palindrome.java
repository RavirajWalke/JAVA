import java.util.*;
public class Palindrome
{
	public static void main(String[] args) 
	{
		while(true){
		 Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.next();
		int i,l;
		l=s1.length();
		int t=l-1;
		for(i=0;i<l;i++,t--)
		{
			if(s1.charAt(i)==s1.charAt(t))
			continue;
			else
				break;
		}
	
		if(i==l)
			System.out.println("String is palindrome");
		else
		System.out.println("String is not palindrome");
		
	}
	}
}