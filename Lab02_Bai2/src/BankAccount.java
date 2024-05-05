import java.util.Scanner;

public class BankAccount {
    private int mAccNum;
    private String mName;

    public void setmBalance(double mBalance) {
        this.mBalance = mBalance;
    }

    private double mBalance;

    public BankAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }
    public int getmAccNum() {
        return mAccNum;
    }
    public String getmName() {
        return mName;
    }
    public double getmBalance() {
        return mBalance;
    }
    public BankAccount() {
    }

    public void GetInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        mAccNum = sc.nextInt();
        System.out.print("Enter Name: ");
        mName = sc.next();
        System.out.print("Enter Balance: ");
        mBalance = sc.nextDouble();
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            mBalance += amount;
            System.out.println("Deposited " + amount + " to " + mName);
            System.out.println("Balance: " + mBalance);
        } else
            System.out.println("Insufficient Deposit!");
    }

    public boolean Withdraw(double amount) {
        if (amount<0) return false;
        if (mBalance-amount<0) return false;

        if (mBalance >= amount) {
            mBalance -= amount;
            System.out.println("Withdraw Success");
            System.out.println(mBalance);
            return true;
        } else {
            System.out.println("Withdraw Failed");
            System.out.println(mBalance);
            return false;
        }
    }
    public boolean TransferMoney(BankAccount acc, double money) {
        if(money < 0) return false;
        if(money>this.mBalance) return false;
        this.Withdraw(money);
        acc.Deposit(money);
        return true;
    }
    public String toString() {
        return String.valueOf(mBalance);
    }
    public void Print() {
        System.out.println("Account Number: " + mAccNum);
        System.out.println("Name: " + mName);
        System.out.println("Balance: " + mBalance);
    }

    public boolean CompareAccountNumber(int acc) {
        return acc == this.mAccNum;
    }
}
