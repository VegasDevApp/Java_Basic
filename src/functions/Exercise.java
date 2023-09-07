package functions;

import java.time.LocalTime;

public class Exercise {
    public static void main(String[] args) {
        //exercise10();
        //exercise1();
        //exercise2();
        exercise9(8);
    }

    public static void exercise1() {
        sayMyName("Alexey", "Koloty");
        sayMyName("Alexey", "Koloty");
    }

    public static void exercise2() {
        printEvenNumbers(2, 200);
        printEvenNumbers(2, 200);
    }

    public static void exercise9(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(j == n-1){
                    System.out.println(" * ");
                } else if(i == 0 || i == n-1 || j == 0){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

        }
    }

    public static void exercise10() {
        var h = LocalTime.now().getHour();
        var m = LocalTime.now().getMinute();
        var s = LocalTime.now().getSecond();

        System.out.printf("%02d:%02d:%02d\n\r", h, m, s);
    }

    public static void sayMyName(String firstName, String lastName) {
        System.out.println("My full name is: " + firstName + " " + lastName);
    }

    public static void printEvenNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
