package loops;

public class Algorithms {
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
        int num = (int) (Math.random() * 7) + 1;
        int factorial = 1;
        System.out.printf("Factorial for number %d\n\r", num);
        for (int i = 2; i <= num; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
    }

    public static void exercise2() {
        int num = (int) (Math.random() * 7) + 1;
        int factorial = 1;
        System.out.printf("Factorial for number %d\n\r", num);
        for (int i = num; i >= 2; i--) {
            factorial *= i;
            System.out.println(factorial);
        }
    }

    public static void exercise3() {
        int num = (int) (Math.random() * 7) + 1;
        int factorial = 1;
        System.out.printf("Factorial for number %d\n\r", num);

        int counter = 2;
        while (counter <= num) {
            factorial *= counter++;
            System.out.println(factorial);
        }
    }

    public static void exercise4() {
        int num = (int) (Math.random() * 7) + 1;
        int factorial = 1;
        System.out.printf("Factorial for number %d\n\r", num);

        int counter = num;
        while (counter >= 2) {
            factorial *= counter--;
            System.out.println(factorial);
        }
    }

    public static void exercise5() {
        int num = (int) (Math.random() * 10_001);
        int orgNum = num;
        int res = 0;
        while (num != 0) {
            num = num / 10;
            res++;
        }
        System.out.printf("Number %d have %d digits\n\r", orgNum, res);
    }

    public static void exercise6() {
        int num = (int) (Math.random() * 10_001);

        int res = num % 10;

        System.out.printf("The last digit of %d is %d\n\r", num, res);
    }

    public static void exercise7() {
        int num = (int) (Math.random() * 10_001);
        int orNum = num;

        while (num > 9) {
            num = num / 10;
        }

        System.out.printf("The first digit of %d is %d\n\r", orNum, num);
    }

    public static void exercise8() {
        int num = (int) (Math.random() * 10_001);
        int orNum = num;
        int res = 0;

        while (num > 0) {
            res *= 10;
            res += num % 10;
            num = num / 10;
        }

        System.out.printf("The opposite of %d is %d\n\r", orNum, res);
    }

    public static void exercise9() {
        int num = (int) (Math.random() * 100_001);
        int orNum = num;
        int res = 0;

        while (num > 0) {
            res *= 10;
            res += num % 10;
            num = num / 10;
        }

        String sIsPalindrome = orNum == res ? "is palindrome" : "is not palindrome";

        System.out.printf("The opposite of %d is %d and %s\n\r", orNum, res, sIsPalindrome);
    }

    public static void exercise10() {
        int num = (int) (Math.random() * 100_001);
        int orNum = num;

        int rN = -1; // right digit
        int lN = -1; // left digit
        int aN = 0; // total digits
        int sum = 0;
        int oppo = 0; //opposite

        while (num > 0){

            oppo *= 10;
            int cutR = num % 10;
            if (rN == -1) rN = cutR;
            if(lN == -1 && num < 10) lN = num;
            aN++;
            sum += cutR;
            oppo += cutR;
            num = num / 10;
        }
        System.out.println("Number " + orNum);
        System.out.println("Right digit " + rN);
        System.out.println("Left digit " + lN);
        System.out.println("Total digits " + aN);
        System.out.println("Sum:  " + sum);
        System.out.println("Opposite number: " + oppo);
        System.out.println("Is palindrome: " + (orNum == oppo));
    }
}
