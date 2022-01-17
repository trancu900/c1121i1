package vn.codegym.c1121i1.inhertance;

public class Frog extends Animal implements Swimable, Runable, Eatable {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("frog: " + name + " eat tap");
    }

    @Override
    public void swim() {
        System.out.println("frog:" + name + "dang boi");
    }

    @Override
    public void run() {
        System.out.println("frog:" + name + "dang nhay");
    }
}
