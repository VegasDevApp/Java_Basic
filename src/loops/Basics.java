package loops;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise8();
        //exercise9();
        //exercise10();
    }

    public static void exercise1() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void exercise2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }

    public static void exercise3() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Hello World");
        }
    }

    public static void exercise4() {
        int index = 0;
        while (index < 10) {
            System.out.println("Hello World");
            index++;
        }
    }

    public static void exercise5() {
        int index = 10;
        while (index > 0) {
            System.out.println("Hello World");
            index--;
        }
    }

    public static void exercise6() {
        int index = 0;
        do {
            System.out.println("Hello World");
            index++;
        } while (index < 10);
    }

    public static void exercise7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some number");

        int num = scanner.nextInt();

        num = Math.abs(num);

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static void exercise8() {


        int num = 50 + (int) (Math.random() * (51));

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        System.out.println("End of printing numbers till " + num);
    }

    public static void exercise9() {
        int num1 = 50 + (int) (Math.random() * (51));
        int num2 = 50 + (int) (Math.random() * (51));

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (; start <= end; start++) {
            System.out.println(start);
        }

        System.out.printf("End of printing numbers between %d and %d", Math.min(num1, num2), end);
    }

    public static void exercise10(){
        int num1 = 1 + (int) (Math.random() * (100));
        int num2 = 1 + (int) (Math.random() * (100));

        int den = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = 1; i <= max; i++) {
            if(i%den==0){
                System.out.println(i);
            }
        }

        System.out.printf("End of printing numbers between %d and %d", den,max);
    }
}
