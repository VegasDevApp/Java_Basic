package random;

public class Exercise {
    public static void main(String[] args) {

        //exercise1(1, 10);
        //exercise2(1, 10);
        //exercise3(1, 100);
        //exercise4(30, 80);
        //exercise5(200, 750);
        //exercise6(200, 750);
        //exercise7(0, 100);
        //exercise8();
        //exercise9();
        //exercise10();
    }

    public static void exercise1(int min, int max) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            int number = min + (int) (Math.random() * (max - min + 1));
            sum += number;
            System.out.printf("Number #%d: %d\n\r", i + 1, number);
        }

        System.out.println("Summary of all numbers is " + sum);
    }

    public static void exercise2(int min, int max) {
        int sum = 0;
        short ittr = 3;
        for (int i = 0; i < ittr; i++) {
            int number = min + (int) (Math.random() * (max - min + 1));
            sum += number;
            System.out.printf("Number #%d: %d\n\r", i + 1, number);
        }

        System.out.println("Average of all numbers is " + sum / ittr);
    }

    public static void exercise3(int min, int max) {
        int theNumber = min + (int) (Math.random() * (max - min + 1));
        String numberDescription = theNumber % 2 == 0 ? "even" : "odd";

        System.out.printf("The number is %d and it %s number!", theNumber, numberDescription);
    }

    public static void exercise4(int min, int max) {
        int theNumber = min + (int) (Math.random() * (max - min + 1));
        String numberDescription = theNumber % 2 == 0 ? "even" : "odd";

        System.out.printf("The number is %d and it %s number!", theNumber, numberDescription);
    }

    public static void exercise5(int min, int max) {
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            int newNumber = min + (int) (Math.random() * (max - min + 1));
            //System.out.println("newNumber = " + newNumber);
            maxNumber = Math.max(maxNumber, newNumber);
        }

        System.out.println("The biggest number is: " + maxNumber);

    }

    public static void exercise6(int min, int max) {
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int newNumber = min + (int) (Math.random() * (max - min + 1));
            //System.out.println("newNumber = " + newNumber);
            minNumber = Math.min(minNumber, newNumber);
        }

        System.out.println("The smallest number is: " + minNumber);
    }

    public static void exercise7(int min, int max) {
        int MEASUREMENT = 50;
        int num = min + (int) (Math.random() * (max - min + 1));
        String condition = num > MEASUREMENT ? "bigger then" : "lower then";
        if (num == MEASUREMENT) condition = "equal to";
        System.out.printf("Number %d is %s %d", num, condition, MEASUREMENT);
    }

    public static void exercise8() {
        int min = 5;
        int max = 50;
        int firstNumber = min + (int) (Math.random() * (max - min - 1));
        int secondNumber = min + (int) (Math.random() * (max - min - 1));
        int width = Math.max(firstNumber, secondNumber);
        int height = Math.min(firstNumber, secondNumber);

        int area = width * height;
        int per = (width + height) * 2;

        System.out.printf("Width = %d, Height = %d, area = %d, perimeter = %d", width, height, area, per);
    }

    public static void exercise9(){
        int radius = 3 + (int)(Math.random() * 6);
        //System.out.println("radius " + radius);
        int area = (int)Math.pow(radius, 2);
        System.out.printf("Area equal to %d", area);
    }

    public static void exercise10(){
        int num = -10 + (int)(Math.random() * (10 - (-10) + 1));
        System.out.println(num);
    }
}
