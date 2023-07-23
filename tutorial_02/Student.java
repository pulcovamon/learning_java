package tutorial_02;

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        }
        return false;
    }

    public int compareTo(Student other) {       // how far are first letters in alphabet
        return this.name.compareTo(other.name);
    }

    public String toString() {                 // is called automatically when the object is printed
        return "Student(" + this.name + ")";
    }
    
}
