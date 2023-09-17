package oop.exercise3;

public class Main {

    public static void main(String[] args) {

        // Requirement # 1
        String[] names = {
                "John Smith",
                "Emily Johnson",
                "Michael Brown",
                "Sarah Davis",
                "David Wilson",
                "Jennifer Lee",
                "James Anderson",
                "Jessica Martinez",
                "Daniel Taylor",
                "Linda Garcia"
        };

        double[] weightsInKg = {70.5, 58.2, 80.0, 65.7, 75.3, 62.1, 73.8, 64.5, 68.9, 71.2};
        int[] heightsInCm = {175, 162, 183, 167, 178, 160, 181, 165, 170, 172};
        Person[] persons = new Person[names.length];

        for (int i = 0; i < names.length; i++) {
            persons[i] = new Person();
            persons[i].setFullName(names[i]);
            persons[i].setHeight(heightsInCm[i]);
            persons[i].setWeight(weightsInKg[i]);
        }

        //printPersons(persons);

        // End of Requirement # 1

        // Requirement # 2
        //printPersons(Program.sortByHeight(persons));
        // End of Requirement # 2

        // Requirement # 3
        //printPersons(Program.sortByWeight(persons));
        // End of Requirement # 3

    }

    public static void printPersons(Person[] persons) {
        for (Person p : persons
        ) {
            System.out.println(p.show());
            System.out.println("*********************");
            System.out.println();
        }
    }

}
