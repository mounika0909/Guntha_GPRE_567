//Example for aggrigate functions
import java.sql.*;
import java.io.*;
public class aggregate 
{
	public static void main(String arg[])
	{

	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

	Connection c=DriverManager.getConnection("jdbc:odbc:MOUNIKA","system","mounika");

	Statement st=c.createStatement();

	ResultSet r=st.executeQuery("select sum(sal),max(sal) from emp");
	r.next();
	System.out.println("Total Salary....  :"+r.getInt(1));
	System.out.println("Max Salary....  :"+r.getInt(2));
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

