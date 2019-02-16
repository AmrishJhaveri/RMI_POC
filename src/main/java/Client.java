import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger("Client");

    private Client() {
    }

    public static void main(String[] args) {
        try {
            // Getting the registry
            // Looking up the registry for the remote object
            Hello stub = getStub();

            UserObject usrObj1 = new UserObject("test-rmi-referential");
            UserObject usrObj2 = usrObj1;
            logger.info("Ref1 - Client:" + usrObj1);
            logger.info("Ref2 - Client:" + usrObj2);
            // Calling the remote method using the obtained object
            stub.printMsg(usrObj1, usrObj2);

        } catch (Exception e) {
            logger.error("Client exception: " + e.toString(),e);
        }
    }

    public static Hello getStub() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(null);

        // Looking up the registry for the remote object
        return (Hello) registry.lookup("Hello");

    }
}