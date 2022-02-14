package vn.codegym.c1121i1.thread;

import java.util.Random;

public class PrintNumber {

    static public void print() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("PrrintNumber: "+i);
            Thread.sleep(1000);
        }
    }
}
