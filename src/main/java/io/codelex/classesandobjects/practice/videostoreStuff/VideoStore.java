package src.main.java.io.codelex.classesandobjects.practice.videostoreStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoStore {


    private final List<Video> videos;

    public VideoStore() {
        this.videos = new ArrayList<>();
    }

    public void addVideo(String title) {
        Video video = new Video(title, false, 0.0);
        videos.add(video);
        System.out.println("Video \"" + title + "\" added successfully.");
    }

    public void checkOut(String title) {
        for (Video video : videos) {

            if (video.getTitle().equalsIgnoreCase(title)) {
                if (!video.getIsTakenState()) {
                    video.checkOut();
                    System.out.println("Video \"" + title + "\" checked out successfully.");
                } else {
                    System.out.println("Sorry, the video \"" + title + "\" is already checked out.");
                }
                return;
            }
        }
        System.out.println("Video \"" + title + "\" not found.");
    }

    public void checkIn(String title) {
        for (Video video : videos) {
            if (video.getTitle().equalsIgnoreCase(title)) {
                if (video.getIsTakenState()) {
                    video.checkIn();
                    System.out.println("Video \"" + title + "\" returned successfully.");
                } else {
                    System.out.println("Sorry, the video \"" + title + "\" is not currently checked out.");
                }
                return;
            }
        }
        System.out.println("Video \"" + title + "\" not found.");
    }

    public void inputRating(String title) {
        for (Video video : videos) {
            if (video.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Enter rating for the video \"" + title + "\": ");
                Scanner userInput = new Scanner(System.in);
                double rating = userInput.nextDouble();
                video.setRating(rating);
                System.out.println("Rating for the video \"" + title + "\" set to " + rating);
                return;
            }
        }
        System.out.println("Video \"" + title + "\" not found.");
    }

    public void getListOfAvailableVideos() {
        if (videos.isEmpty()) {
            System.out.println("No videos available.");
        } else {
            System.out.println("Available videos:");
            for (Video video : videos) {
                if (!video.getIsTakenState()) {
                    System.out.println("Title: " + video.getTitle() +
                            ", Rating: " + video.getRating() +
                            ", Status: Available for rental");
                }
            }
        }
    }

    public void getListOfTakenVideos() {
        if (videos.isEmpty()) {
            System.out.println("No videos are currently taken.");
        } else {
            System.out.println("Taken videos:");
            for (Video video : videos) {
                if (video.getIsTakenState()) {
                    System.out.println("Title: " + video.getTitle() +
                            ", Rating: " + video.getRating() +
                            ", Status: Checked out by you");
                }
            }
        }
    }

}



