package LessonActivities.Method;



public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.setAccountId(32);
        int accountId = account.getAccountId();
        System.out.println("You're account id is... "+ accountId);
    }
}
