package FileIO;

import java.io.*;

public class ConvertSentenceToBinary {

    private static String stringToBinary(String sentence){
        StringBuilder binaryString = new StringBuilder();
        for(char c:sentence.toCharArray()){
            binaryString.append(String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0')).append(" ");
        }
        return binaryString.toString().trim();
    }
    private static String binaryToString(String binaryString){
        StringBuilder sentence = new StringBuilder();
        String[] binaryCodes=binaryString.split(" ");
        for(String binary:binaryCodes){
            sentence.append((char)Integer.parseInt(binary,2));
        }
        return sentence.toString();
    }

    public static void main(String[] args) {
        String inputSentence = "Paim Kacak";
        String fileName="data.txt";
        
        try{
            String binaryData=stringToBinary(inputSentence);
            try (BufferedWriter writer = new BufferedWriter (new FileWriter(fileName))) {
                writer.write(binaryData);
            }
            System.out.println("Binary data written to "+fileName);
            
            StringBuilder binaryFromFile = new StringBuilder();
       
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while((line=reader.readLine())!=null){
                    binaryFromFile.append(line);
                    System.out.println(line);
                }
            }
            String outputSentence=binaryToString(binaryFromFile.toString());
            System.out.println("Original sentence from File: "+outputSentence);
            
        }catch(IOException e){
                System.out.println("An error occured!");
                }
        }
}
    

