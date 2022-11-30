package LessonActivities.Scanner;

import java.util.Scanner;

class SwitchScan {
    public void scannerSwitch() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the time of Day?");

        String input = scan.next();
        switch (input.toLowerCase()) {
            case "morning":
                System.out.println("Breakfast Time!");
                break;
            case "afternoon":
                System.out.println("Time for exercise!");
                break;
            case "evening":
                System.out.println("Time to Sleep!");
                break;
            default:
                System.out.println("Hmm, Try something else.");
        }
        scan.close();

    }
}
