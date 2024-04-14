package src.main.java.io.codelex.classesandobjects.practice.videostoreStuff;

public class Video {
    private final String title;
    private Boolean isTaken;
    private Double rating;

    public Video(String title, Boolean isTaken, Double rating) {

        this.title = title;
        this.isTaken = isTaken;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    public Boolean getIsTakenState() {
        return isTaken;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public void checkOut() {
        this.isTaken = true;
    }

    public void checkIn() {
        this.isTaken = false;
    }


}
