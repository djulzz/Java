/* Dana William Cherry
 School Statistics processing program
 2014FEB03
 Reads text files to create output text files for storage of 
processed statistics
 */
import java.io.*;
import javax.swing.*;

public class TempConv
{
    
    public static void main(String args[]) throws IOException
    {
    	JOptionPane UserGUI = null;
        String UserInput = UserGUI.showInputDialog(null, "Please type the temperature you to convert", "Farenheit", JOptionPane.INFORMATION_MESSAGE);
        int Temperature=Integer.parseInt(UserInput);
        Temperature= (Temperature - 32)*5/9;
        UserGUI.showMessageDialog(null,"Your converted temperature from Celcius: " + Temperature , "Celcius", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
        
}