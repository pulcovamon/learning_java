package tutorial_02;
//import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeMap;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.HashMap;

//import java.lang.reflect.Array;
//import java.util.Arrays;

public class Basics {

    public static void main(String[] args) {
        System.out.println("Hellow World!");

        /*
        // primitive data types - not changeble
        int hello_world = 9;
        double num2 = 5.0;
        boolean b = true;
        char c = 'h';
        
        // not primitive
        String str = "768736gdtbfztgh";

        int tim = hello_world;
        System.out.println(tim);

        int x; // declared but not inizialized
        // operations
        x = 5;
        int y = 6;
        int z = 7;
        double u = y / x; // integer -> double (value same as an integer)
        double v = (double)y / (double)z; // double because at least one of the operators is double
        double d = Math.pow(x, y);
        System.out.println(d);

        int w = 56 % 5; // modulo

        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println(scanned);

        int scanned_int = sc.nextInt();
        boolean scanned_bool = sc.nextBoolean();

        String scanned_str = sc.next();
        int scanned_int2 = Integer.parseInt(scanned_str);

        int x = 6;
        int y = 7;
        String t = "hi";

        boolean compare = x < y;
        System.out.println(!(compare));
        System.out.println(t.equals("hi"));
        // && and, || or, ! not

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("hello")) {
            System.out.println("hi");
        } else if (s.equals("hi")) {
            System.out.println("hello");
        } else {        int[] newArr = new int[5];
            System.out.println(s);
        }

        System.out.println("input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();        
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.print("input your favourit food: ");
            String food = sc.nextLine();

            if (food.equals("pizza")) {
                System.out.println("mine too");
            }
            else {
                System.out.println("not mine");
            }
        }
        else if (age >= 13) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are not a teenager or an adult");
        }

        // arrays
        String[] strArr = new String[5];
        strArr[0] = "hello 0";
        strArr[1] = "hello 1";
        strArr[2] = "hello 2";
        strArr[3] = "hello 3";
        strArr[4] = "hello 4";

        int[] nums = {5, 46, 765878};

        // loops
        int[] arr = {1,5,7,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println("Found a 5 at index " + i);
            }
        }

        int count = 0;
        for (int element:arr) {
            System.out.println(element + " " + count);
            count++;
        }

        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            String input = sc.nextLine();
            names[i] = input;
        }

        for (String n:names) {
            System.out.println(n);
        }

        Scanner sc = new Scanner(System.in);
        int x = 0;
        int count = 0;
        while (x != 10) {
            System.out.println("type 10");
            x = sc.nextInt();
            count++;
        }
        System.out.println("You tried " + count + " times");

        count = 0;
        do {
            System.out.println("type 10");
            x = sc.nextInt();
            count++;
        } while (x != 10);

        // lists and sets
        Set<Integer> t = new HashSet<Integer>(); // another are LinkedHashSet and TreeSet
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);
        t.remove(9);
        System.out.println(t.contains(9));
        System.out.println(t.size());
        t.clear();
        System.out.println(t.isEmpty());

        ArrayList<Integer> u = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            u.add(i);
        }
        u.set(5, 1);
        System.out.println(u.get(5));
        System.out.println(u.size());
        System.out.println(u.subList(2, 5));

        // maps
        Map m = new HashMap();  // unordered - can include different data types
        m.put("value", 5);
        m.put("description", "x");
        System.out.println(m.get("value"));

        Map n = new TreeMap<>();    // ordered - keys have to be of the same type
        n.put("name", "luna");
        n.put("type", "rat");
        n.put("size", 20);

        // Map k = new LinkedHashMap<>();  // same order as added
        // method m.remove(key) also exists

        System.out.println(m.containsValue("b"));
        System.out.println(m.containsKey("value"));
        System.out.println(m.get("value"));
        System.out.println(m.values());
        m.clear();
        System.out.println(m.isEmpty());

        int[] x = {-99, 485, 885, 46874, -8544, 4, 44};
        Arrays.sort(x, 2, 5);
        
        for (int num:x) {
            System.out.println(num);
        }
        */
    }
    
}
