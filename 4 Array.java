package Array;

import java.util.Scanner;
import java.util.Random;

public class Array {

    private static int mid;

    public static boolean isDuplicate(int[] array, int number, int count) {
            for(int i = 0; i < count; i++){
                if(array[i]==number){
                    return true;
                }
            }
            return false;
        }
    
    public static void bubbleSortDescending(int[] array){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
          }
       }
    
       public static int linearSearch(int[] array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
        
    public static int binarySearch(int[]array, int target, int low, int high){
        if(low<=high){
            int mid = (low+high)/2;
            if(array[mid]==target){
                return mid;
            }
        }else if (array[mid]<target){
            return binarySearch(array, target, low, mid-1);
        }else{
            return binarySearch(array, target,mid+1,high);
        }
    return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random ();
        
        //generate N students scores (0-100) display list of score, highest, lowest, average
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[] score=new int[students];
        
        System.out.println("\nStudents score: ");
        for(int i = 0;i < students; i++){
            score[i]=rand.nextInt(101);
            System.out.println("students ["+ i + "]: "+ score[i]+ "");
        }
        System.out.println("");
        
        int highest = score[0];
        int lowest = score [0];
        int sum=0;
        
        for(int i = 0;i < students; i++){
            if(score[i]>highest){
                highest=score[i];
            }
            if(score[i]<lowest){
                lowest=score[i];
            }
            sum+=score[i];
        }
        double average = (double)sum/students;
        
        System.out.println("highest score: "+ highest);
        System.out.println("lowest score: "+ lowest);
        System.out.println("average score: "+ average);
        
        System.out.println("");
        
        //generate 10 non-duplicate random integer (0-20)
        int[] uniqueNum= new int [10];
        int count=0;
        
        while(count<10){
            int number = rand.nextInt(21);
            if(!isDuplicate(uniqueNum, number, count)){
                uniqueNum[count]=number;
                count++;
            }
        }
        System.out.println("Generate 10 non-duplicate random integer (0-20): ");
        for(int num: uniqueNum){
            System.out.print(num+ " ");
        }
        System.out.println("");
        
        //generate 7 days work hours (1-8 hours) for N employee display work hours in seven days and total hours for each employee
        System.out.print("\nEnter number of employee: ");
        int N = sc.nextInt();
        
        if(N <= 0){
            System.out.println("number must be positive");
            return;
        }
        int[][]workHours = new int [N][7];
        int[] totalHours = new int [N];
        
        for(int i =0; i < N; i++){
            for(int j =0; j < 7; j++){
                workHours[i][j]=rand.nextInt(9);
                totalHours[i]+=workHours[i][j];
            }
        }
        System.out.println("\nwork hours for each employee: ");
        for(int i =0; i<N;i++){
            System.out.println("Employee "+ (i+1)+" : ");
            for(int j=0; j<7;j++){
                System.out.println("day "+(j+1)+":"+ workHours[i][j]+ " ");
            }
            System.out.println("total hours: "+ totalHours[i]);
        }
        
        System.out.println("");
        
        //rotate 90 degree clockwise a 3x3 matrix
        int[][] matrix = new int [3][3];
        
        System.out.println("\nEnter elements of 3x3 matrix");
        for(int i=0;i < 3; i++){
            for(int j= 0; j<3;j++){
                System.out.print("Matrix["+i+"]["+j+"]: ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i < 3; i++){
            for(int j= 0; j<3;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
        
        int [][] rotated= new int [3][3];
        for(int i =0; i<3;i++){
            for(int j =0; j<3; j++){
                rotated[j][2-i]=matrix[i][j];
            }
        }
        
        System.out.println("Matrix rotated 90 degree: ");
        for(int i =0; i<3;i++){
            for(int j =0; j<3; j++){
                System.out.print(rotated[i][j]+ " ");
            }
            System.out.println("");
        }
        
        
        //generates 20 random integer (0-100) sort array in descending, 
        //accept an integer and search array using this number 
        //compare linear search and binary search
        int[] nombor = new int [20];
        for(int i =0; i<20;i++){
            nombor[i]=rand.nextInt(101);
        }
        bubbleSortDescending(nombor);
        
        System.out.println("\nsorted array in descending order: ");
        for(int num: nombor){
            System.out.print(num+ " ");
        }
        System.out.println("");
        
        System.out.println("Enter a number to search for; ");
        int target = sc.nextInt();
        
        // Linear search
        long linearStart = System.nanoTime();
        int linearIndex = linearSearch(nombor, target);
        long linearEnd = System.nanoTime();
        if (linearIndex != -1) {
            System.out.println("Linear Search: Number found at index " + linearIndex);
        } else {
            System.out.println("Linear Search: Number not found");
        }
        System.out.println("Linear Search Time: " + (linearEnd - linearStart) + " ns");

        // Binary search
        long binaryStart = System.nanoTime();
        int binaryIndex = binarySearch(nombor, target, 0, nombor.length - 1);
        long binaryEnd = System.nanoTime();
        if (binaryIndex != -1) {
            System.out.println("Binary Search: Number found at index " + binaryIndex);
        } else {
            System.out.println("Binary Search: Number not found");
        }
        System.out.println("Binary Search Time: " + (binaryEnd - binaryStart) + " ns");
       
    }
}
  

    

