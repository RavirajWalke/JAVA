import java.io.*;
import java.util.*;
class StreamDemo1
{
	public static void main(String args[])throws IOException
	{
		int i,j;
		int a[]=new int[10];
		File f=new File("Numbers.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		
		//FileWriter fw=new FileWriter(f);
		Scanner sc=new Scanner(System.in);
		System.out.println("get input from keyboard:");
		for(i=0;i<10;i++)
		{
			int b=sc.nextInt();
			bw.write(b);
		}
		bw.flush();
		bw.close();
		BufferedReader br=new BufferedReader(new FileReader(f));
		System.out.println("numbers are:");
		for(i=0;i<10;i++)
		{
			System.out.println(br.read());
		}
	}
}