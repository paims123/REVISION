package Selection;

import java.util.Scanner;
import java.util.Random;

public class Selection {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random ();
        
        //simple calculator
        System.out.println("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println("Sum: "+ (num1+num2));
                break;
            case '-':
                System.out.println("Difference: "+ (num1-num2));
                break;
            case '*':
                System.out.println("Multipilication: "+ (num1*num2));
                break;
            case '/':
                System.out.println("Quotient: "+ (num1/num2));
                break;
            case '%':
                System.out.println("Remainder: "+ (num1%num2));
                break;
            default:
                System.out.println("invalid operator");
        }
        System.out.println();
        
        //generate random number (0-5) and display in word
        int randomNum= rand.nextInt(6);
        switch (randomNum) {
            case 0 -> System.out.println(randomNum + " is zero");
            case 1 -> System.out.println(randomNum + " is one");
            case 2 -> System.out.println(randomNum + " is two");
            case 3 -> System.out.println(randomNum + " is three");
            case 4 -> System.out.println(randomNum + " is four");
            case 5 -> System.out.println(randomNum + " is five");
            default -> {
            }
        }
        System.out.println();
        
        //enter radius and coordinate. determine point inside/outside circle centered (0,0)
        System.out.print("enter radius: ");
        double radius = sc.nextInt();
        System.out.println("enter coordinate (x,y):");
        double x = sc.nextInt();
        double y = sc.nextInt();
        
        double distance = Math.sqrt(x*x+y*y);
        
        if(distance<radius){
            System.out.println("("+x+","+y+") is inside the circle");
        }else if(distance==radius){
            System.out.println("("+x+","+y+") is on the circle");
        }else if(distance>radius){
            System.out.println("("+x+","+y+") is outside the circle");
        }
    }
}
