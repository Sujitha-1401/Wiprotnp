package VedioRentalInventarySystem;


	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        VideoStore store = new VideoStore();

	        while (true) {

	            System.out.println("\n===== VIDEO RENTAL INVENTORY SYSTEM =====");
	            System.out.println("1. Add Video");
	            System.out.println("2. Display Videos");
	            System.out.println("3. Rent Video");
	            System.out.println("4. Return Video");
	            System.out.println("5. Exit");

	            System.out.print("Enter Choice : ");
	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:

	                    System.out.print("Enter Video ID : ");
	                    int id = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print("Enter Video Title : ");
	                    String title = sc.nextLine();

	                    store.addVideo(new Video(id, title));

	                    break;

	                case 2:

	                    store.displayVideos();
	                    break;

	                case 3:

	                    System.out.print("Enter Video ID to Rent : ");
	                    int rentId = sc.nextInt();

	                    store.rentVideo(rentId);

	                    break;

	                case 4:

	                    System.out.print("Enter Video ID to Return : ");
	                    int returnId = sc.nextInt();

	                    store.returnVideo(returnId);

	                    break;

	                case 5:

	                    System.out.println("Thank You");
	                    sc.close();
	                    System.exit(0);

	                default:

	                    System.out.println("Invalid Choice");
	            }

	        }

	    }

	}

