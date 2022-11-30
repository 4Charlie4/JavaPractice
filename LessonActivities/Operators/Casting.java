package LessonActivities.Operators;

public class Casting {
    public static void main(String[] args) {
        System.out.println("Float to int:");
        float f = 3.99F;
        int i = (int)f; // no rounding occurs
        System.out.println(i);

        System.out.println("int to float:");
        f = i; //upcasting is implicit(Java does it for you) which is fitting a smaller datatype into a larger datatype. 
        System.out.println(f);

        int x = 10;
        float y = 3.755F;
        System.out.println(x + y); //When mathematical operations are performed Java auto Upcasts

        char c = 'A';
        System.out.println((int)c); //casting can occur between any primitive data EXCEPT Boolean.

        char z = 'Z';
        System.out.println((byte)z);
    }
}
