package vn.codegym.c1121i1.oop.staticc;

public class Math {
    static float PI;

    static {
        System.out.println("static block");
        PI = 3.14f;
    }

    public void test() {
        pow(1, 2);
    }

    public static double pow(double a, double b) {
        return 0.4;
    }

    public static double tans(double angle) {
        return 0.4;
    }

}
