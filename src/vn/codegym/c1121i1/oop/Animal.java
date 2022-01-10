package vn.codegym.c1121i1.oop;

public class Animal {
    private String name;
    private int age;

    public void eat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1)
            this.age = age;
        else
            System.out.println("Tuoi phai lon 1");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
