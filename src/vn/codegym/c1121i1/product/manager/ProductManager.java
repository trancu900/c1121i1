package vn.codegym.c1121i1.product.manager;

import vn.codegym.c1121i1.caze.study.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    public ProductManager() {

    }

    public void show() {
        System.out.println("----------------------------------------- DANH SÁCH NGƯỜI DÙNG--------------------------------------- ");
        System.out.printf("%-5s %-22s %-15s %-22s  \n", "Id", "Tên", "Giá", "Số lượng");
        for (Product product : products) {
            System.out.printf("%-5d %-22s %-15s %-22s\n", product.getId(), product.getName(), product.getPrice(), product.getQuantity());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------  ");
        System.out.println(" ");
    }


    public void add() {
        Product product = getProduct();
        products.add(product);
        System.out.println("Thêm sản phẩm thành công:");
    }

    public Product getProduct() {
        long id = System.currentTimeMillis();
        System.out.print("Nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.print("Nhập giá:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng:");
        int quantity = Integer.parseInt(scanner.nextLine());
        return new Product(id, name, price, quantity);
    }


}
