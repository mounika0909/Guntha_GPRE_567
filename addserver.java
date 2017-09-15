//server program
import java.net.*;
import java.rmi.*;
public class addserver
{
 public static void main(String args[])
 {
  try
  {
   addserverimpl adds=new addserverimpl();
   Naming.rebind("mounikaguntha",adds);
  }
  catch(Exception e)
  {
   System.out.println("exception :"+e);
  }
   }
}