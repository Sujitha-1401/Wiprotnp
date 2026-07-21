package Multithreding.ThreadCreation;



	import java.util.Random;

	class ColourThread implements Runnable {

	    String[] colours = {
	            "white",
	            "blue",
	            "black",
	            "green",
	            "red",
	            "yellow"
	    };

	    public void run() {

	        Random random = new Random();

	        for (int i = 0; i < 10; i++) {
	            int index = random.nextInt(colours.length);
	            System.out.println(colours[index]);

	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	public class Problem2 {

	    public static void main(String[] args) {

	        Thread t = new Thread(new ColourThread());
	        t.start();
	    }
	}

