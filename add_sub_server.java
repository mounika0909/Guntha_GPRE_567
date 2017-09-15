import java.net.*;
import java.rmi.*;
public class add_sub_server
{
 public static void main(String args[])
 {
  try
  {
   addserverimpl adds=new addserverimpl();
   subserverimpl subs=new subserverimpl();
   Naming.rebind("mounika",adds);
   Naming.rebind("guntha",subs);
  }
  catch(Exception e)
  {
   System.out.println("exception :"+e);
   }
   }
}