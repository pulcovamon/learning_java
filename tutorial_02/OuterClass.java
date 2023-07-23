package tutorial_02;

public class OuterClass {
    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class");;
        }
    }

    public void inner() {
        InnerClass in = new InnerClass();
        in.display();
    }

    public void inner2() {
        class InnerClass2 {
            public void display2() {
                System.out.println("Inner class");
            }
        }

        InnerClass2 in2 = new InnerClass2();
        in2.display2();

    }
}
