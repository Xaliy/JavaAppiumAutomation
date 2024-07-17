import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase
{
    @Before
    public void TestStartTest()
    {
    System.out.println("Start test");
    }
    @After
    public void TestFinishTest()
    {
        System.out.println("Finish test");
    }
    @Test
    public void myFirstTest()
    {
//        Assert.fail("This message will by printed"); /*ложно позитивное срабатывание*/
//        this.assertFail();
        System.out.println("First test");
        int expected = 20;
        int actual = 5*5;

//        if(actual != expected){
//            Assert.fail("Ошибка");
//        }
//        или
        Assert.assertTrue( "5*5* !=5", actual == expected);
    }

//    private void assertFail()
//    {
//        Assert.fail("This message will by printed"); /*ложно позитивное срабатывание*/
//    }

    @Test
    public void mySecondTest()
    {
        System.out.println("Second test");
    }
}