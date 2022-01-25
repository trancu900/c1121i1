package vn.codegym.c1121i1.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Dung", 18),
                new Student("Truong", 34),
                new Student("Duong", 50),
                new Student("Tung", 18),
                new Student("Khoan", 15),
                new Student("Phuong", 30)
        };
        //Dung, Duong, Khoan,Phuong, Truong, Tung
        //sortByName(students);
        //Khoan, Dung, Tung, Phuong,Truong, Duong
        sortByAge(students);
//        System.out.println(Arrays.toString(students));
        for (Student student : students) {
            System.out.print(student.name+", ");
        }
    }

    private static void sortByAge(Student[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                Student minStudent = numbers[min];
                Student jStudent = numbers[j];
                int result = minStudent.compareTo(jStudent);
                if (result > 0)
                    min = j;
            }
            if (min != i) {
                Student temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }
        }
    }

    private static void sortByName(Student[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                String minName = numbers[min].name;
                String jName = numbers[j].name;
                int result = minName.compareTo(jName);
                if (result > 0)
                    min = j;
            }
            if (min != i) {
                Student temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }
        }
    }

    private static void sort(float[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[min] > numbers[j])
                    min = j;
            }
            if (min != i) {
                float temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }
        }
    }
}
