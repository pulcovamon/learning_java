package tutorial_02;

public class Cat extends Dog {  // dog is super class/parent class and cat is subclass/child class
    
    private int food;
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.food = 50;
    }

    public Cat(String name) {
        super(name, 0);
        this.food = 50;
    }

    public void speak() {
        System.out.println("Meow my name is " + this.name + " and I can get " + this.food + "g of food.");
    }

    public void eat(int x) {
        this.food -= x;
    }

}
