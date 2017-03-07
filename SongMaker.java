package songmaker;

import java.util.Scanner;

/**
 * @author Jason Wohltman
 */
public class SongMaker {

    public static void main(String[] args) {
        
        System.out.println("What is your favorite beverage.");
        Scanner in = new Scanner(System.in);
        String drink = in.nextLine();
        
        int numBottles = 10;
        
        while (numBottles >= 1)
        {
            System.out.println(numBottles + " bottles of " + drink + " on the wall,");
            System.out.println(numBottles + " bottles of " + drink + ",");
            System.out.println("Take one down, pass it around -");        
            System.out.println((numBottles - 1) + " bottles of " + drink + " on the wall.");        
            System.out.println("");
        
            numBottles--;
        }
        System.out.println("BURP!!!");        
    }
}
