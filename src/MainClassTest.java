import org.junit.Test;


public class MainClassTest extends MainClass  {

    @Test
    public void testGetLocalNumber() {
        if (getLocalNumber() == 14 )
            System.out.println(" getLocalNumber works correctly " +  getLocalNumber());
        else
            System.out.println("getLocalNumber does not work correctly " +  getLocalNumber());
    }

}