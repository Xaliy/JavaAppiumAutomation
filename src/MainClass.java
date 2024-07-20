public class MainClass {

    private int class_number =20;

    public int getLocalNumber() {
        /*** метод возвращает 14 ***/
        int localNumber = 14;
//        System.out.println("the value of localNumber = " + localNumber);
        return localNumber;
    }

    public int getClassNumber(){
        /*** метод возвращает приватную переменную  class_number 20***/
//        System.out.println("the value of class_number = " + this.class_number);
        return class_number;
    }
}
