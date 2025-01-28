package Class;

import java.util.Random;

//array, display, even, prime, max, min, average, square
class Number{
    private int[] array;
    
    public Number(){
        this(10,100);
    }
    public Number(int size){
        this(size,100);
    }
    
    public Number(int size, int maxValue){
        array=new int [size];
        generateRandomNumbers(maxValue);
    }
    
    public void generateRandomNumbers(int maxValue){
        Random rand = new Random();
        for(int i =0; i < array.length; i++){
            array[i]= rand.nextInt(maxValue + 1);
        }
    }
    public void display(){
        System.out.print("display array: ");
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
    
    public void evenNum(){
        System.out.print("Even numbers: ");
        for(int i =0; i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+ " ");
                }
            }
        System.out.println("");
        }
   public void displayPrimeNumbers() {
        System.out.print("Prime Numbers: ");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void maxNum(){
        int max=array[0];
        for (int num : array) {
            if(num>max){
                max=num;
            }
        }
        System.out.println("Maximum number: "+max);
    }
    public void minNum(){
        int min=array[0];
        for (int num : array) {
            if(num<min){
                min=num;
            }
        }
        System.out.println("Minimum number: " + min);
    }
    public void average(){
        int sum =0;
        for(int num: array){
            sum+=num;
        }
        double average = (double)sum/array.length;
        System.out.printf("average: %.2f%n",average);
    }
    
    public void square(){
        System.out.print("square number: ");
        for(int num: array){
            System.out.print((num*num)+ " ");
        }
        System.out.println("");
    }
}


public class Number1 {
    
    public static void main(String[] args) {
        
        System.out.println("Number a: ");
        Number a = new Number(); 
        a.generateRandomNumbers(30);
        a.display();
        a.displayPrimeNumbers();
        a.evenNum();
        a.minNum();
        a.maxNum();
        a.average();
        a.square();
        System.out.println("");
        
        System.out.println("Number b: ");
        Number b = new Number(5); 
        b.generateRandomNumbers(30);
        b.display();
        b.displayPrimeNumbers();
        b.evenNum();
        b.minNum();
        b.maxNum();
        b.average();
        b.square();
        System.out.println("");
        
        System.out.println("Number c: ");
        Number c = new Number(4, 50); 
        c.generateRandomNumbers(30);
        c.display();
        c.displayPrimeNumbers();
        c.evenNum();
        c.minNum();
        c.maxNum();
        c.average();
        c.square();
    }
    
}
