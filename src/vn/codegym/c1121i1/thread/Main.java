package vn.codegym.c1121i1.thread;

public class Main {
    public static void main(String[] args) {
        Power obj = new Power();//only one object
        ThreadPower5 p5 = new ThreadPower5(obj);
        ThreadPower8 p8 = new ThreadPower8(obj);
        p5.start();
        p8.start();

    }

    static class ThreadPower5 extends Thread {

        Power p;

        ThreadPower5(Power p) {
            this.p = p;
        }

        public void run() {
            p.printPower(5);
        }
    }

    static  class ThreadPower8 extends Thread {
        Power p;

        ThreadPower8(Power p) {
            this.p = p;
        }

        public void run() {
            p.printPower(8);
        }
    }
}
