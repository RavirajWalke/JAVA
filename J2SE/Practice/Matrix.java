import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
	int i,j,k,sum=0;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner s=new Scanner(System.in);

	System.out.println("enter matrix A");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
	System.out.println("enter matrix B");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
	
		System.out.println("matrix A");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(" "+a[i][j]);
				}
				System.out.println("");
			}
		
		System.out.println("Matrix B");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(" "+b[i][j]);
				}
				System.out.println("");
			}
		
		
		
		System.out.println("sum of Matrices");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		

			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(" "+c[i][j]);
				}
				System.out.println("");
			}
			System.out.println("multiplication of Matrices");
			for(j=0;j<3;j++)
			{
				for(i=0;i<3;i++)
				{
				  sum=0;
				  for(k=0;k<3;k++)
				   {
					 sum=sum+a[i][k]*b[k][j];
				   }
				  c[i][j]=sum;
			   }
			}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(" "+c[i][j]);
				}
				System.out.println("");
			}
			
}
}





