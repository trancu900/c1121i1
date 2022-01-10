package vn.codegym.c1121i1.oop;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal1 = new Animal();
        myAnimal1.setName("Cat");
        myAnimal1.setAge(-1);
        Animal myAnimal2 = new Animal();
        myAnimal2.setName("Dung Dog");
        myAnimal2.setAge(-200);
        myAnimal1.setAge(200);

        System.out.println(myAnimal2);
    }
}
