
package roachsimulation;

/** This is a project where users can breed, spray, and display population
 * of roaches.
 * 
 * @author Jason Wohltman
 */
public class RoachSimulation {

    public static void main(String[] args) {
        
        RoachPopulation population = new RoachPopulation(10);
        
        System.out.println("First count");
        System.out.println("Population: " + population.getRoaches());
        population.breed();
        System.out.println("After breeding: " + population.getRoaches());
        population.spray();
        System.out.println("After spraying: " + population.getRoaches());
        
        System.out.println("Second count");
        System.out.println("Population: " + population.getRoaches());
        population.breed();
        System.out.println("After breeding: " + population.getRoaches());
        population.spray();
        System.out.println("After spraying: " + population.getRoaches());
        
        System.out.println("Third count");
        System.out.println("Population: " + population.getRoaches());
        population.breed();
        System.out.println("After breeding: " + population.getRoaches());
        population.spray();
        System.out.println("After spraying: " + population.getRoaches());
        
        System.out.println("Fourth count");
        System.out.println("Population: " + population.getRoaches());
        population.breed();
        System.out.println("After breeding: " + population.getRoaches());
        population.spray();
        System.out.println("After spraying: " + population.getRoaches());
        }
}
