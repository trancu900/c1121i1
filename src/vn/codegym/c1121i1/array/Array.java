package vn.codegym.c1121i1.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    int items[] = new int[9];

    public void push(int number) {
        items[0] = number;
    }

    public int[] getItems() {
        return items;
    }

    public static void main(String[] args) {
        int array[] = new int[4];
        int number = 1;
        System.out.println(Arrays.toString(array));
        System.out.println(number);
        testReference(array, number);
        System.out.println(Arrays.toString(array));
        System.out.println(number);
    }

    public static void testReference(int[] passReference, int passValue) {
        passReference[2] = 1;
        passValue=10;
    }
}
