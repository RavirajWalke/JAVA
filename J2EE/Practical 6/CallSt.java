import java.sql.*;
import java.util.*;
class CallStDemo
{
	public static void main(String args[]) throws Exception
	{
		Scanner x = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Acc","root","2014bcs021");		
		CallableStatement cs;
		int n;
		int balance;
		char ch='y';
		while(ch=='y')
		{
			cs = c.prepareCall("{call Show_Bal(?,?)}");
			System.out.print("Account Number = ");
			n = x.nextInt();
			cs.setInt(1,n);
			cs.execute();
			cs.registerOutParameter(2,Types.INTEGER);
			balance = cs.getInt(2);
			System.out.println("Balance = "+balance);
			System.out.println("Want to try again? y/n");
			ch = x.next().charAt(0);
		}
	}
}