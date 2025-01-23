package JavaFundamental;

import java.util.Scanner;
import java.util.Random;

public class JavaFundamental {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand= new Random();
        
        //find circumference of circle and display in 3 decimal places
        System.out.print("Enter diameter: ");
        double diameter = sc.nextDouble();
        double circumferenceOfcircle = diameter*Math.PI;
        System.out.print("Circumference of circle is: ");
        System.out.printf("%.3f%n",circumferenceOfcircle);
        System.out.println();
        
        //convert inches to meters
        System.out.print("Enter measurement in inches: ");
        double inches = sc.nextDouble();
        double meter = inches*2.54;
        System.out.print("convert "+ inches + " inches to meter: ");
        System.out.printf("%.2f%n",meter);
        System.out.println();
        
        //convert Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        double Celsius = (Fahrenheit-32)/1.8;
        System.out.print("convert "+ Fahrenheit + " Fahrenheit to degree Celsius: ");
        System.out.printf("%.2f%n",Celsius);
        System.out.println();
        
        //generates three random number between 10-50, display, sum, average in two decimal
        int num1= rand.nextInt(10,51);
        int num2= rand.nextInt(10,51);
        int num3= rand.nextInt(10,51);
        System.out.println("Display 3 random numbers: "+ num1 + "," + num2 + "," + num3);
        int sum = num1+num2+num3;
        double average = sum/3;
        System.out.print("sum of the numbers: "+ sum);
        System.out.print("\naverage of the numbers: ");
        System.out.printf("%.2f%n",average);
        System.out.println();
        
        //generate a random number between 0-10000 display number and sum all digit
        int number = rand.nextInt(10001);
        System.out.println("random number (0-10000): "+ number);
        int sum1 = 0;
        do{
            sum1+=number%10;
            number/=10;
        }while(number > 0);
        
        System.out.println("Sum of all digits in the number: " +sum1 );
    }
    
}
