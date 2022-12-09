package LessonActivities.Class;

class BankAccount {
    //These are known as states
    String accountHolder;
    double accountValue;
//Method
    void printInfo() { //void insures that this method WONT return anything.
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Account Value: $" + accountValue);
    }


}