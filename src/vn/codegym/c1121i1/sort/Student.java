package vn.codegym.c1121i1.sort;

public class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        int result = o.name.compareTo(this.name);
//        return result;
        return this.age - o.age;
    }
}
