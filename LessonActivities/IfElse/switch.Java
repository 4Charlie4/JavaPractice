import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Welxcome to our Diner! Please select an entree: \n"
                        + "1) steak\n"
                        + "2) wings\n"
                        + "3) salad\n"
                        +"and any other number for nothing!");
    Integer choice = sc.nextInt();
    switch(choice) {
      case 1: System.out.println("Here is your steak!");
        break;
      case 2: System.out.println("Here is your wings!");
        break;
      case 3: System.out.println("Here is your salad!");
        break;
      default: System.out.println("You want nothing?!");
        break;
    }
    
    sc.close();
  }
}