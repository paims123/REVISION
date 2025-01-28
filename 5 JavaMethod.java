package JavaMethod;

import java.util.Scanner;

public class JavaMethod {
    
    public static void bubbleSortDecreasing(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }
    
    public static void bubbleSortIncreasing(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }
    public static int triangularNum(int n){
        return n*(n+1)/2;
    }
    
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = reverseInteger(array[i]);
        }
    }

    private static int reverseInteger(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        //display 3 num in decreasing method
        int[] arr= new int[3];
        System.out.println("Enter 3 numbers in the array: ");
        for(int i = 0; i < 3; i++){
            System.out.print("arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("display the numbers before sort:  ");
        for(int i= 0;i<3;i++){
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println("\nAfter sort decreasing order: ");
        bubbleSortDecreasing(arr);
        for(int i= 0;i<3;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nAfter sort increasing order: ");
        bubbleSortIncreasing(arr);
        for(int i= 0;i<3;i++){
            System.out.print(arr[i]+ " ");
        }
        
        
        //display first 20 triangular number n*(n+1)/2
        System.out.println("\nfirst 20 triangular number: ");
        for(int i=0; i<20;i++){
            System.out.println("T["+i+"]: "+ triangularNum(i)+ " ");
        }
        System.out.println("");
        
        //accept an array of 10 integer. reverse the array
        int[] store=new int[10];
        for(int i =0; i<10; i++){
            System.out.print("store["+i+"]: ");
            store[i]=sc.nextInt();
        }
        System.out.println("display original array: ");
        for(int i =0; i<10; i++){
            System.out.print(store[i]+ " ");
        }
        
        reverseArray(store);
        
        System.out.println("\ndisplay reverse array: ");
        for(int i =0; i<10; i++){
            System.out.print(store[i]+ " ");
        }
  
    }
    
}
