package filereadingexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Jason Wohltman
 */
public class FileReadingExample {

    public static void main(String[] args) throws FileNotFoundException
    {
      FileReader reader = new FileReader("C://libraries.mydocuments.data.txt");
      Scanner fileIn = new Scanner(reader);
      
      int num = 0;
      int value = 0;
      int total = 0;
      
      num = fileIn.nextInt();
      
      for(int count = 0; count < num; count++)
      {
       value = fileIn.nextInt();
       total = total + value;
      }
        
      System.out.println("Read in " + num + " values from C://data.txt.");
      System.out.println("The average value was: " + (double) total / num);     
        
    }
}
