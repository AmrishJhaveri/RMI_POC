import java.rmi.Remote;
import java.rmi.RemoteException;

// Creating Remote interface for our application 
public interface Hello extends Remote {
        boolean printMsg(UserObject usrObj1,UserObject usrObj2) throws RemoteException;
}