package FileIO;

import java.io.*;

public class ExchangeRate {

    public static void main(String[] args) {
        String fileName = "currency.txt";
        
        String[] exchangeRates={"USD 0.245", "EUR 0.205", "GBP 0.184", "AUD 0.332", "THB 7.41"} ;
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for(String rate: exchangeRates){
                writer.write(rate);
                writer.newLine();
            }
            System.out.println("Exchange rates have been written in "+fileName);
            
        }catch(IOException e){
            System.out.println("An error occured!");
        }
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
           String line;
           while((line=reader.readLine())!=null){
               System.out.println(line);
           }
        }catch(IOException e){
            System.out.println("An error occured!");
        }
    }  
}
