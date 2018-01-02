
/**
 * The Driver class contain the main() progress the program
 * It will get input from user, create an Wind chill and Temperture Conversion objects.
 * It allow user input Fahrenheit, Celcius Temperature and Wind Chill Speed to change it.
 * It will keep user run in the loop until user want to quit the program.
 * 
 * @author Khai Lim
 * @version 09/17/2017
 */
import java.util.*;

public class Driver
{
    public static void main(String[] args)
    {
       //local variable
       char letter; // store the letter after convert user input to character
       String userInputCh; // store the selection of user input by a String
       double inputFahTemp, inputCelcTemp,inputSpeed; // store the number user input by double
       
       Scanner keyboard = new Scanner(System.in);
       WindChill wc = new WindChill(); // create a object in WindChill class
       TemperatureConversion tc = new TemperatureConversion(); // create a object in TemperatureConversion
       
       
       System.out.println("Please Enter F for change Fahrenheit to Celcius. "
                             + "\nPlease Enter C for Celcius to Fahrenheit. "
                             + "\nPlease Enter S for change a Wind Speed. ");
       //This loop only get user input with 'F' , 'C', 'S' or 'Q'
       do
       {
          System.out.println("Enter a temperature F, C, S or Q for quit: ");
          userInputCh = keyboard.nextLine(); // get user input in String
          letter = userInputCh.charAt(0); // get the user input with pick only first character
          letter = Character.toUpperCase(letter); //convert input to upper case to simplify later code
                            
                
       }while (letter != 'F' && letter != 'C' && letter != 'S' && letter != 'Q');
       
       //lopp to process the user input
       //get the value of Fahrenheit, Celcius, or Wind Speed.
       //Pass all value in another class for calculate
       //Display the message of user input and value user want to convert to
              
       while (letter != 'Q')
       {
          switch(letter)
          {
              case 'F':
                     System.out.print("Enter a Fahrenheit Temperature: ");
                     inputFahTemp = keyboard.nextDouble();// get user input by double number in fahrenheit
                     tc.setTempInF(inputFahTemp);//pass the Fahrenheit temperature to TemperatureConversion class
                     wc.setTempInF(inputFahTemp);//pass the Fahrenheit temperature to WindChill class
                     break;
              case 'C':
                     System.out.print("Enter a Celcius Temperature: ");
                     inputCelcTemp = keyboard.nextDouble();//get the user input by double number in celcius
                     tc.setTempInC(inputCelcTemp);// pass the value user input to temperature conversion  class to get Celcius
                     wc.setTempInF(tc.getTempInF());// pass the value user input to wind chill class to set temperature of Fahrenheit
                     break;
              case 'S':
                    System.out.print("Enter a Wind Speed MPH: ");
                    inputSpeed = keyboard.nextDouble();// get user input double in wind speed
                    wc.setWindSpeed(inputSpeed);// pass the value of wind speed to wind chill class
                    break;
          }//end switch loop

          //Display the value user input and what user want to convert to
          System.out.println(wc.toString());
          System.out.println(tc.toString());
          
          keyboard.nextLine();
          
          //update the condition of the while loop for ask user want to run again.
          do
          {
              System.out.println("Enter a temperature F, C , S or Q for quit: ");
              userInputCh = keyboard.nextLine();// get user input in String
              letter = userInputCh.charAt(0);// get the user input with pick only first character
              letter = Character.toUpperCase(letter);//convert input to upper case to simplify later code
            
            
            
          }while (letter != 'F' && letter != 'C' && letter != 'S' && letter != 'Q');
       }
       System.out.println("The program closed !!!");
       System.exit(0);
    }// end main
    
}// end class
