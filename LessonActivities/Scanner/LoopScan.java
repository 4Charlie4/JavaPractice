package LessonActivities.Scanner;

import java.util.Scanner;
//This util generates random values
import java.util.Random;

class LoopScan {
    public void scannerLoop() {
        Random r = new Random();

        int randNum = r.nextInt(11);

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 0 and 10");

        int guess = scan.nextInt();

        while(guess != randNum) {
            if(guess > randNum) {
                System.out.println("Too High!");
            }
            if(guess < randNum) {
                System.out.println("Too low!");
            }
            System.out.println("Guess Again!");
            guess = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }

}
