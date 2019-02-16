import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Implementing the remote interface
public class ImplExample implements Hello {
    private static final Logger logger = LoggerFactory.getLogger("ImplExample");
//     Implementing the interface method
    public boolean printMsg(UserObject usrObj1, UserObject usrObj2) {
        logger.info("Ref1 - Server:"+usrObj1);
        logger.info("Ref2 - Server:"+usrObj2);
        return true;
    }
} 