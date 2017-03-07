
package wohltmanexam3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Jason Wohltman
 */

public class WohltmanExam3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String userInput = "";
        int number5Letters = 0;
        int i = 0;
        while(!userInput.equals("STOP"))
        {
			System.out.println("Enter a word.");
         	userInput = in.next(); 
         	if(userInput.length() == 5)
	        {
    	    	number5Letters++;  
        	}
         	i++;
        }
        System.out.println("Number of five letters strings:" + number5Letters);  
        
        int [] power = new int[20];
        for(int index = 1; index <= power.length; index++)
        {
         	power[index - 1] = (int)(Math.pow((double)(-2), (double)(index)));  
        }
      
        int sum = 0;
        for(Integer item : power)
        {
         	sum = sum + item;
        }
        System.out.println(sum);
       
        double [] jumble = {4.9, 2.1, -6.2, 0.3, 1.6, 5.7};
        
       
        System.out.println("Enter two integers.");
        int index1 = in.nextInt();
        int index2 = in.nextInt();
        double average = 0;
        if(index1 >= 0 && index1 <= 5 && index2 >= 0 && index2 <= 5) {
        	average = (jumble[index1] + jumble[index2]) / 2;
          	System.out.println("The average is " + average);
        }
        else {
             System.out.println("Cannot compute an average");
		}
        
        ArrayList<Integer> chaos = new ArrayList<Integer>();
        System.out.println("Enter an integer.");
        int length = in.nextInt();
        int x = length;
        Random gen = new Random();
        for(int index = 0; index < length; index++)
        {
        	x = gen.nextInt(1000);
         	chaos.add(x);
        }  
    
        System.out.println(chaos);
                
        chaos.set(0, 777);
                
        System.out.println("Enter an integer.");
        int targetIndex = in.nextInt();
        
        if(targetIndex >= 0 && targetIndex < chaos.size()) {
        	chaos.remove(targetIndex);   
        }
        else {
        	System.out.println("I cannot remove that item");   
        }        
        
        System.out.println(chaos);
               
        int max = chaos.get(0);
        for(Integer item : chaos)
        {
        	if(item > max)
         	{
          		max = item;   
         	}
        }
        System.out.println("The maximum value is " + max);        
    }
}
