import org.junit.Test;

public class _MainTest1
{
//    переменные написанные вне функции и есть поля класса
//    поле класса , это переменная которая видна в каждй функции этого класса
    int a = 5;
    int b = 11;

    @Test
    public void myFirstTest()
    {
//////        int number = 10;
//////        int number1= 10+15;
//////        int number2= 10/3; /* некорректный вывод - округлит до целого*/
//////        double number3= 10/3; /* некорректный вывод - округлит до целого*/
//////        double number4= 10.0/3.0;
//////        /*System.out.println("Hello, QA engineers");*/
//////        System.out.println(number); /*10*/
//////        System.out.println(number1); /*25*/
//////        System.out.println(number2); /*3*/
//////        System.out.println(number3); /*3.0*/
//////        System.out.println(number4); /*3.3333333333333335*/
////
//        int a = 10;
//        int b = 15;
//        int w = 17;
////
////        if(a>b){
////            System.out.println("This will never happen");
////        } else {
////            System.out.println("This is what will happen");
////        }
//
//        System.out.println(a); // локальные переменные функции
//        System.out.println(b);
//
//        System.out.println(this.a);  // к переменным полям класса
//        System.out.println(this.b);
//        System.out.println(w);  // this можно опускать, если в методе нет переменных с таким именем

        this.typeString();
    }

    public void typeString()
    {
        System.out.println("Hello from typeString");
    }

}
