package oop.constructors.exercise1;

public class Main {
    public static void main(String[] args) {
        Adult p1 = new Adult("Pegas", 170, "Fullstack Developer");
        Adult p2 = new Adult("Johnny", 171);
        Adult p3 = new Adult(p1);

        Adult[] adults = {p1, p2, p3};
        printAdult(adults);

        p1.setProfession("DevOps");
        printAdult(adults);
    }

    public static void printAdult(Adult adult){
        System.out.println("********************");
        adult.print();
        System.out.println();
    }

    public static void printAdult(Adult[] adults){
        for (Adult ad:adults
        ) {
            printAdult(ad);
        }
    }
}
