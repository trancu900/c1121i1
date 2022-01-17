package vn.codegym.c1121i1.inhertance;

public class Penguin extends Animal implements Swimable, Runable, Eatable {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("chim canh cut: " + name + "an ca");
    }

    public void run() {
        System.out.println("chim canh cut: " + name + "dang chay");
    }

    @Override
    public void swim() {
        System.out.println("chim canh cut: " + name + "dang boi");
    }
}
