package vn.codegym.c1121i1.caze.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    System.out.println("nguoi dung");
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
}
