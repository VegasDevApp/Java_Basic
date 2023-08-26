package flowcontrol;

import java.util.Scanner;

public class Exersice {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7(2, 12);
        //exercise8();
        //exercise9();
        //exercise10();
    }

    public static void exercise1() {
        String part1 = "There will be";
        int visitors = 5;
        String part2 = "people for dinner.";
        System.out.printf("%s %d %s", part1, visitors, part2);
    }

    public static void exercise2() {
        int min = 0;
        int max = 100;
        int a = (int) (Math.random() * (max - min + 1));
        int b = (int) (Math.random() * (max - min + 1));

        System.out.printf("Variable a = %d\n\r", a);
        System.out.printf("Variable b = %d\n\r", b);
        System.out.printf("Summary of them = %d\n\r", b + a);
        System.out.printf("Average of them = %d\n\r", (b + a) / 2);
        System.out.printf("Modulo 10 of a = %d\n\r", a % 10);
        System.out.printf("Modulo 10 of b = %d\n\r", b % 10);
        System.out.printf("Area = %d\n\r", (b * a));
        System.out.printf("Perimeter = %d\n\r", (b + a) * 2);
    }

    public static void exercise3() {
        int minutes = 100 + (int) (Math.random() * (350 - 100 + 1));
        int h = minutes / 60;
        int m = minutes % 60;
        System.out.printf("Movie length of %d minutes is %d hour(s) and %d minute(s)", minutes, h, m);
    }

    public static void exercise4() {
        int a = 1 + (int) (Math.random() * (100));
        int b = 1 + (int) (Math.random() * (100));

        System.out.printf("Biggest number: %d\n\r", Math.max(a, b));
        System.out.printf("Smallest number: %d\n\r", Math.min(a, b));
        System.out.printf("Average: %d\n\r", (a + b) / 2);
        System.out.printf("Summary: %d\n\r", (a + b));
        System.out.printf("Summary is %s\n\r", (a + b) % 2 == 0 ? "even" : "odd");
    }

    public static void exercise5(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            int n = 200 + (int)(Math.random() * (750 - 200 + 1));
            max = Math.max(max, n);
        }

        System.out.printf("The biggest number is %d and is %s!", max, max%2==0 ? "even" : "odd");
    }

    public static void exercise6(){
        int goals = 150 + (int)(Math.random() * (1000 - 150 + 1));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in football player name");
        String name = scanner.nextLine(); //Thomas Müller

        System.out.println("Please type in his/her team");
        String team = scanner.nextLine(); //Bayern Munich


        System.out.println("Please type in his/her age");
        float age = scanner.nextFloat();

        scanner.close();

        System.out.printf("%s is %.1f years old player of %s and have made %d%s goals!!", name, age, team, goals, (goals > 600 ? " WOW" : ""));
    }

    public static void exercise7(int min, int max){
        for (int i = 0; i < 3; i++) {
            int n = min + (int)(Math.random() * (max - min + 1));
            System.out.printf("%d) Number %d and its squared value is %d\n\r", i+1, n, (int)Math.pow(n, 2));
        }
    }

    public static void exercise8(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms");
        double kgs = scanner.nextDouble();

        System.out.println("Enter your height in centimeters ");
        double cm = scanner.nextDouble();

        double bmi = kgs / Math.pow((double) (cm / 100), 2);

        System.out.printf("BMI is: %.2f", bmi);

        scanner.close();
    }

    public static void exercise9(){
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You need to enter 5 numbers.");
        for (int i = 0; i < 5; i++) {
            System.out.printf("#%d Enter number: \n\r", i+1);
            max = Math.max(max, scanner.nextInt());
        }
        System.out.printf("%d is the biggest number\n\r", max);
        scanner.close();
    }

    public static void exercise10(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 2000; i++) {
            int n = 10 + (int) (Math.random() * (20 - 10 + 1 ));
            System.out.println(n);
            max = Math.max(max, n);
        }
        System.out.printf("The biggest number is %d", max);
    }
}
