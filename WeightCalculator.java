package Class;

import java.util.Scanner;

class WeightCalculator1{
    private int age;
    private double height;
    private double recommendWeight;
    
    public WeightCalculator1(){
        this.age=age;
        this.height=height;
    }
    public void AcceptsInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age=sc.nextInt();
        System.out.print("Enter height:");
        height=sc.nextDouble();
    }
    
    public void recommendedWeight(){
        recommendWeight=(height-100+age/10)*0.9;
    }
    
    public void display(){
        System.out.print("age: "+age);
        System.out.print("\nheight: "+ height);
        System.out.printf("\nrecommend weight: %.2f%n",recommendWeight);
    }
}


public class WeightCalculator {

    public static void main(String[] args) {
        WeightCalculator1 wc=new WeightCalculator1();
        wc.AcceptsInput();
        wc.recommendedWeight();
        wc.display();
    }
    
}
