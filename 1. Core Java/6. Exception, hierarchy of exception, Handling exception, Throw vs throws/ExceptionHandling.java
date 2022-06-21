class UserDefinedException extends Exception {
    public UserDefinedException(String str) {
        super(str);
    }
}

//BankDetails class --> defining the banking transaction

class BankDetails {
    private int accountNo;
    private String customerName;
    private String accountType;
    private long balance;
    private int bannedStatus;

    //Method --> to initialize customer account details
    public void setAccountDetails(int accountNo, String customerName, String accountType, long balance) {
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
    }

    //Method --> to deposit money
    public void deposit(long amount) {
        balance = balance + amount;
        System.out.println("\nRs " + amount + " deposited");
        System.out.println("\nBalance " + getAccountBalance());
    }

    //Method --> to withdraw money
    public void withdrawn(long withdrawal) throws UserDefinedException {
        if (balance >= withdrawal) {
            balance = balance - withdrawal;
            System.out.println("\nRs " + withdrawal + " withdrawn");
            System.out.println("\nBalance " + getAccountBalance());
        } else {
            System.out.println("Cannot withdraw... " + withdrawal + " low balance!!");
            bannedStatus++;
            if (bannedStatus == 3) {
                throw new UserDefinedException("This is user-defined exception");
            }
        }

    }

    public long getAccountBalance() {
        return balance;
    }

    //Method --> to print details of customer
    public void printAccountDetails() {
        System.out.println("Account No: " + this.accountNo);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Account Balance: " + this.balance);
    }

}
class ExceptionHandling {
    public static void main(String[] args) {

        // Declaring an object of BankDetails class and calling the
        // withdrawn and deposit methods with suitable parameters

        BankDetails customerObj = new BankDetails();
        customerObj.setAccountDetails(1, "Navin", "Savings", 10000);
        customerObj.printAccountDetails();
        customerObj.deposit(5000);
        try {
            customerObj.withdrawn(2000);

            customerObj.withdrawn(10000);

            customerObj.withdrawn(5000);
            customerObj.withdrawn(6000);
            customerObj.withdrawn(7000);
        } catch (UserDefinedException ude) {
            customerObj = null;
        }
        if (customerObj == null) {
            System.out.println("Account Banned");
        } else {
            customerObj.printAccountDetails();
        }

    }
}