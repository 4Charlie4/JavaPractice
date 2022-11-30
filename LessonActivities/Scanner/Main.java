package LessonActivities.Scanner;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //creates new scanner object Which takes in user input.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        //nextInt is used for when you want a user to enter an integer.
        int num = sc.nextInt();
        System.out.println("User's number is: " + num);

        System.out.println("Enter a word: ");
        //the next method accepts string input from users. It can also take in numbers but would consider them as a string instead of as an integer.
        String word = sc.next();
        System.out.println("User's word is: " + word);

        //Closes the scanner object. Best practice is to close it when it is no longer being used.
        sc.close();
    }  
}
