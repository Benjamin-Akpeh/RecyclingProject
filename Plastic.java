
/**
 * Write a description of class Plastic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plastic implements Recyclable
{
    private double weight;
    private double currentPrice;
    private int type;
    
    public Plastic(double tmpWeight, double price, int newType)
    {
        weight = tmpWeight;
        currentPrice = price;
        type = newType;
    }
    
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public int getType()
    {
        return type;
    }
    
    public void setPrice(double price)
    {
        currentPrice = price;
    }
    
    public void setWeight(double tmpWeight)
    {
        weight = tmpWeight;
    }
    
    public void setType(int newType)
    {
        type = newType;
    }
    
    public String toString()
    {
        return "Plastic";
    }
}
