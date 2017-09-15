//Example for creating table
import java.sql.*;
import java.io.*;
public class createtable
{
	public static void main(String[] a)
	{

		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection c=DriverManager.getConnection("jdbc:odbc:MOUNIKA","system","mounika");

		Statement st=c.createStatement();
		int i=st.executeUpdate("Create table staff1(eno number,ename varchar2(25))");
    }
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
