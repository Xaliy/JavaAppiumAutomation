/*Методы вынесены в вспомогательный класс*/
public class _MathHelper_del
{
    /*final запрещает ме5нять
    * этим мы будем отмечать локаторы переменных , что бы их случайно не переопреде5лить*/

    final public int simple_int = 7;
//    public int simple_int = 7;
    final public static int static_int = 7;
//    public static int static_int = 7;

//    public void changeSimpleInt(){
//        this.simple_int = 8;
//        /*Можно обращаться к статическим переменным в НЕ статических методах*/
//        static_int = 8;
//        }

//        /*нельзя обращаться к НЕ статическим переменным в статических методах*/
//    public static void changeSimpleIntByStaticFt(){
//        this.simple_int = 8;
//    }

    public  int multiply(int number)
    {
        return number * 2;
    }

    public  int multiply(int number, int multiplier)
    {
        return number * multiplier;
    }

    public int calc(int a, int b, char action)
    {
        if (action == '+'){
           return this.plus(a, b);
        }else if (action == '-'){
            return this.minus(a, b);
        }else {
            return this.typeAnErrorValue("Недопустимая операция" + action);
        }

    }

    private int typeAnErrorValue(String error_message){
        System.out.println(error_message);
        return 0;
    }

    private int plus(int a, int b){
        return a + b;
    }
    private int minus(int a, int b){
        return a + b;
    }
}
