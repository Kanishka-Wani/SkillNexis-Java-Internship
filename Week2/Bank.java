class BankAccount{
    int balance=7800;
    
    void Deposit(double amount){
        balance +=amount;
        System.out.println(amount+" Deposited Successfully!!\nBalance: "+balance);
    }

    void Withdraw(double amount){
        balance -= amount;
        System.out.println(amount+ "Withdraw Successfully!!\nBalance: "+balance);
    }
}

public class Bank{
    public static void main(String[] args){
        BankAccount a = new BankAccount();

        a.Deposit(5000);
        a.Withdraw(1000);

    }
}
