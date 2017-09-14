
/**
 * Write a description of class Glass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Glass implements Recyclable
{
    private double weight;
    private double currentPrice;
    private String color;
    
    public Glass(double tmpWeight, double price, String tmpColor)
    {
        weight = tmpWeight;
        currentPrice = price;
        color = tmpColor;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setWeight(double tmpWeight)
    {
        weight = tmpWeight;
    }
    
    public void setPrice(double price)
    {
        currentPrice = price;
    }
    
    public void setColor(String tmpColor)
    {
        color = tmpColor;
    }
    
    public String toString()
    {
        return "Glass";
    }
}
