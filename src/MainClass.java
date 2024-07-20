public class MainClass {

    private int class_number = 20;
    private String class_string = "Hello, world";

    public int getLocalNumber() {
        /*** метод возвращает 14 ***/
        int localNumber = 14;
        System.out.println("the value of localNumber = " + localNumber);
        return localNumber;
    }

    public int getClassNumber() {
        /*** метод возвращает приватную переменную  class_number 20***/
        System.out.println("the value of class_number = " + this.class_number);
        return class_number;
    }

    public String getClassString() {
        /*** метод возвращает приватную переменную  class_string  = "Hello, world"***/
        System.out.println("the value of class_number = " + this.class_string);
        return class_string;
    }

}