import org.junit.Test;


public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        /*** тест  проверяет, что метод getLocalNumber возвращает число 14 ***/
        int localNumber = getLocalNumber();
        if (localNumber == 14)
            System.out.println("getLocalNumber works correctly " + localNumber);
        else
            System.out.println("getLocalNumber does not work correctly " + localNumber);
    }

    @Test
    public void testGetClassNumber() {
        /*** тест  проверяет, что метод getClassNumber возвращает число больше 45 ***/
        int classNumber = getClassNumber();
        if (classNumber > 45)
            System.out.println("getClassNumber works correctly " + classNumber);
        else
            System.out.println("getClassNumber does not work correctly " + classNumber);
    }
}