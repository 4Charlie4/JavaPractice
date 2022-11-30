package LessonActivities.Operators;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What numbers would you like to do math with?");

        int x = input.nextInt();
        int y = input.nextInt();

        input.close();

        System.out.println(x + y);
    }
}
