package oop.exercise1;

public class Clock {
    private int minutes;
    private int hours;
    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public boolean setSeconds(int seconds) {
        boolean isValid = !(seconds > 59 || seconds < 0);
        if (isValid) this.seconds = seconds;
        return isValid;
    }

    public int getMinutes() {
        return minutes;
    }

    public void reset() {
        this.setHours(0);
        this.setMinutes(0);
        this.setSeconds(0);
    }

    public boolean setMinutes(int minutes) {
        boolean isValid = !(minutes > 59 || minutes < 0);
        if (isValid) this.minutes = minutes;
        return isValid;
    }

    public int getHours() {
        return hours;
    }

    public boolean setHours(int hours) {
        boolean isValid = !(hours < 0 || hours > 23);
        if (isValid) this.hours = hours;
        return isValid;
    }

    public void tick() {
        int minutes = this.getMinutes();
        int hours = this.getHours();
        int seconds = this.getSeconds();

        seconds++;
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        hours = hours % 24;
        minutes = minutes % 60;

        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public String show() {
        return String.format("%02d:%02d:%02d", this.getHours(), this.getMinutes(), this.getSeconds());
    }

}
