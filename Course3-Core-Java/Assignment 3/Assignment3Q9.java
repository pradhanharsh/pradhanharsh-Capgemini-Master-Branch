
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class SavingAccount implements Comparable<SavingAccount> {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public boolean deposit(int amount){
        if(amount >= 0){
            acc_balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(int amount){
        if(acc_balance > 0 && amount >= 0){
            acc_balance -= amount;
            return true;
        }
        return false;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public int getAcc_ID() {
        return acc_ID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public void setAcc_ID(int acc_ID) {
        this.acc_ID = acc_ID;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setSalaryAccount(boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }

    @Override
    public int compareTo(SavingAccount o) {
        return this.acc_ID - o.getAcc_ID();
    }
}

class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

    public boolean addSavingAccount(SavingAccount savingAccount) {
        return savingAccounts.add(savingAccount);
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> ids = new ArrayList<>();
        for(SavingAccount account : savingAccounts){
            ids.add(account.getAcc_ID());
        }
        return ids;
    }
}

public class Assignment3Q9 {
    public static void main(String[] args) {}
}