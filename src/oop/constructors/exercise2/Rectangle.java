package oop.constructors.exercise2;

public class Rectangle {
    private int rectangleLength;
    private int rectangleWidth;

    public Rectangle() {
        this.rectangleLength = 10;
        this.rectangleWidth = 10;
    }

    public Rectangle(int length, int rectangleWidth) {
        this.setRectangleLength(length);
        this.setRectangleWidth(rectangleWidth);
    }

    public int getRectangleLength() {
        return rectangleLength;
    }

    public void setRectangleLength(int rectangleLength) {
        // in real world we should throw an exception if it negative number
        this.rectangleLength = Math.abs(rectangleLength);
    }

    public int getRectangleWidth() {
        return rectangleWidth;
    }

    public void setRectangleWidth(int rectangleWidth) {
        // in real world we should throw an exception if it negative number
        this.rectangleWidth = Math.abs(rectangleWidth);
    }

    public int getPerimeter() {
        return (this.rectangleLength + this.rectangleWidth) * 2;
    }

    public int getArea() {
        return this.rectangleLength * this.rectangleWidth;
    }

    public void print(char c) {
       //char[][] rec = new[this.rectangleLength][this.rectangleWidth];
        for (int i = 0; i < this.rectangleLength; i++) {
            for (int j = 0; j < this.rectangleWidth; j++) {
                if(i == 0 || i == this.rectangleLength-1 || j == 0 || j==this.rectangleWidth-1){
                    System.out.printf(" %s ", c);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void print(String s){
        this.print(s.charAt(0));
    }

    public void print(){
        this.print('*');
    }
}
