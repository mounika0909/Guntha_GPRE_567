//Example to Update employee name
import java.sql.*;
import java.io.*;
public class updatedata 
{
	public static void main(String[] a)
	{

		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

   Connection c=DriverManager.getConnection("jdbc:odbc:MOUNIKA","system","mounika");

		Statement st=c.createStatement();

		DataInputStream i1=new DataInputStream(System.in);
		 
		System.out.println("Enter Employee number");
		String eno=i1.readLine();
		 
		System.out.println("Enter Employee Name to get Updated");
		 
		String empname=i1.readLine();
		 

		int i=st.executeUpdate("update emp set ename='"+empname+"' where empno="+eno);
		System.out.println("Total records Updated with empno "+eno+"is       "+i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

