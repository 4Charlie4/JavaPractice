package LessonActivities.Class;


public class Main {
    public static void main(String[] args) {
       BankAccount account = new BankAccount();
       account.accountHolder = "Jane Doe";
       account.accountValue = 99.99;
       System.out.println(account.accountHolder);
       System.out.println(account.accountValue);
    }
}
