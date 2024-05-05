import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bank {
    ArrayList<BankAccount> listAcc = new ArrayList<>();
    public Bank(ArrayList<BankAccount> listAcc) {
        this.listAcc = listAcc;
    }
    public Bank() {
    }
    public void addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount acc = new BankAccount();
            acc.GetInfo();
            listAcc.add(acc);
        }
    }
    public void Print() {
        for (int i = 0; i < listAcc.size(); i++) {
            BankAccount acc = listAcc.get(i);
            System.out.println(acc);
        }
    }
    public void DepositAccount() {
        int accNumber;
        System.out.print("Enter account number: ");
        Scanner sc = new Scanner(System.in);
        accNumber = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        for (int i = 0; i < listAcc.size(); i++) {
            if(listAcc.get(i).CompareAccountNumber(accNumber))
                listAcc.get(i).Deposit(amount);
        }
    }
    public void TransferMoney() {
        int accNumberRe, accNumberSen;
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Money: ");
        money = sc.nextDouble();
        System.out.print("Enter account 1: ");
        accNumberSen = sc.nextInt();
        System.out.print("Enter account 2: ");
        accNumberRe = sc.nextInt();
        BankAccount acc1 = listAcc.get(accNumberSen);
        acc1 = null;
        BankAccount acc2 = listAcc.get(accNumberRe);
        acc2 = null;
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).CompareAccountNumber(accNumberSen))
                acc1 = listAcc.get(i);
            if (listAcc.get(i).CompareAccountNumber(accNumberRe))
                acc2 = listAcc.get(i);

        }
        if (acc1 != null && acc2 != null)
            acc1.TransferMoney(acc2, money);

    }
    Comparator<BankAccount> com = new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount a, BankAccount b) {
            return (int) a.getmBalance() - b.getmBalance();
        }

    };
        public void SortAccountNumber() {
        listAcc.sort(com);
    }

    Comparator<BankAccount> com = new Comparator<BankAccount>() {
            @Override
        public int compare(BankAccount a, BankAccount b) {
                if(a.getmName() > b.getmname())
                    return 1;
            }
    }

}

