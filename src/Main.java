import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 1;
        int max = 100;
        System.out.println("Добро пожаловать в игру \"Угадай число\"!");
        System.out.printf("Я загадал число от %d до %d%n", min, max);

        Random rand = new Random();
        int numPiked = min + rand.nextInt(max - min + 1);
        int guess = 0; // число, введенное юзером
        int guessNum; // число попыток

        for (guessNum = 0; guess != numPiked; guessNum++) {
            System.out.println("Итак, какое это число?");
            guess = in.nextInt();

            if (guess < numPiked) {
                System.out.println("Загаданное число больше!");
            } else if (guess > numPiked) {
                System.out.println("Загаданное число меньше!");
            }
        }

        System.out.println("Точно!");
        System.out.printf("Ты угадал на %d попытки.", guessNum);
    }
}
