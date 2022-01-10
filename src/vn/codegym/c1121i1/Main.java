package vn.codegym.c1121i1;

import vn.codegym.c1121i1.oop.StopWatch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] array = stopWatch.randomArray();
        stopWatch.selectionSort(array);
        System.out.println(Arrays.toString(array));
        stopWatch.stop();
        System.out.printf("Thoi gian:%d", stopWatch.getElapsedTime());
    }
}
