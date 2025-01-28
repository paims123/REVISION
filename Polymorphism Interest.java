package Polymorphism;

interface interest{
    double computeInterest();
}

class SavingAcc implements interest{
    private double balance;
    
    public SavingAcc(double balance){
        this.balance=balance;
    }
    @Override
    public double computeInterest(){
        return (0.003*balance)/12;
    }
}
class FixedAcc implements interest{
    private double balance;
    
    public FixedAcc(double balance){
        this.balance=balance;
    }
    @Override
    public double computeInterest(){
        return (0.005*balance)/12;
    }
}


public class polymorphism {

    public static void main(String[] args) {
        SavingAcc saving = new SavingAcc(1000);
        System.out.printf("saving account monthly interest %.2f%n",saving.computeInterest());
        System.out.println("");
        
        FixedAcc fix = new FixedAcc(1000);
        System.out.printf("fixed account monthly interest %.2f%n",fix.computeInterest());
    }
    
}
