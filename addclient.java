//client program
import java.net.*;
import java.rmi.*;
public class addclient
{
 public static void main(String args[])
 {
  try
  {
   addserverintf adds=(addserverintf) Naming.lookup("rmi://127.0.0.1/mounikaguntha");
   double d1=Double.valueOf(args[0]).doubleValue();
   double d2=Double.valueOf(args[1]).doubleValue();
   System.out.println("sum is "+adds.add(d1,d2));
   }
   catch(Exception e)
   {
   }
   }
   }
