import org.junit.Test;

public class ImplExampleTest {

    @Test
    public void testPrintMsg() {
        ImplExample impl = new ImplExample();
        UserObject usr1 = new UserObject("test");
        UserObject usr2 = usr1;
        assert (impl.printMsg(usr1, usr2));
    }
}