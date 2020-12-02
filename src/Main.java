

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setAge(14);
        student.setName("Ярослав");
        student.setAdress("Замостянська 5");
        student.setGrowth((float) 195.6);

        student.setOtchislenije(false);
        student.doSomething();

        //student.prepareToAnswer();
        //student.eat();

        /*
        Приватный метод не доступен, потому что приватные
        методы доступны только в пределах того класса, в
        котором были обьявлены.
         */

        student.boardAnswer();
    }
}
