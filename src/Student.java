public class Student {
    private String Name;
    private String Adress;
    private int Age;
    private boolean Otchislen;
    private float Growth;

    public static void main(String[] args) {

    }

    public static void boardAnswer() {
        prepareToAnswer();
        System.out.println("Отвечать у доски.");
    }

    private static void eat() {
        System.out.println("Кушать.");
    }

    private static void prepareToAnswer() {
        System.out.println("Готовиться к ответу.");
    }

    public static void doSomething() {
        System.out.println("Играть в дотку.");
    }

    public void setName(String name) {
        if (name == "") {
            System.out.println("Такого не может быть");
            return;
        }
        this.Name = name;
    }

    public void setAdress(String Adress) {
        if (Adress == "") {
            System.out.println("Такого не может быть");
            return;
        }
        this.Adress = Adress;
    }


    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Такого не может быть");
            this.Age = 1;
            return;
        }
        this.Age = age;
    }

    public void setOtchislenije(boolean Otchislen) {
        this.Otchislen = Otchislen;
        if (Otchislen == true) {
            System.out.println("Вы отчислены");
        }
        else if (Otchislen == false) {
            System.out.println("Вы, пока ещё, не отчислены");
        }
    }

    public void setGrowth(float Growth) {
        if (Growth <= 0) {
            System.out.println("Такого не может быть");
            return;
        }
        this.Growth = Growth;
    }
}