package vn.codegym.c1121i1.oop;

import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public int[] randomArray() {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (new Random()).nextInt(100000) + 1;
        }
        return array;
    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }
}
