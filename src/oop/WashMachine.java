package oop;

public class WashMachine {

    private int timeInMinutes = 160;

    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void Tick(){
        this.timeInMinutes -= 1;
        this.hours /= 60;
        this.minutes %= 60;
    }

}
