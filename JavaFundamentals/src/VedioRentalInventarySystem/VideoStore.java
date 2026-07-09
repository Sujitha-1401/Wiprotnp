package VedioRentalInventarySystem;


	import java.util.ArrayList;

	public class VideoStore {

	    ArrayList<Video> videos = new ArrayList<>();

	    public void addVideo(Video video) {
	        videos.add(video);
	        System.out.println("Video Added Successfully.");
	    }

	    public void displayVideos() {

	        System.out.println("--------------------------------------");
	        System.out.println("ID\tTitle\tStatus");
	        System.out.println("--------------------------------------");

	        for (Video v : videos) {
	            v.display();
	        }
	    }

	    public void rentVideo(int id) {

	        for (Video v : videos) {

	            if (v.getId() == id) {

	                if (!v.isRented()) {
	                    v.rentVideo();
	                    System.out.println("Video Rented Successfully.");
	                } else {
	                    System.out.println("Video Already Rented.");
	                }

	                return;
	            }
	        }

	        System.out.println("Video Not Found.");
	    }

	    public void returnVideo(int id) {

	        for (Video v : videos) {

	            if (v.getId() == id) {

	                if (v.isRented()) {
	                    v.returnVideo();
	                    System.out.println("Video Returned Successfully.");
	                } else {
	                    System.out.println("Video was not rented.");
	                }

	                return;
	            }
	        }

	        System.out.println("Video Not Found.");
	    }
	}

