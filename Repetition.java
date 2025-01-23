package Repetition;

import java.util.Scanner;
import java.util.Random;

public class Repetition {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to √num
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random ();
        
        //accept an integer and display entire factor
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        System.out.println("factor of "+ num);
        if(num>0){
            for(int i=1;i<=num;i++ ){
                if(num%i==0){
                System.out.print(i + " ");
                }
            }
        }else {
            System.out.println("must be positive");
        }
        System.out.println();
        
        //generate first n prime numbers. random num (0-100)
        int randomNum=rand.nextInt(101);
        System.out.println("\nfirst "+randomNum+ " prime numbers: ");
        for (int i = 2; i <= randomNum; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        
        //accepts integer and sum the following series
        System.out.print("\nEnter an integer: ");
        int number=sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i<=number;i++){
            sum=sum+(1.0/i);
        }
        System.out.println("sum of the following series: "+sum);
    }
  }
