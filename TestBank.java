import java.util.Random;
import java.util.stream.LongStream;

public class TestBank{
    public static void main(String[] args){
        System.out.println("Test");
        Bank account1= new Bank("Kevin",500.00,1000.00);
        System.out.println(Bank.getTotalAccounts());
        Bank account2= new Bank("Garfield",20.00,40.00);
        System.out.println(Bank.getTotalAccounts());

        System.out.println("---------ACCOUNT 1-------" );
        System.out.println("Checking amount:" + account1.getCheckingBalance());
        System.out.println("Savings amount:" + account1.getSavingsBalance());
        System.out.println("---------ACCOUNT 2-------" );
        System.out.println("Checking amount:" + account2.getCheckingBalance());
        System.out.println("Savings amount:" + account2.getSavingsBalance());


        account1.depositCheckingBalance(500.00);
        account2.depositSavingsBalance(111.11);




        System.out.println("---------ACCOUNT 1-------" );
        System.out.println("Checking amount:" + account1.getCheckingBalance());
        System.out.println("Savings amount:" + account1.getSavingsBalance());
        System.out.println("---------ACCOUNT 2-------" );
        System.out.println("Checking amount:" + account2.getCheckingBalance());
        System.out.println("Savings amount:" + account2.getSavingsBalance());


        account1.withdrawSavingsBalance(700.00);
        account2.withdrawCheckingBalance(10.00);

        System.out.println("---------ACCOUNT 1-------" );
        System.out.println("Checking amount:" + account1.getCheckingBalance());
        System.out.println("Savings amount:" + account1.getSavingsBalance());
        System.out.println("---------ACCOUNT 2-------" );
        System.out.println("Checking amount:" + account2.getCheckingBalance());
        System.out.println("Savings amount:" + account2.getSavingsBalance());

        System.out.println("---------Total Amounts-------" );
        System.out.println("Total amount:" + account1.totalBalance());
        System.out.println("Total amount:" + account2.totalBalance());


        System.out.println("---------Account 1-------" );
        System.out.println(account1.getAccountNumber());
        System.out.println("---------Account 2-------" );
        System.out.println(account2.getAccountNumber());

        // account1.owner="same";
        // account1.checkingBalance=5000.00;
        // account2.savingsBalance=100000.00;

        System.out.println("---------TEST-------" );
        Random randMachine=new Random();
        long account=0;
        long min=100000000L;
        long max=9999999999L;
        LongStream stream=randMachine.longs(1,min,max);
        System.out.println(stream);
    
        // stream.forEach(value=>{
        //     account +=value;
        // });
        stream.forEach(System.out::println);
        //     // long account=randMachine.nextLong();
        
        // return account;
    }
}