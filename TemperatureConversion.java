
/**
 * The Temperature Conversion class will receive input and hold 
 * Calcuation and return 
 * 
 * @author Khai Lim
 * @version 09/17/2017
 */


public class TemperatureConversion
{
    private double temperatureInF;
    private double temperatureInC;

    //Constructor method has the same exact name
    //as the class are there is no return type
    public TemperatureConversion()
    {
        temperatureInF = 32;
        temperatureInC = 0;
       
    }
    
    //Constructor method has same name
    //but two different formal parameter lists
    //this is call over loading a method
    public TemperatureConversion(double inTemp, char ch)
    {
        
        if (ch == 'F')
        {
            setTempInF(inTemp);
            temperatureInC = (inTemp - 32) * 5.0/9;
        }
        else
        {
            setTempInC(inTemp);
            temperatureInF = (9.0/5 * inTemp) + 32;
        
        }
    
    }
    
    //method with 1 parameter and calculate
    public void setTempInF(double inTemp)
    {
        temperatureInF = inTemp;
        temperatureInC = (inTemp - 32) * 5.0/9;
    }
    
    //method with 1 parameter and calcuate
    public void setTempInC(double inTemp)
    {
        temperatureInC = inTemp;
        temperatureInF = (9.0/5 * inTemp) + 32;
    }
     
    public double getTempInF()
    {
        return temperatureInF;
    }
    
    public double getTempInC()
    {
        return temperatureInC;    
    }
    

    // method display the message
    public String toString()
    {
        return "The temperature in Fahrenheit is : "
        + temperatureInF  + "\nThe temperature in Celcius is: "
        + temperatureInC;
    
    }
}
