package vn.codegym.c1121i1.inhertance;

public class Cat implements Comparable<Cat> {
    public Cat(int weight) {
        this.weight = weight;
    }

    private int weight;

    @Override
    public int compareTo(Cat o) {
        return this.weight - o.weight;
    }
}
