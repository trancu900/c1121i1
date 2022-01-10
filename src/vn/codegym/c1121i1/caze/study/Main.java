package vn.codegym.c1121i1.caze.study;

import vn.codegym.c1121i1.caze.study.model.User;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMainMenu();
    }

    public static void showMainMenu() {
        System.out.println("------------------------------------");
        System.out.println("1. Quản lý người dùng");
        System.out.println("2. Quản lý sách");
        System.out.println("3. Quản lý thể loại");
        System.out.println("------------------------------------");

        int option;
        do {
            System.out.print("Chọn chức năng:");
            Scanner scanner = new Scanner(System.in);
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    showUserMenu();
                    break;
                case 2:
                    System.out.println("sach");
                    break;
                case 3:
                    System.out.println("the lai");
                    break;
                default:
                    System.out.println("Nhap sai vui long chọn lại chức năng");
                    option = -1;
                    break;
            }
        } while (option == -1);
    }

    public static void showUserMenu() {
        System.out.println("------------------------------------");
        System.out.println("1. Thêm người dùng");
        System.out.println("2. Sửa người dùng");
        System.out.println("------------------------------------");
        int option;
        do {
            System.out.print("Chọn chức năng:");
            Scanner scanner = new Scanner(System.in);
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    User user = getUser();
                    System.out.println(user);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Nhap sai vui long chọn lại chức năng");
                    option = -1;
                    break;
            }
        } while (option == -1);
    }

    public static User getUser() {
        long id = System.currentTimeMillis();
        System.out.print("Nhập tên:");
        String name = scanner.nextLine();
        System.out.print("Nhập email:");
        String email = scanner.nextLine();
        System.out.print("Nhập sdt:");
        String mobile = scanner.nextLine();
        // User user = new User(id, name, email, mobile);
        // return user;
        return new User(id, name, email, mobile);
    }


}
