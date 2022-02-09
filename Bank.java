import java.util.Random;
import java.util.stream.LongStream;

class Bank {
    private String owner;
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;

    private static int totalAccounts=0;

    // public static double totalFunds(){
    //     return (checkingBalance + savingsBalance);
    // }


    public long getAccountNumber(){
        return accountNumber;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }   


    public static long generateAccountNumber(){


        Random randMachine=new Random();


        long min=1000000000L;
        long max=9999999999L;
        long account=0;
        account=randMachine.nextLong();
        while (account>max){
            account -= min;
        }
        while (account<min){
            account +=min;
        }
            
        return account;

    }

    public double getCheckingBalance(){
        return checkingBalance;
    }


    public void depositCheckingBalance(double value){
        checkingBalance += value;
    }

    public void depositSavingsBalance(double value){
        savingsBalance += value;
    }

    public void withdrawCheckingBalance(double value){
        if (checkingBalance<value){
            System.out.println("Insufficient funds to withdraw from checking");
        }
        else{
            checkingBalance -= value;
        }
    }

    public void withdrawSavingsBalance(double value){
        if (savingsBalance<value){
            System.out.println("Insufficient funds to withdraw from saving");
        }
        else {

            savingsBalance -= value;
        }
    }

    public double totalBalance(){
        return (savingsBalance+checkingBalance);
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public Bank(String owner, double checking,double savings){
        this.owner=owner;
        this.checkingBalance=checking;
        this.savingsBalance=savings;
        this.accountNumber=generateAccountNumber();
        totalAccounts +=1;
    }
}
