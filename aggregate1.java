//Example for aggregate functions
import java.sql.*;
import java.io.*;
public class aggregate1
{
	public static void main(String[] a)
	{

		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection c=DriverManager.getConnection("jdbc:odbc:MOUNIKA","scott","tiger");

		Statement st=c.createStatement();

		ResultSet r=st.executeQuery("select sum(sal) \"Sum\",max(sal) \"Max\" from emp");
		r.next();
		System.out.println("Total Salary....  :"+r.getInt("Sum"));
		System.out.println("Max Salary....  :"+r.getInt("Max"));

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

