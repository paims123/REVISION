package Polymorphism;

abstract class Employee{
    protected String name;
    protected String employeeType;
    
    public Employee(String name,String employeeType){
        this.name=name;
        this.employeeType=employeeType;
    }
    public abstract double computeSalary();
    
    public void display(){
        System.out.print("name: "+name);
        System.out.print("\nemployee type: "+ employeeType);
        System.out.printf("\nsalary:  %.2f%n",computeSalary());
    }
}

class PermanentEmployee extends Employee{
    private String category;
    
    public PermanentEmployee(String name,String category){
        super(name,"permanent");
        this.category=category;
    }
    @Override
    public double computeSalary(){
        switch(category){
            case "A":
                return 4000;
            case "B":
                return 3000;
            case "C":
                return 2000;
            default: 
                throw new IllegalArgumentException("Invalid category");
        }
    }
}
class ContractStaff extends Employee{
    private double totalsales;
    
    public ContractStaff(String name, double totalsales){
        super(name,"contract");
        this.totalsales=totalsales;
    }
    @Override
    public double computeSalary(){
        return 500+(0.5*totalsales);
        }
    }
class TemporaryStaff extends Employee{
    private int workHours;
    
    public TemporaryStaff(String name, int workHours){
        super(name,"temporary");
        this.workHours=workHours;
    }
    @Override
    public double computeSalary(){
        return (workHours*15);
    }
}

public class EmployeeSystem {

    public static void main(String[] args) {
        
        Employee permanentA = new PermanentEmployee("Alice", "A");
        Employee permanentB = new PermanentEmployee("Bob", "B");
        Employee contractStaff = new ContractStaff("Charlie", 2000);
        Employee temporaryStaff = new TemporaryStaff("Diana", 120);

        permanentA.display();
        System.out.println("");
        permanentB.display();
        System.out.println("");
        contractStaff.display();
        System.out.println("");
        temporaryStaff.display();
    }
    
}
