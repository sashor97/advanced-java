public class ATM {
    static void witdraw(BankAccount account,int amount){
        int balance=account.getBalance();
        if((balance-amount)< - account.getOverdraft()){
            System.out.println("Transaction denied");
        }
        else{
            account.debit(amount);
            System.out.println("$ "+amount+" successfully withdraw");
        }
        System.out.println("Current balance "+account.getBalance());
    }
}
