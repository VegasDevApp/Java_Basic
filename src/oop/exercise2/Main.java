package oop.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Requirement #1
        Car car = new Car();
        car.setCarNumber(1255929);
        System.out.printf("Car number: %d\nCurrent speed: %d\n", car.getCarNumber(), car.getCurrentSpeed());
        // End of Requirement #1

        Scanner scanner = new Scanner(System.in);

        // Requirement #2
        boolean isSucceed = false;
        do {
            System.out.println("To which speed you would like to set the car?");
            int wantedSpeed = scanner.nextInt();
            isSucceed = setSpeed(wantedSpeed, car);
        } while (!isSucceed);
        System.out.printf("Car number: %d\nCurrent speed: %d\n", car.getCarNumber(), car.getCurrentSpeed());
        // End of Requirement #2

        // Requirement #3
        setSpeed(-2, car);
        System.out.printf("Car number: %d\nCurrent speed: %d\n", car.getCarNumber(), car.getCurrentSpeed());
        // End of Requirement #3

        // Requirement #4
        stopTheCar(car);
        System.out.printf("Car number: %d\nCurrent speed: %d\n", car.getCarNumber(), car.getCurrentSpeed());
        // End of Requirement #4

        scanner.close();
    }

    public static void stopTheCar(Car car){
        setSpeed(car.getCurrentSpeed() * -1, car);
    }

    public static boolean setSpeed(int wantedSpeed, Car car) {
        int speedPrediction = car.getCurrentSpeed() + wantedSpeed;
        boolean isSucceed = false;
        if (speedPrediction < 0) {
            System.out.printf("Your current speed is %d, you can't go below 0km\\h\n", car.getCurrentSpeed());
        } else if (speedPrediction > car.getMAX_SPEED()) {
            System.out.printf("Your current speed is %d, you can't go over %dkm\\h\n", car.getCurrentSpeed(), car.getMAX_SPEED());
        } else if (car.getCurrentSpeed() == speedPrediction) {
            System.out.println("You are already on this speed");
        } else {
            boolean toAccelerate = speedPrediction > car.getCurrentSpeed();

            while (car.getCurrentSpeed() != speedPrediction) {
                if (toAccelerate) {
                    car.Accelerate();
                } else {
                    car.Decelerate();
                }
            }
            isSucceed = true;
        }

        return isSucceed;
    }
}
