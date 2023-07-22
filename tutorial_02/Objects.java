package tutorial_02;

public class Objects {

    public static void main(String[] args) {    // automatically triggered while run
        hello_world();
        greet("monika", 5);
        System.out.println(add2(8));
        System.out.println(str("hi"));

        Dog ciri = new Dog("Ciri", 7);
        ciri.speak();

        Dog luna = new Dog("Luna", 1);
        luna.speak();
        luna.setAge(2);
        System.out.println(luna.getAge());

        Cat aria = new Cat("Aria", 4, 100);
        aria.eat(50);
        aria.speak();

        Cat bob = new Cat("Bob");
        bob.speak();
    }

    public static void hello_world() {
        System.out.println("Hello World!");
    }

    public static void greet(String name, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Hi, " + name);
        }
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "!";
    }
    
}
