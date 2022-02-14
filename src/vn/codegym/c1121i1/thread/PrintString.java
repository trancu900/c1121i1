package vn.codegym.c1121i1.thread;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class PrintString {

    static public void print() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            byte[] array = new byte[1]; // length is bounded by 7
            new Random().nextBytes(array);
            String generatedString = new String(array, StandardCharsets.UTF_8);
            System.out.println("PrintString:" + generatedString);
            Thread.sleep(2000);
        }
    }
}
