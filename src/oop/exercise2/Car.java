package oop.exercise2;

public class Car {
    private int carNumber;
    private int currentSpeed;

    private final int MAX_SPEED = 220;
    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public boolean setCarNumber(int carNumber) {
        boolean isValid = carNumber >= 10_000_00 && carNumber <= 99_999_99;
        if (isValid) this.carNumber = carNumber;
        return  isValid;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean Accelerate(){
        boolean canAccelerate = !(this.currentSpeed >= this.MAX_SPEED);
        if(canAccelerate){
            this.currentSpeed++;
        }
        return canAccelerate;
    }


    public boolean Decelerate(){
        boolean canDecelerate = (this.currentSpeed > 0);
        if(canDecelerate){
            this.currentSpeed--;
        }
        return canDecelerate;
    }
}
