package numberthinker;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jason Wohltman
 */
public class NumberThinker 
{
    public static void main(String[] args) 
    {              
      Random gen = new Random();
      Scanner in = new Scanner(System.in);  
      int gamesPlayed = 0;
      int player1 = 0;
      int player2 = 0;
      int player1Wins = 0;
      int player2Wins = 0;
      
      while((Math.abs(player1Wins - player2Wins)) < 3)
      {
		  System.out.println("I'm thinking of a number between 1 and 100. Try to get close to it.");  
	      int keynumber = gen.nextInt(100) + 1;
    	  
		  System.out.println("First Player: please enter a number.");
		  int guess1 = in.nextInt();
   
		  System.out.println("Second Player: please enter a number.");
		  int guess2 = in.nextInt();
      
		  int distance1 = Math.abs(guess1 - keynumber);
		  int distance2 = Math.abs(guess2 - keynumber);
      
		  if (distance1 < distance2)
		  {    System.out.println("Player 1 was the closest! The number was " + keynumber + ".");
			  player1++;
		  }
		  else if (distance2 < distance1)
		  {
			  System.out.println("Player 2 was the closest! The number was " + keynumber + ".");
			  player2++;
		  }
		  else 
		  {
			  System.out.println("It is a tie! The number was " + keynumber + ".");
			  gamesPlayed++;
		  }
	
		  System.out.println("");
		  System.out.println("Player 1 now has this many wins: " + player1);
		  System.out.println("Player 2 now has this many wins: " + player2);
  	  }
}
