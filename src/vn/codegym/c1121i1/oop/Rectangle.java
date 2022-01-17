package vn.codegym.c1121i1.oop;

public class Rectangle {
    private double width;
    private double height;
    // private double area;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }


//    public double getArea() {
//        return area;
//    }
//
//    public void setArea(double area) {
//        this.area = area;
//    }

}
