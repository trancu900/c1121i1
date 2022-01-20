package vn.codegym.c1121i1.compara;

public class Circle implements Comparable<Circle> {
    private double radius;
    private String name;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Circle o) {
        double result = radius - o.radius;
        return result > 0 ? 1 : (result < 0 ? -1 : 0);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
