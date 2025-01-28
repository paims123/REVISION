package FileIO;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CourseCode {

    public static void main(String[] args) throws ClassNotFoundException {
        String fileName="coursename.dat";
        
        Map<String, String> courseMap = new HashMap<>();
        courseMap.put("WXES 1116","Programming I");
        courseMap.put("WXES 1115","Data Structure");
        courseMap.put("WXES 1110","Operating System");
        courseMap.put("WXES 1112","Computing Mathetamatic I");
        
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
            outputStream.writeObject(courseMap);
            System.out.println("Course Data has been written to "+fileName);
        }catch(IOException e){
            System.out.println("An error occured!");
        }
        
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))){
            @SuppressWarnings("unchecked")
            Map<String, String> StoredCourseMap = (Map<String, String>)inputStream.readObject();
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a course code: ");
            String courseCode=sc.nextLine();
            
            String courseName=StoredCourseMap.get(courseCode);
            if(courseName!=null){
                System.out.println("Course Name: "+courseName);
            }else{
                System.out.println("Course not found!");
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }catch(IOException e){
            System.out.println("An error occured!");
        }
    }
    
}
