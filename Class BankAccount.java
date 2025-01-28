package Class;

class BankAccount1{
    private String name;
    private int IC;
    private double balance;
   
    public BankAccount1(String name, int IC, double initialDeposit){
        this.name=name;
        this.IC=IC;
        if(initialDeposit >=0){
            this.balance=initialDeposit;
        }else{
            System.out.println("Initial deposit must be positive");
            this.balance=0;
        }
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited amount: "+amount);
        }else{
            System.out.println("deposit amount must be positive");
        }
    }
    
    public void withdraw(int amount){
        if(amount>0){
            if(amount<=balance){
                balance-=amount;
                System.out.println("withdraw amount: "+amount);
            }else{
                System.out.println("amount cannot exceed current balance");
            }
        }else{
            System.out.println("withdraw amount must be positive");
        }
    }
    public void display(){
        System.out.printf("Customer: %s\nIC: %s\nCurrent balance: %.2f\n",name,IC,balance);
    }
}

public class BankAccount{

    public static void main(String[] args) {
        
        BankAccount1 acc = new BankAccount1("Fahim",1234,1000.0);
        
        acc.display();
        System.out.println("");
        
        acc.deposit(500);
        acc.display();
        System.out.println("");
        
        acc.withdraw(300);
        acc.display();
        
    }
    
}
