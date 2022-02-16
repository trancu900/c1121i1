package vn.ntt.librus.views;

import vn.ntt.librus.services.IUserService;
import vn.ntt.librus.services.UserService;

import java.util.Scanner;

public class UserView {
    private static final IUserService userService = new UserService();
    private static final Scanner scanner = new Scanner(System.in);


    public static void run() {
        int option;

        do {
            try {


                show();
                System.out.println("\nChọn chức năng ");
                System.out.print(" ⭆ ");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        addUser();
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        break;
                }


            } catch (Exception e) {
                System.out.println("Nhập sai! vui lòng nhập lại");
            }
        } while (option != 0);
    }

    private static void addUser() {

    }

    public static void show() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  USERS MANAGER  ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Thêm người dùng               ⚪");
        System.out.println("⚪     2. Sửa thông tin người dùng      ⚪");
        System.out.println("⚪     3. Hiện danh sách người dùng     ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }


}
