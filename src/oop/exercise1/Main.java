package oop.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clock c1 = new Clock();
        Scanner scanner = new Scanner(System.in);

        boolean inputSucceed = false;

        do {
            System.out.println("Please enter hours");
            inputSucceed = c1.setHours(scanner.nextInt());
            if (!inputSucceed){
                System.out.println(
                        "\n\nValue you provided is invalid.\nPlease try again.\nValid values for hours is in range 0-23");
            }
        } while (!inputSucceed);
        inputSucceed = false;

        do {
            System.out.println("Please enter minutes");
            inputSucceed = c1.setMinutes(scanner.nextInt());
            if (!inputSucceed){
                System.out.println(
                        "\n\nValue you provided is invalid.\nPlease try again.\nValid values for minutes is in range 0-59");
            }
        } while (!inputSucceed);
        inputSucceed = false;

        do {
            System.out.println("Please enter seconds");
            inputSucceed = c1.setSeconds(scanner.nextInt());
            if (!inputSucceed){
                System.out.println(
                        "\n\nValue you provided is invalid.\nPlease try again.\nValid values for seconds is in range 0-59");
            }
        } while (!inputSucceed);

        System.out.printf("\nCurrent time is: %s\n", c1.show());

        // Increase value twice
        c1.tick();
        c1.tick();

        System.out.println("2 seconds were added");
        System.out.printf("\nCurrent time is: %s\n", c1.show());
        System.out.println("Reset clock values");
        c1.reset();
        System.out.printf("\nCurrent time is: %s\n", c1.show());

        scanner.close();
    }
}
