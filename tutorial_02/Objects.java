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

        System.out.println(Dog.count);

        Student joe = new Student("Joe");
        Student bill = new Student("Joe");

        System.out.println(joe.equals(bill));
        System.out.println(joe);

        OuterClass out = new OuterClass();
        out.inner();
        OuterClass.InnerClass in = out.new InnerClass();
        in.display();
        out.inner2();

        Car ford = new Car();
        ford.speedUp(10);
        ford.changeGear(2);
        ford.display();

        int x = Vehicle.math(5);
        System.out.print(x);

        int difference = Math.diff(5, 3);
        System.out.println(difference);
        Level[] arr = Level.values();

        Level lvl = Level.LOW;
        String en = lvl.toString();
        System.out.println(en);

        if (lvl == Level.LOW) {
            System.out.println(lvl);
        } else if (lvl == Level.MEDIUM) {
            System.out.println(lvl);
        } else {
            System.out.println(lvl);
        }

        for (Level e : arr) {
            System.out.println(e);
        }

        System.out.println(lvl.getLevel());
        System.out.println(Level.valueOf("LOW"));

        lvl.setLevel(5);
        System.out.println(lvl.getLevel());
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
