class Customer {
	int amount = 10000;

	//synchronized keyword on the method declaration, it will synchronize the whole method
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw");
		while(this.amount < amount) {
			System.out.println("Less Balance... Waiting for some Deposit");
			try {
				wait();
			}
			catch(InterruptedException interruptExceptionObj) {
				System.out.println(interruptExceptionObj);
			}
		}
		System.out.println("Withdraw Notified!!");
		this.amount -= amount;
		System.out.println("Withdraw Complete : " + this.amount);
	} 

	void deposit(int amount) {
		//if you want part of a method to be synchronized use synchronized block
		synchronized(this) {
			System.out.println("Going to deposit");
			this.amount += amount;
			System.out.println("Deposit Complete : " + this.amount);
			notifyAll();
			System.out.println("Deposit just Notified");
		}

	}
}

class WithdrawThread extends Thread {
	Customer customerObj;
	int amount;
	WithdrawThread(Customer customerObj, int amount) {
		System.out.println("Inside Withdraw!!");
		this.customerObj = customerObj;
		this.amount = amount;
		start();
	}
	public void run() {
		customerObj.withdraw(amount);
	}
}

class DepositThread extends Thread {
	Customer customerObj;
	int amount;
	DepositThread(Customer customerObj, int amount) {
		System.out.println("Inside Deposit!!");
		this.customerObj = customerObj;
		this.amount = amount;
		start();
	}
	public void run() {
		customerObj.deposit(amount);
	}
}



class ThreadSynchronization {
	
	public static void main(String[] args) {
		Customer customerObj = new Customer();
		WithdrawThread withdrawObj1 = new WithdrawThread(customerObj,20000);
		WithdrawThread withdrawObj2 = new WithdrawThread(customerObj,15000);
		DepositThread depositObj1 = new DepositThread(customerObj,15000);
		DepositThread depositObj2 = new DepositThread(customerObj,25000);
	}
}