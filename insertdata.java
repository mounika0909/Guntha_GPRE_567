//To insert data into sql table
import java.sql.*;
import java.io.*;
public class insertdata 
{
	public static void main(String[] a)
	{
	try{
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection c=DriverManager.getConnection("jdbc:odbc:MOUNIKA","system","mounika");
   Statement st=c.createStatement();
  	DataInputStream i1=new DataInputStream(System.in);
		 
		System.out.println("Please enter Employee number");
		String eno=i1.readLine();
		 
		System.out.println("Please enter Employee name");
		String empname=i1.readLine();
		 
		System.out.println("Please enter Department number");	
		String deptno=i1.readLine();
 		 
    int i=st.executeUpdate("insert into emp(empno,ename,deptno) values("+eno+",'"+empname+"',"+deptno+")");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
