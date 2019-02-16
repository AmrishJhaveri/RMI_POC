import org.junit.Test;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerClientTest {


    @Test
    public void testInsertToRegistry() throws RemoteException, AlreadyBoundException, NotBoundException {

        Server.insertToRegistry(new ImplExample());

        Registry registry = LocateRegistry.getRegistry();
        Hello stub = (Hello) registry.lookup("Hello");

        assert (stub != null);
    }

    @Test
    public void testGetStub() throws RemoteException, NotBoundException {

        Hello stub = Client.getStub();
        assert (stub != null);

    }

}