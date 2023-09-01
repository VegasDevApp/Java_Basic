package loops;

import java.util.Scanner;

public class Fibonacci {
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
        exercise10();
    }

    public static void exercise1() {
        int a1 = 1;
        int a2 = 1;

        System.out.print(a1);
        System.out.print(", " + a2);

        for (int i = 3; i <= 30; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            System.out.print(", " + a2);
        }
    }

    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some number");
        int num = Math.abs(scanner.nextInt());

        int a1 = 1;
        int a2 = 1;


        for (int i = 3; i <= num; i++) {
            a2 = a1 + a2;
            a1 = a2 - a1;
        }
        System.out.printf("Index %d number %d\n\r", num, a2);
        scanner.close();
    }

    public static void exercise3() {
        int num = (int) (Math.random() * 31) + 10;
        System.out.printf("Number: %d\n\r", num);

        int a1 = 1;
        int a2 = 1;
        while (a2 <= num) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            System.out.println(a1);
        }
    }

    public static void exercise4() {
        int num = (int) (Math.random() * 31) + 10;
        System.out.printf("Number: %d\n\r", num);

        int a1 = 1;
        int a2 = 1;
        while (a2 <= num) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            if (a1 % 2 == 0) System.out.println(a1);
        }
    }

    public static void exercise5() {
        int num = (int) (Math.random() * 31) + 10;
        System.out.printf("Number: %d\n\r", num);

        int a1 = 1;
        int a2 = 1;
        while (a2 <= num) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            if (a1 % 2 == 0) System.out.println(a1);
        }
    }

    public static void exercise6() {
        int num = (int) (Math.random() * 31) + 10;
        System.out.printf("Number: %d\n\r", num);
        int sum = 1;
        int a1 = 1;
        int a2 = 1;
        System.out.println(a1);
        while (a2 <= num) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            sum += a1;
            System.out.println(a1);
        }
        System.out.printf("Sum of it: %d\n\r", sum);
    }

    public static void exercise7() {
        int num = (int) (Math.random() * 31) + 10;
        System.out.printf("Number: %d\n\r", num);
        int sum = 1;
        int counter = 2;
        int a1 = 1;
        int a2 = 1;
        System.out.println(a1);

        while (a2 <= num) {
            a2 = a1 + a2;
            a1 = a2 - a1;
            sum += a1;
            System.out.println(a1);
            counter++;
        }
        System.out.printf("Average of it: %d\n\r", sum / counter);
    }

    public static void exercise8() {
        int a = (int) (Math.random() * 96) + 5;
        int b = (int) (Math.random() * 96) + 5;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        a = 1;
        b = 1;
        System.out.printf("Fibonacci between %d and %d\n\r", min, max);
        while (b <= max) {
            b = b + a;
            a = b - a;
            if (a >= min) System.out.println(a);
        }
    }

    public static void exercise9(){
        int a = (int) (Math.random() * 96) + 5;
        int b = (int) (Math.random() * 96) + 5;

        int maxEven = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        a = 1;
        b = 1;
        System.out.printf("Fibonacci between %d and %d\n\r", min, max);
        while (b <= max) {
            b = b + a;
            a = b - a;
            if(a%2==0) maxEven = Math.max(a, maxEven);
            if (a >= min) System.out.println(a);
        }
        System.out.println("The highest even is " + maxEven);
    }

    public static void exercise10(){
        int num = (int) (Math.random() * 101) + 100;
        for (int i = 1; i <= num; i++) {
            if(i == 7 || withSeven(i))
            {
                System.out.print("Boom ");
            } else
            {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean withSeven(int n){
        while (n > 0){
            if(n%10==7){
                return true;
            } else {
                n = n /10;
            }
        }
        return  false;
    }
}
