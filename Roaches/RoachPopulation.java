
package roachsimulation;

/** This is a class that represents roach population. Methods contained allow 
 * for breeding, spray, and displaying population.
 * 
 * @author Jason Wohltman
 */
public class RoachPopulation {
    
    private int population;
    
    /** This is a constructor that creates new RoachPopulation objects.
     * 
     * @param startPopulation the start of the roach population
     */
    public RoachPopulation(int startPopulation)
    {
       population = startPopulation; 
    }        
    /**
     * This doubles the population of roaches.
     */
    public void breed()
    {
      population = population * 2;
    }
    /**
     * This will exterminate one-tenth of the population of roaches.
     */
    public void spray()
    {
      int exterminate = population / 10;
      population = population - exterminate;  
    }
    /** This returns the current population of the roaches.
     * 
     * @return population of roaches
     */
    public int getRoaches()
    {
      return population;
    }
}
