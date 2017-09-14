import java.util.*;

/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Recyclable> recycleBin = new ArrayList<Recyclable>();
        
        System.out.print("What would you like the price per unit of GLASS to be?: $");
        String glassPrice1 = scan.nextLine();
        
        while (true)
        {
            try
            {
                Double.parseDouble(glassPrice1);
                break;
            }
            catch (NumberFormatException n)
            {
                System.out.print("Please enter a valid price for GLASS: $");
                glassPrice1 = scan.nextLine();
            }
        }
        
        double glassPrice2 = Double.parseDouble(glassPrice1);
        double glassPrice = (double) Math.round(glassPrice2 * 100d) / 100d;
        
        System.out.println();
        
        System.out.print("What would you like the weight (lbs) of one unit of GLASS to be?: ");
        String glassWeight1 = scan.nextLine();
        
        while (true)
        {
            try
            {
                Double.parseDouble(glassWeight1);
                break;
            }
            catch (NumberFormatException n)
            {
                System.out.print("Please enter a valid weight (lbs) for GLASS: ");
                glassWeight1 = scan.nextLine();
            }
        }
        
        double glassWeight2 = Double.parseDouble(glassWeight1);
        double glassWeight = (double) Math.round(glassWeight2 * 100000d) / 100000d;
        
        System.out.println();
        
        System.out.print("What would you like the color of GLASS to be?: ");
        String glassColor = scan.nextLine();
        
        
        System.out.println();
        System.out.println();
        
        System.out.print("What would you like the price per unit of PLASTIC to be?: $");
        String plasticPrice1 = scan.nextLine();
        
        while (true)
        {
            try
            {
                Double.parseDouble(plasticPrice1);
                break;
            }
            catch (NumberFormatException n)
            {
                System.out.print("Please enter a valid price for PLASTIC: $");
                plasticPrice1 = scan.nextLine();
            }
        }
        
        double plasticPrice2 = Double.parseDouble(plasticPrice1);
        double plasticPrice = (double) Math.round(plasticPrice2 * 100d) / 100d;
        
        System.out.println();
        
        System.out.print("What would you like the weight (lbs) of one unit of PLASTIC to be?: ");
        String plasticWeight1 = scan.nextLine();
        
        while (true)
        {
            try
            {
                Double.parseDouble(plasticWeight1);
                break;
            }
            catch (NumberFormatException n)
            {
                System.out.print("Please enter a valid weight (lbs) for PLASTIC: ");
                plasticWeight1 = scan.nextLine();
            }
        }
        
        double plasticWeight2 = Double.parseDouble(plasticWeight1);
        double plasticWeight = (double) Math.round(plasticWeight2 * 100000d) / 100000d;
        
        System.out.println();
        
        System.out.print("What would you like the type of PLASTIC to be (integer form)?: ");
        String plasticType1 = scan.nextLine();
        
        while (true)
        {
            try
            {
                Integer.parseInt(plasticType1);
                break;
            }
            catch (NumberFormatException n)
            {
                System.out.print("Please enter a valid type (integer form) for PLASTIC: ");
                plasticType1 = scan.nextLine();
            }
        }
        
        int plasticType = Integer.parseInt(plasticType1);
        
        
        System.out.println();
        System.out.println();
        
        System.out.print("What would you like the price per unit of PAPER to be?: $");
        String paperPrice1 = scan.nextLine();
        
        while (true)
        {
            try
            {
                Double.parseDouble(paperPrice1);
                break;
            }
            catch (NumberFormatException n)
            {
                System.out.print("Please enter a valid price for PAPER: $");
                paperPrice1 = scan.nextLine();
            }
        }
        
        double paperPrice2 = Double.parseDouble(paperPrice1);
        double paperPrice = (double) Math.round(paperPrice2 * 100d) / 100d;
        
        System.out.println();
        
        System.out.print("What would you like the weight (lbs) of one unit of PAPER to be?: ");
        String paperWeight1 = scan.nextLine();
        
        while (true)
        {
            try
            {
                Double.parseDouble(paperWeight1);
                break;
            }
            catch (NumberFormatException n)
            {
                System.out.print("Please enter a valid weight (lbs) for PAPER: ");
                paperWeight1 = scan.nextLine();
            }
        }
        
        double paperWeight2 = Double.parseDouble(paperWeight1);
        double paperWeight = (double) Math.round(paperWeight2 * 100000d) / 100000d;
        
        
        System.out.println();
        System.out.println();
        
        
        // ASKING USER TO RECYCLE
        
        int totalGlassItems = 0;
        int totalPlasticItems = 0;
        int totalPaperItems = 0;
        
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Would you like to recycle PLASTIC, PAPER, or GLASS?: ");
            String toRecycle = scan.nextLine();
            
            while (toRecycle.equalsIgnoreCase("plastic") && toRecycle.equalsIgnoreCase("paper") && toRecycle.equalsIgnoreCase("glass"))
            {
                System.out.print("Please enter a valid element to recycle: ");
                toRecycle = scan.nextLine();
            }
            
            if (toRecycle.equalsIgnoreCase("plastic")) // IF THEY SAY PLASTIC
            {
                System.out.print("How many units of PLASTIC would you like to recycle?: ");
                String plastUnits1 = scan.nextLine();
                
                while (true)
                {
                    try
                    {
                        Integer.parseInt(plastUnits1);
                        break;
                    }
                    catch (NumberFormatException n)
                    {
                        System.out.print("Please enter a valid integer for units of PLASTIC you wish to recycle: ");
                        plastUnits1 = scan.nextLine();
                    }
                }
                
                int plastUnits = Integer.parseInt(plastUnits1);
                totalPlasticItems += plastUnits;
                
                if (plastUnits + recycleBin.size() > 10)
                {
                    totalPlasticItems -= plastUnits;
                    plastUnits = 10 - recycleBin.size();
                    System.out.println("There are more than 10 items in the bin, so we had to remove some items.");
                    totalPlasticItems += plastUnits;
                }
                
                if (plastUnits > 10)
                {
                    totalPlasticItems -= plastUnits;
                    plastUnits = 10;
                    System.out.println("You entered an integer greater than 10, so the units of PLASTIC to recycle is now 10.");
                    totalPlasticItems += plastUnits;
                }
                
                for (int v = 0; v < plastUnits; v++)
                {
                    Recyclable plastic = new Plastic(plasticWeight, plasticPrice, plasticType);
                    recycleBin.add(plastic);
                }
                
                if (recycleBin.size() >= 10)
                {
                    System.out.println("The recycle bin is now full, and we will examine the contents now.");
                    break;
                }
                
                System.out.println();
                System.out.println();
            }
            else if (toRecycle.equalsIgnoreCase("paper")) // IF THEY SAY PAPER
            {
                System.out.print("How many units of PAPER would you like to recycle?: ");
                String paperUnits1 = scan.nextLine();
                
                while (true)
                {
                    try
                    {
                        Integer.parseInt(paperUnits1);
                        break;
                    }
                    catch (NumberFormatException n)
                    {
                        System.out.print("Please enter a valid integer for units of PAPER you wish to recycle: ");
                        paperUnits1 = scan.nextLine();
                    }
                }
                
                int paperUnits = Integer.parseInt(paperUnits1);
                totalPaperItems += paperUnits;
                
                if (paperUnits + recycleBin.size() > 10)
                {
                    totalPaperItems -= paperUnits;
                    paperUnits = 10 - recycleBin.size();
                    System.out.println("There are more than 10 items in the bin, so we had to remove some items.");
                    totalPaperItems += paperUnits;
                }
                
                if (paperUnits > 10)
                {
                    totalPaperItems -= paperUnits;
                    paperUnits = 10;
                    System.out.println("You entered an integer greater than 10, so the units of PAPER to recycle is now 10.");
                    totalPaperItems += paperUnits;
                }
                
                for (int v = 0; v < paperUnits; v++)
                {
                    Recyclable paper = new Paper(paperWeight, paperPrice);
                    recycleBin.add(paper);
                }
                
                if (recycleBin.size() >= 10)
                {
                    System.out.println("The recycle bin is now full, and we will examine the contents now.");
                    break;
                }
                
                System.out.println();
                System.out.println();
            }
            else // IF THEY SAY GLASS
            {
                System.out.print("How many units of GLASS would you like to recycle?: ");
                String glassUnits1 = scan.nextLine();
                
                while (true)
                {
                    try
                    {
                        Integer.parseInt(glassUnits1);
                        break;
                    }
                    catch (NumberFormatException n)
                    {
                        System.out.print("Please enter a valid integer for units of GLASS you wish to recycle: ");
                        glassUnits1 = scan.nextLine();
                    }
                }
                
                int glassUnits = Integer.parseInt(glassUnits1);
                totalGlassItems += glassUnits;
                
                if (glassUnits + recycleBin.size() > 10)
                {
                    totalGlassItems -= glassUnits;
                    glassUnits = 10 - recycleBin.size();
                    System.out.println("There are more than 10 items in the bin, so we had to remove some items.");
                    totalGlassItems += glassUnits;
                }
                
                if (glassUnits > 10)
                {
                    totalGlassItems -= glassUnits;
                    glassUnits = 10;
                    System.out.println("You entered an integer greater than 10, so the units of GLASS to recycle is now 10.");
                    totalGlassItems += glassUnits;
                }
                
                for (int v = 0; v < glassUnits; v++)
                {
                    Recyclable glass = new Glass(glassWeight, glassPrice, glassColor);
                    recycleBin.add(glass);
                }
                
                if (recycleBin.size() >= 10)
                {
                    System.out.println("The recycle bin is now full, and we will examine the contents now.");
                    break;
                }
                
                System.out.println();
                System.out.println();
            }
            
            if (i + 1 != 10)
            {
                System.out.print("Would you like to keep recycling (yes or no)?: ");
                String toDoMore = scan.nextLine();
                
                if (toDoMore.equalsIgnoreCase("no"))
                {
                    break;
                }
            }
        }
        
        double totalValue = 0.00;
        
        for (int i = 0; i < recycleBin.size(); i++)
        {
            totalValue += recycleBin.get(i).getCurrentPrice();
        }
        
        System.out.println("The total value of the items is $" + totalValue + ".");
        
        double totalWeight = 0.00;
        
        for (int i = 0; i < recycleBin.size(); i++)
        {
            totalWeight += recycleBin.get(i).getWeight();
        }
        
        System.out.println("The total weight of the items is " + totalWeight + " lbs.");
        
        System.out.println();
        
        System.out.println("There are " + totalPlasticItems + " items of PLASTIC, type " + plasticType + ", in the recycle bin.");
        double plasticWorth = totalPlasticItems * plasticPrice;
        double allPlasticWeight = totalPlasticItems * plasticWeight;
        System.out.println("The PLASTIC is worth $" + plasticWorth + ".");
        System.out.println("The total weight of the PLASTIC is " + allPlasticWeight + " lbs.");
        
        System.out.println();
        
        System.out.println("There are " + totalGlassItems + " items of GLASS, color " + glassColor + ", in the recycle bin.");
        double glassWorth = totalGlassItems * glassPrice;
        double allGlassWeight = totalGlassItems * glassWeight;
        System.out.println("The GLASS is worth $" + glassWorth + ".");
        System.out.println("The total weight of the GLASS is " + allGlassWeight + " lbs.");
        
        System.out.println();
        
        System.out.println("There are " + totalPaperItems + " items of PAPER in the recycle bin.");
        double paperWorth = totalPaperItems * paperPrice;
        double allPaperWeight = totalPaperItems * paperWeight;
        System.out.println("The PAPER is worth $" + paperWorth + ".");
        System.out.println("The total weight of the PAPER is " + allPaperWeight + " lbs.");
    }
}