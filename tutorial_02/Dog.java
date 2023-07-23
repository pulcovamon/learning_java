package tutorial_02;

public class Dog {

    protected static int count = 0;
    
    protected String name;
    protected int age;

    public Dog(String name, int age) {  // constructor
        this.name = name;
        this.age = age;
        add();
        Dog.count++;
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int add() {
        return this.age + 1;
    }

    public static void display() {      // static method does not need instance     public static void display() {
        System.out.println("I am a dog!");
        System.out.println("I am a dog!");
    }

    public void display2() {
        System.out.println("I am a dog!");
    }
}
