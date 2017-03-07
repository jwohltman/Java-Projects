package seekposition2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Jason Wohltman
 */
public class SeekPosition2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String fileName = "";
        int startPosition = 0;
        int numbersDisplay = 0;
        System.out.println("Enter name of file to search for.");
        fileName = scan.nextLine();
        System.out.println("Enter the starting position of the file to search for.");
        startPosition = scan.nextInt();
        System.out.println("Enter a number of characters to display");
        numbersDisplay = scan.nextInt();
        fileName = "C:\\Users\\JW33\\Documents\\NetBeansProjects\\SeekPosition\\" + fileName;
        
        try
        {
            InputStream input = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = reader.readLine();
            
            for(int i = startPosition; i < (numbersDisplay + startPosition); i++)
            {
                System.out.println(s.charAt(i));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
