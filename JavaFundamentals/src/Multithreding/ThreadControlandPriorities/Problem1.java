package Multithreding.ThreadControlandPriorities;



	class NumberThread extends Thread {
	    public void run() {
	        try {
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(i);

	                if (i == 5) {
	                    Thread.sleep(5000); // 5000 milliseconds = 5 seconds
	                }
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	public class Problem1 {
	    public static void main(String[] args) {
	        NumberThread t = new NumberThread();
	        t.start();
	    }
	}

