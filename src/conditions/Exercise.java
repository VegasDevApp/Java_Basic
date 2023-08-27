package conditions;

import java.util.Scanner;

public class Exercise {
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
        int n = (int) (Math.random() * (101));
        if (n > 50) {
            System.out.println("Big");
        }

        if (n < 50) {
            System.out.println("Small");
        }

        if (n == 50) {
            System.out.println("Bingo");
        }

    }

    public static void exercise2() {
        int n = (int) (Math.random() * (101));
        if (n > 50) {
            System.out.println("Big");
        } else if (n < 50) {
            System.out.println("Small");
        } else {
            System.out.println("Bingo");
        }
    }

    public static void exercise3() {
        double salary = 5000 + (int) (Math.random() * (1001));

        double updatedSalary = salary * 1.1;

        if (updatedSalary > 6000) {
            updatedSalary = salary * 1.05;
        }

        System.out.printf("Updated salary: %.2f", updatedSalary);
    }

    public static void exercise4() {
        int big, mid, small, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please entre number");
        big = scanner.nextInt();

        System.out.println("Please entre number again");
        n = scanner.nextInt();
        if (n > big) {
            mid = big;
            big = n;
        } else {
            mid = n;
        }

        System.out.println("Please entre number again");
        n = scanner.nextInt();
        if (n > big) {
            small = mid;
            mid = big;
            big = n;
        } else if (n > mid) {
            small = mid;
            mid = n;
        } else {
            small = n;
        }

        System.out.printf("Big: %d, Mid: %d, Mid in ^3: %d, Small: %d", big, mid, (int) Math.pow(mid, 3), small);

        scanner.close();
    }

    public static void exercise5() {
        double salary = Math.random() * 120_001;
        double totalTax = 0;
        if (salary <= 23_000) {
            totalTax = salary * 0.1f;
        } else if (salary <= 50_000) {
            totalTax = salary * 0.2f;
        } else if (salary <= 100_000) {
            totalTax = salary * 0.3f;
        } else {
            totalTax = salary * 0.4f;
        }
        System.out.printf("You need to pay %.2f tax for salary %.2f, netto is %.2f\n\r",
                totalTax, salary, salary - totalTax);
    }

    public static void exercise6() {
        double salary = Math.random() * 120_001;

        double step1 = 23_000;
        double step2 = 50_000;
        double step3 = 100_000;
        //double step4 = 100_000;

        float tax1 = 0.1f;
        float tax2 = 0.2f;
        float tax3 = 0.3f;
        float tax4 = 0.4f;
        //float tax5 = 0.5f;

        double totalTax = 0;
        double countedSal = 0;
        float currentTax = tax1;
        double currentStep = step1;

        if (salary - countedSal >= currentStep) {
            totalTax += currentStep * currentTax;
            countedSal += currentStep;
        } else if (salary != countedSal) {
            totalTax += (salary - countedSal) * currentTax;
            countedSal += salary;
        }

        currentTax = tax2;
        currentStep = step2;

        if (salary - countedSal >= currentStep) {
            totalTax += currentStep * currentTax;
            countedSal += currentStep;
        } else if (salary != countedSal) {
            totalTax += (salary - countedSal) * currentTax;
            countedSal += salary - countedSal;
        }

        currentTax = tax3;
        currentStep = step3;

        if (salary - countedSal >= currentStep) {
            totalTax += currentStep * currentTax;
            countedSal += currentStep;
        } else if (salary != countedSal) {
            totalTax += (salary - countedSal) * currentTax;
            countedSal += salary - countedSal;
        }

        currentTax = tax4;

        if (salary != countedSal) {
            totalTax += (salary - countedSal) * currentTax;
            countedSal += salary;
        }

        System.out.printf("You need to pay %.2f tax for salary %.2f, netto is %.2f\n\r",
                totalTax, salary, salary - totalTax);
    }

    public static void exercise7() {
        int year = 1900 + (int) (Math.random() * (2023 - 1900 + 1));

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("Year %d is leap year\n\r", year);
        } else {
            System.out.printf("Year %d isn't leap year\n\r", year);
        }
    }

    public static void exercise8() {
        System.out.println("Please enter month (number 1...12)");
        Scanner scanner = new Scanner(System.in);
        int month;
        try {
            month = scanner.nextInt();
        } catch (Exception ex) {
            month = 0;
        }

        scanner.close();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("Not supported value");
        }
    }

    public static void exercise9() {
        System.out.println("Please enter month (number 1...12)");
        Scanner scanner = new Scanner(System.in);
        int month;
        try {
            month = scanner.nextInt();
        } catch (Exception ex) {
            month = 0;
        }

        if (month > 12) month = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("Enter year");
                int year = scanner.nextInt();
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Not supported value");
        }

        scanner.close();
    }

    public static void exercise10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        float age = scanner.nextFloat();
        String res = age >= 21 ? "יכול להיכנס" : "אינו מאושר להיכנס";
        System.out.println(res);
    }
}

