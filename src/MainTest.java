import org.junit.Test;

public class MainTest extends CoreTestCase
{
    public void typeStartMessage(){
        /*super  - обозначает , что сначала выполняем весь код в классе родителе
        и только потом выполняем в текущем классе!
         если убрать super, то будет выводиться только то что в текущем классе,
         т.е метод внутри текущего класса стал полностью переопределен
         */
        super.typeStartMessage(); /* если это убрать, то метод typeStartMessage будет переопределен */
        System.out.println("Current class is MainTest");
    }

    @Test
    public void myFirstTest(){
        this.typeStartMessage();
    }

    @Test
    public void mySecondTest(){
        this.typeStartMessage();

    }
}