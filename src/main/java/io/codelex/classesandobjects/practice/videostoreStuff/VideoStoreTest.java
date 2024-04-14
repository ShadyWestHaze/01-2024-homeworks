package io.codelex.classesandobjects.practice.videostoreStuff;

import src.main.java.io.codelex.classesandobjects.practice.videostoreStuff.VideoStore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore videoStore = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video ");
            System.out.println("Choose 3 to return video ");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }


        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            if (i == 0) {
                scanner.nextLine();
            }
            String movieName = scanner.nextLine();

            videoStore.addVideo(movieName);
            videoStore.inputRating(movieName);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter the name of the video you want to rent:");
        videoStore.getListOfAvailableVideos();
        scanner.nextLine();
        String title = scanner.nextLine();
        videoStore.checkOut(title);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter the name of the video you want to return:");
        videoStore.getListOfTakenVideos();
        scanner.nextLine();
        String title = scanner.nextLine();
        videoStore.checkIn(title);
    }
}
