/**
 * @(#)PassengersPanel.java
 *
 *
 * @Derick Warshaw // Lab 12 // COSC1337
 * @version 1.00 2014/4/24
 */
import javax.swing.*;
import java.awt.*;

/**The PassengersPanel class allows the user to select how many axles the
 *trailer has */
public class PassengersPanel extends JPanel
{
	private JTextField passengersTextField;	// to hold user input


	/**PassengersPanel Constructor performs setup operations for text field */
    public PassengersPanel()
    {

    	passengersTextField = new JTextField(8); // text field with length of 2

    	// add text field to panel
		add(passengersTextField);

		// add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Passengers"));

    }

    /**The getPassengerCost method determines how much to charge for passengers
     *@returns passengerCost is a fee
     * */
     public double getPassengerCost()
     {

		final double PASSENGER_FEE = 0.05;	// constant value for passenger fee
     	int parsedInput = 0;				// holds parsed int value
     	double cost = 0.0;					// calculated based on # passengers
     	String input;						// raw input from text field

     	input = passengersTextField.getText(); // get the text from text field
     	parsedInput = Integer.parseInt(input); // parse to int value

     	// If no passenger is present or a negative number is entered, charge 0
		if(parsedInput < 1)
		{
			cost = parsedInput * 0.00;
		}
		// calculate passenger toll if at least 1 passenger present
		else
		{
			cost = parsedInput * PASSENGER_FEE;
		}

		return cost;

     }

}