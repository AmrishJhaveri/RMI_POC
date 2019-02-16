import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplExample {
    private static final Logger logger = LoggerFactory.getLogger("Server");

    public Server() {
    }

    public static void main(String args[]) {
        try {
            // Instantiating the implementation class
            // Exporting the object of implementation class
            // (here we are exporting the remote object to the stub)
            insertToRegistry(new ImplExample());
            logger.info("Server ready");
        } catch (Exception e) {
            logger.error("Server exception: " + e.toString(), e);
        }
    }

    public static void insertToRegistry(ImplExample obj) throws RemoteException, AlreadyBoundException {
        Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

        Registry registry = LocateRegistry.createRegistry(1099);

        // Binding the remote object (stub) in the registry
        //bind the stub to an entry
        registry.rebind("Hello", stub);
    }
} 