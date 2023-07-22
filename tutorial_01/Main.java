package tutorial_01;
/* 
 * Java basics using: https://www.youtube.com/watch?v=eIrMbAQSU34&t=146s
 */

/*
Names of classes start with uppercase,
names of methods start with lowercase. 

Java basic structure:
*/
//package com.company; // package statement
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Date; // import statement
//import java.awt.*; // import statement
import java.util.*; // import statement

public class Main {     //public/private - acces modifier
    public static void main(String[] args) {       // main method is always static
        byte age = 30;                        // no need of using more than one byte
        int viewsCount1 = 123_456_789;         // underscore for readability
        long viewsCount2 = 3_123_456_789L;     // L is for long
        double price = 10.99;                   // double is more precise than float
        float rating = 4.5F;                    // F is for float
        char letter = 'A';                      // single quotes for char
        boolean isEligible = true;              // boolean is true or false
        System.out.println(age);      // print line method
        
        // Reference types
        Date now = new Date();      // new keyword is used to create a new object, 
        now.getTime();
        System.out.println(now);    // print line method

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);      // print line method

        /*Point point1 = new Point(1, 1);     // Point is a reference type
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);     // print line method*/

        String message = "Hello World" + "!!";   // String is a reference type
        System.out.println(message.endsWith("!!"));    // print line method
        System.out.println(message.length());          // print line method
        System.out.println(message.indexOf("e"));      // index of first occurence
        System.out.println(message.replace("!", "*")); // print line method
        System.out.println(message.toLowerCase());     // print line method
        System.out.println(message.trim());
        System.out.println(message);                   // print line method
        System.out.println("Hello \"somobody\"");
        System.out.println("c:\\Windows\\");

        int[] numbers = {2, 3, 5, 1, 4};    // array
        Arrays.sort(numbers);

        int[][] matrix = new int[2][3];     // 2D array
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};    // 2D array

        final float pi = 3.14F;    // constant

        double result = (double)10 / (double)3;   // casting

        int x1 = 1;
        int y1 = ++x1;    // post-increment
        System.out.println(x1);      // print line method

        // implicit casting
        // byte > short > int > long > float > double
        short x2 = 1;
        int y2 = x2 + 2;    // widening casting (implicit casting)

        // explicit casting
        double x3 = 1.1;
        int y3 = (int)x3 + 2;

        Integer.parseInt("1");  // convert string to int
        Double.parseDouble("1.1");  // convert string to double

        // Math class
        int result1 = Math.round(1.1F);  // round to nearest integer
        int result2 = (int)Math.ceil(1.1F);  // round up
        int result3 = (int)Math.floor(1.1F);  // round down
        int result4 = Math.max(1, 2);  // max
        int result5 = Math.min(1, 2);  // min
        double result6 = Math.random();  // random number between 0 and 1
        int result7 = (int)(Math.random() * 100);  // random number between 0 and 100

        NumberFormat currency = NumberFormat.getCurrencyInstance();  // currency format
        String result8 = currency.format(1234567.891);
        System.out.println(result8);

        NumberFormat percent = NumberFormat.getPercentInstance();  // percent format
        String result9 = percent.format(0.1);
        System.out.println(result9);

        // chaining
        String result10 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result10);

        Scanner scanner = new Scanner(System.in);  // scanner object, reading from console
        System.out.println("Age: ");
        //byte age1 = scanner.nextByte();  // read byte from console
        //System.out.println("You are " + age1);

        System.out.println("Name: ");
        String name = scanner.nextLine().trim();  // read string from console
        System.out.println("You are " + name);
    }
}
