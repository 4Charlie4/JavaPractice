package LessonActivities.Method;

public class BankAccount {
    int accountId;
    String accountHolder;
    double accountValue;

    public int getAccountId() {
        System.out.println("Acquiring Account Id");
        return accountId;
    }

    public void setAccountId(int idInput) {
        
        accountId = idInput;
    }
}
