//implementation program
import java.rmi.*;
import java.rmi.server.*;
 
public class addserverimpl extends  UnicastRemoteObject
               implements addserverintf
{
 public addserverimpl() throws  RemoteException{}
 public double add(double d1,double d2) throws RemoteException
 {
  return d1+d2;
 }
}
