
/**
 * The WindChill class will receive input and hold
 * Calcualate the data and return
 *
 * @author Khai Lim
 * @version 09/17/2017
 */
public class WindChill
{
    private double windSpeedinMPH; // Wind Speed (independent variable)
    private double windChillinF; //wind chill index ( depend variable)
    private double temperatureInF;// temperature in Fahrenheit (independent/depedent variable)
    private double temperatureInC;// temperature in Celcius (independent/dependent varialbe)
    
    //Constructor method has the same exact name
    //as the class are there is no return type
    public WindChill()
    {
        windSpeedinMPH = 0;
        windChillinF = 32;
        temperatureInF = 32;
    }
    
    //Constructor method has same name
    //but two different formal parameter lists
    //this is call over loading a method
    public WindChill(double inTemp, double speed)
    {
        windSpeedinMPH = speed;
        temperatureInF = inTemp;
        calcWindChillIndex();
    }
    
    //method with 1 parameter and return    
    public void setWindSpeed(double speed)
    {

        windSpeedinMPH = speed;
        calcWindChillIndex();        
    }
    
    //method with 1 parameter and return   
    public void setTempInF(double inTemp)
    {
        temperatureInF = inTemp;
        calcWindChillIndex();
    }
    
    public double getWindSpeed()
    {
        return windSpeedinMPH;    
    }
    
    public double getTempInF()
    {
        return temperatureInF;    
    }
    
    public double getWindChill()
    {
        return windChillinF;
    }
    
    //method use for calcuate and return value
    public void calcWindChillIndex()
    {
        
        if (temperatureInF <= 50 && windSpeedinMPH > 3)
        {
            windChillinF = 35.74 + (0.62157 * temperatureInF) - (35.75 * (Math.pow(windSpeedinMPH, 0.16))) + (0.4275 * temperatureInF * (Math.pow(windSpeedinMPH, 0.16))); 
        }
        else
        {
            windChillinF = temperatureInF;
        }
    }
    
    // return and display message
    public String toString()
    {

        return "\nThe Wind Speed is : " +
        windSpeedinMPH + "\nThe Wind Chill Index is: "
        + windChillinF;
    
    }
}
