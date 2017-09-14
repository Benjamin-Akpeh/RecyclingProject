
/**
 * Write a description of class Paper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paper implements Recyclable
{
    private double weight;
    private double currentPrice;
    
    public Paper(double tmpWeight, double price)
    {
        weight = tmpWeight;
        currentPrice = price;
    }
    
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public void setPrice(double price)
    {
        currentPrice = price;
    }
    
    public void setWeight(double tmpWeight)
    {
        weight = tmpWeight;
    }
    
    public String toString()
    {
        return "Paper";
    }
}
