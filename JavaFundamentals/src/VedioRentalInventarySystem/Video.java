package VedioRentalInventarySystem;

public class Video {

    private int id;
    private String title;
    private boolean rented;

    public Video(int id, String title) {
        this.id = id;
        this.title = title;
        this.rented = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return rented;
    }

    public void rentVideo() {
        rented = true;
    }

    public void returnVideo() {
        rented = false;
    }

    public void display() {
        System.out.println(id + "\t" + title + "\t" +
                (rented ? "Rented" : "Available"));
    }
}