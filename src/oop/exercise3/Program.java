package oop.exercise3;

public class Program {
    public static Person[] sortByWeight(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].getWeight() > persons[j].getWeight()) {
                    Person tmp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = tmp;
                }
            }
        }
        return persons;
    }

    public static Person[] sortByHeight(Person[] persons) {

        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].getHeight() < persons[j].getHeight()) {
                    Person tmp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = tmp;
                }
            }
        }
        return persons;
    }
}
