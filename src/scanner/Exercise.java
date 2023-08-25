package scanner;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //exercise1();
        exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise8();
        //exercise9();
        //exercise10();


    }

    public static void exercise1(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in your first name:");
        String firstName = scanner.next();

        System.out.println("Thanks a lot!");
        System.out.println("Please type in your last name:");
        String lastName = scanner.next();

        System.out.println("Great! Now please let us to know how old are you?");
        float age = scanner.nextFloat();

        System.out.println("And last question, what is your city?");
        String city = scanner.next();

        System.out.printf("My is name %s %s, I'm %.1f years old and live at %s%n",
                firstName, lastName, age, city);

        scanner.close();

    }

    public static void exercise2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, I need three numbers from you!");
        System.out.println("Give me the first number dude!");
        int first = scanner.nextInt();

        System.out.println("Cool, next one:");
        int second = scanner.nextInt();

        System.out.println("Got it, next one:");
        int third = scanner.nextInt();

        System.out.printf("Okay, so summary of these numbers is equal to: %d", (first + second + third));
    }

    public static void exercise3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, I need three floats from you!");
        System.out.println("Give me the first float dude!");
        float first = scanner.nextFloat();

        System.out.println("Cool, next one:");
        float second = scanner.nextFloat();

        System.out.println("Got it, next one:");
        float third = scanner.nextFloat();

        float result = (first + second + third) / 3;

        System.out.printf("Okay, so average of these numbers is equal to: %f", result);
    }

    public static void exercise4(){
        System.out.println("Give me some number, bro...");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number%2==0 ? "Even" : "Odd");
        scanner.close();
    }

    public static void exercise5(){
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        boolean isStartsWithCapitalM = name.startsWith("M");

        System.out.printf("Your name %s starts with capital M.", isStartsWithCapitalM ? "do" : "do not");

        scanner.close();
    }

    private static void exercise6() {
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        boolean isStartsWithLowerM = name.startsWith("m");

        System.out.printf("Your name %s starts with lower M.", isStartsWithLowerM ? "do" : "do not");

        scanner.close();
    }

    private static void exercise7() {
        Scanner scanner = new Scanner(System.in);

        int max;

        System.out.println("Hey, I need three numbers from you!");
        System.out.println("Give me ti first number dude!");
        max = scanner.nextInt();

        System.out.println("Cool, next one:");
        max = Math.max(scanner.nextInt(), max);

        System.out.println("Got it, next one:");
        max = Math.max(scanner.nextInt(), max);

        System.out.printf("The most bigger number was %d", max);

        scanner.close();
    }

    private static void exercise8() {
        Scanner scanner = new Scanner(System.in);

        int min;

        System.out.println("Hey, I need three numbers from you!");
        System.out.println("Give me ti first number dude!");
        min = scanner.nextInt();

        System.out.println("Cool, next one:");
        min = Math.min(scanner.nextInt(), min);

        System.out.println("Got it, next one:");
        min = Math.min(scanner.nextInt(), min);

        System.out.printf("The smallest number was %d", min);

        scanner.close();
    }

    private static void exercise9() {
        System.out.println("האם אתה בטוח שברצונך לצאת?");

        Scanner scanner = new Scanner(System.in);

        char input = scanner.next().toLowerCase().charAt(0);
        switch (input){
            case 'n':
                System.out.println("טוב שהחלטת להישאר");
                break;
            case 'y':
                System.out.println("תודה ולהתראות");
                break;
            default:
                System.out.println("לא נתמך, תודה להתראות");
        }

        scanner.close();
    }

    private static void exercise10() {
        System.out.println("How old are you?");

        Scanner scanner = new Scanner(System.in);
        float age = scanner.nextFloat();

        if(age >= 18f){
            System.out.println("How about a beer?!");
        } else {
            System.out.println("Would you like a cup of tea?");
        }

        scanner.close();
    }

}
