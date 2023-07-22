package tutorial_02;

public class Dog {
    
    public String name;
    private int age;

    public Dog(String name, int age) {  // constructor
        this.name = name;
        this.age = age;
        add();
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
}
