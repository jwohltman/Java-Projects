package exam3bonus;

import java.util.Random;

/**
 * @author Jason Wohltman
 */
public class Exam3Bonus {

    public static void main(String[] args) {
        
        Random gen = new Random();
        double value = (gen.nextInt(201)/100.0) - 1;
        
        Double [] someValues = new Double[50];
        
        for(int index = 0; index < someValues.length; index++)
        {
        	someValues[index] = value;   
        }
        
        double min = 0;
        for(int index = 0; index < someValues.length; index++)
        {
            min = someValues[0];
            if(someValues[index] < 0 && someValues[index] < min)
            {
            	min = someValues[index]; 
            }
        }
        
        System.out.println("The minimum positive value is " + min);
    }
}
