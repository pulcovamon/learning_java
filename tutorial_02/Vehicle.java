package tutorial_02;

public interface Vehicle {      // cannot create instances of an interface
                                // it is supposed to be inherited from
                                // just public methods
    
    final int gears = 5;        // have to be final

    void speedUp(int a);
    void slowDown(int a);
    void changeGear(int a);

    default void out() {
        System.out.println("Default method");
    }

    static int math(int b) {
        return b + 9;
    }
}
