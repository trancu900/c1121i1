package vn.codegym.c1121i1.oop.nested.clazz;

public class Main {
    public static void main(String[] args) {
//        User user = new User("DUng", "Hue", "Thuy Xuan", "Khu vo gia cu");
//        System.out.println(user.toString());
//        System.out.println(user);
//        User.Address address = new User.Address("Hue", "Thuy Xuan", "Khu vo gia cu");
//        User user = new User("DUng", address);
//        System.out.println(user.toString());
//        System.out.println(user);
        Object user = new User("Dung");
        User.Address address = new User.Address("Hue", "Thuy Xuan", "Khu vo gia cu");
//        User user = new User("DUng", address);
    }
}
