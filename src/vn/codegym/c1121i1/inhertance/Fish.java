package vn.codegym.c1121i1.inhertance;

public abstract class Fish extends Animal implements Swimable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("fish:" + name + "boi bang vay");
    }
}
