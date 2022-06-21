//BankDetails class --> defining the banking transaction
class BankDetails {
  private int accountNo;
  private String customerName;
  private String accountType;
  private long balance;

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
  }

  //Method --> to withdraw money
  public void withdrawn(long withdrawal) {
    if (balance >= withdrawal) {
      balance = balance - withdrawal;
    } else {
      System.out.println("you cannot withdraw!! Balance is low");
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

  public static void main(String[] args) {

    // Declaring an object of BankDetails class and calling the
    // withdrawn and deposit methods with suitable parameters

    BankDetails customerObj = new BankDetails();
    customerObj.setAccountDetails(1, "Navin", "Savings", 10000);
    customerObj.printAccountDetails();
    customerObj.deposit(5000);
    System.out.println("\nRs 5000 deposited");
    System.out.println("\nBalance " + customerObj.getAccountBalance());
    customerObj.withdrawn(2000);
    System.out.println("\nRs 2000 withdrawn");
    System.out.println("\nBalance: " + customerObj.getAccountBalance() + "\n");
    customerObj.printAccountDetails();
  }
}