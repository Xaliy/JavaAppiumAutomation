import org.junit.Test;

public class _MainTest2 extends _CoreTestCase2  /*extends CoreTestCase  родительский класс*/
{
    /**Объект класса MathHelper находится в переменной Math**/
    _MathHelper_del Math = new _MathHelper_del();
            /*С помощью ключевого слова new, мы создаем объект класса MathHelper
            * и присваеваем его переменной Math, который имеет такой же тип, как
            * имя нашего класса MathHelper */

    @Test
    public void myFirstTest()
    {
//        /**так мы вызываем методы их родительского класса */
//        int a = this.multiply(5);
//        System.out.println(a);
//        int b = this.multiply(10, 15);
//        System.out.println(b);

        /*Так мы вызываем через объект класса*/
        int a = Math.multiply(5);
        System.out.println(a);
        int b = Math.multiply(10, 15);
        System.out.println(b);

    }
/* методы можно здесь, а можно вынести в другой класс , к примеру в класс Core*/
//
//    public  int multiply(int number)
//    {
//        return number * 2;
//    }
//    public  int multiply(int number, int multiplier)
//    {
//        return number * multiplier;
//    }
}
