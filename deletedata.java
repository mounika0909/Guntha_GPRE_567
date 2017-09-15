//Example for Deleting a row of given employee number
import java.sql.*;
import java.io.*;
public class deletedata 
{
	public static void main(String[] a)
	{
	 try
      {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection c=DriverManager.getConnection("jdbc:odbc:MOUNIKA","system","mounika");
      Statement st=c.createStatement();

	DataInputStream i1=new DataInputStream(System.in);
	 
	System.out.println("Please enter Employee number");
	String eno=i1.readLine();
	 

	int i=st.executeUpdate("delete from emp where empno="+eno);
	System.out.println("Total records Deleted with empno "+eno+" is "+i);
        }
	catch(Exception e)
	{
	  System.out.println(e);
	}
	}
}
