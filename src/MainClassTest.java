import org.junit.Test;


public class MainClassTest extends MainClass  {

    @Test
    public void testGetLocalNumber() {
<<<<<<< HEAD
        if (getLocalNumber() == 14 )
            System.out.println(" getLocalNumber works correctly " +  getLocalNumber());
=======
        /*** тест  проверяет, что метод getLocalNumber возвращает число 14 ***/
        if (getLocalNumber() == 14 )
            System.out.println("getLocalNumber works correctly " +  getLocalNumber());
>>>>>>> less2
        else
            System.out.println("getLocalNumber does not work correctly " +  getLocalNumber());
    }

<<<<<<< HEAD
=======
    @Test
    public void testGetClassNumber(){
        /*** тест  проверяет, что метод getClassNumber возвращает число больше 45 ***/
        if (getClassNumber() > 45 )
            System.out.println("getClassNumber works correctly " +  getClassNumber());
        else
            System.out.println("getClassNumber does not work correctly " +  getClassNumber());
    }
>>>>>>> less2
}