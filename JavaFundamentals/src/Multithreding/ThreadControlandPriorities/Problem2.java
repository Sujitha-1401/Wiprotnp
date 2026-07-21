package Multithreding.ThreadControlandPriorities;
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
        }
    }
}

public class Problem2 {
    public static void main(String[] args) throws InterruptedException {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        even.join();   // Wait until even thread finishes

        odd.start();
    }
}