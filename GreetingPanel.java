/**
 * @(#)GreetingPanel.java
 *
 *
 * @Derick Warshaw // Lab 12 // COSC1337
 * @version 1.00 2014/4/24
 */
import javax.swing.*;

/**The GreetingPanel class displays a greeting in a panel */
public class GreetingPanel extends JPanel
{
	private JLabel greeting;


	/**GreetingPanel Constructor */
    public GreetingPanel()
    {
    	greeting = new JLabel("Welcome to the Toll Calculator");

		// add the greeting to the panel
    	add(greeting);

    }

}