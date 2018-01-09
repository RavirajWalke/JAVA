import java.io.*;
class StreamDemo2
{
	public static void main(String args[])throws IOException
	{
		int i,j;
		int a[]=new int[10];
		File f=new File("Numbers.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		System.out.println("numbers are:");
		for(i=0;i<10;i++)
		{
			a[i]=br.read();
			System.out.println(a[i]);
		}
		System.out.println("numbers in sorted order are:");
		for(i=0;i<10;i++)
		{
			int key=a[i];
			j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		br.close();
	}
}