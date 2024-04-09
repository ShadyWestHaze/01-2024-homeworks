package src.main.java.io.codelex.polymorphism.practice.exercise2;

import java.util.Random;

public class MakeSounds {
    public static void main(String[] arg) {
        Sound[] sound = {new Parrot(), new Firework(), new Radio()};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(sound.length);
            sound[num].playSound();
        }
    }
}
