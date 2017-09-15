//Example for metadata
import java.sql.*;
import java.io.*;
public class metadata
{
	public static void main(String[] a)
	{

		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection c=DriverManager.getConnection("jdbc:odbc:MOUNIKA","system","mounika");

		Statement st=c.createStatement();
		ResultSet rs =st.executeQuery("Select * from emp");
		ResultSetMetaData meta = rs.getMetaData();
		String[] s;
		int cs=meta.getColumnCount();
                System.out.println("TOTAL NUMBER OF COLUMNS OF EMP TABLE : "+cs);
		s=new String[cs];
		for(int i=0;i<cs;i++)
			s[i]=meta.getColumnLabel(i+1);
		for(int i=0;i<cs;i++)
			System.out.print(s[i]+"    ");
	/*	System.out.println();
		while(rs.next())
		{
			for(int i=0;i<cs;i++)
			{
				String val=rs.getString(i+1);
				System.out.print(val+"    ");
			}
			System.out.println();
		} */
		


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

