package vn.codegym.c1121i1.oop;

import vn.codegym.c1121i1.oop.staticc.Math;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal1 = new Animal();
        System.out.println(myAnimal1.getAge());
        myAnimal1.setName("Cat");
        myAnimal1.setAge(-1);
        Animal myAnimal2 = new Animal();
        myAnimal2.setName("Dung Dog");
        myAnimal2.setAge(-200);
        myAnimal1.setAge(200);
        System.out.println(myAnimal2);

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());

    }
}
