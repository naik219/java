class BankAccount {
    private String name;
    private int accNo;
    private int currBal;

    public BankAccount(String name, int accNo, int currBal) {        // CONSTRUCTOR 
        this.name = name;
        this.accNo = accNo;
        this.currBal = currBal;
        displayDetails();
    }

    private void displayDetails() {           // DISPLAY CUSTOMER DETAILS
        System.out.println("Customer Details: " + name + ", Account No: " + accNo + ", Balance: " + currBal);
        System.out.println();
    }

    public void withdraw(int withdrawAmount) {    // WITHDRAW METHOD
        if (withdrawAmount <= currBal) {      
            currBal -= withdrawAmount;
            System.out.println("Withdrawal successful. New balance: " + currBal);
        } else {
            System.out.println("Insufficient funds! Cannot withdraw " + withdrawAmount);
        }
    }

    public int deposit(int depositAmount) {    // DEPOSIT METHOD
        currBal += depositAmount;
        return currBal;
    }


    public static void main(String[] args) {   // OBJECT
        BankAccount cust1 = new BankAccount("Ram", 5587, 20000);
        cust1.withdraw(5000);
        cust1.withdraw(3050);
        System.out.println("Balance after deposit: " + cust1.deposit(25000));
    }
}