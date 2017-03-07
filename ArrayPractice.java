
package arraypractice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jason Wohltman
 */
public class ArrayPractice {

    public static void main(String[] args) 
    {
     Random gen = new Random();
     int [] a = new int[5];
     Scanner in = new Scanner(System.in);
     
     for(int i = 0; i < a.length; i++)
     {
      a[i] = gen.nextInt(100) + 1;
      System.out.println(a[i]);
     }
        
      int [] b = new int[10];
      for(int i = 0; i < b.length; i++)
      {
       b[i] = i + 1;
       System.out.println(b[i]);   
      }
      
      int [] c = new int[11];
      for(int i = 0; i < c.length; i++)
      {
       c[i] = i * 2;
       System.out.println(c[i]);   
      }
      
      int [] d = new int[10];
      for(int i = 0; i < d.length; i++)
      {
       d[i] = 0;
       System.out.println(d[i]);   
      }
      
      int [] e = {1, 4, 9, 16, 9, 7, 4, 9, 11};
      for(int i = 0; i < e.length; i++)
      {
       System.out.println(e[i]);   
      }
      
      //p7.7
      int [] f = new int[10];
      int sum = 0;
      for(int i = 0; i < f.length; i++)
      {       
       System.out.println("Value?");
       f[i] = in.nextInt();
       
        if(i % 2 == 0)
            {
            sum = sum + f[i];       
            }
        else
            {
            sum = sum - f[1];   
            }       
      }
      System.out.println("Sum was: " + sum);
    }
}
