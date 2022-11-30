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
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x % y);

        System.out.println("Post-Increment Operator:");
        int post = 10;
        System.out.println(post++);
        System.out.println(post);

        System.out.println("Pre-Increment Operator:");
        int pre = 10;
        System.out.println(++pre);
        System.out.println(pre);


        



    }
}
