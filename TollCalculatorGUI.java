/**
 * @(#)TollCalculatorGUI.java
 *
 *
 * @Derick Warshaw // Lab 12 // COSC1337
 * @version 1.00 2014/4/24
 */
import javax.swing.*;			// GUI functionality
import java.awt.*;				// GUI functionality
import java.awt.event.*; 		// event listeners
import java.text.DecimalFormat; // for formatting output

/**The TollCalculatorGUI class creates the GUI for the application */
public class TollCalculatorGUI extends JFrame
{
	private VehicleAxlesPanel vehicle;
	private TrailerAxlesPanel trailer;
	private GreetingPanel banner;
	private PassengersPanel passengers;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;


	/**TollCalculatorGUI Constructor performs setup operations */
    public TollCalculatorGUI()
    {

		// setting the title
	    setTitle("Toll Calculator");


	    // setting action for the close button
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // create borderlayout manager
	    setLayout(new BorderLayout());

	    // custom panels
	    banner = new GreetingPanel();
	    vehicle = new VehicleAxlesPanel();
	    trailer = new TrailerAxlesPanel();
	    passengers = new PassengersPanel();

	    // button panel
	    buildButtonPanel();

	    // add components
	    add(banner, BorderLayout.NORTH);
	    add(passengers, BorderLayout.WEST);
	    add(vehicle, BorderLayout.CENTER);
	    add(trailer, BorderLayout.EAST);
	    add(buttonPanel, BorderLayout.SOUTH);

		// for the perfect fit
	    pack();

	    // make visible
	    setVisible(true);

    }

    /**The buildButtonPanel  is a private method that method builds the button
     *panel
     **/
    private void buildButtonPanel()
    {
     	// create a panel for the buttons
     	buttonPanel = new JPanel();

     	// create the buttons
     	calcButton = new JButton("Calculate");
     	exitButton = new JButton("Exit");

     	// connect the action listeners
     	calcButton.addActionListener(new CalcButtonListener());
     	exitButton.addActionListener(new ExitButtonListener());

     	//add the buttons to the panel
     	buttonPanel.add(calcButton);
     	buttonPanel.add(exitButton);
    }

    /**Private inner class that handles the event when the user clicks the
     *Calculate button */
    private class CalcButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		double total; // holds total toll value

    		total = passengers.getPassengerCost() + vehicle.getVehicleAxleCost()
    			  + trailer.getTrailerAxleCost();

    		// creating format object to use with toll display
			DecimalFormat formatter = new DecimalFormat("#0.00");

			// calculate toll and present it formatted in output dialogue box
    		JOptionPane.showMessageDialog(null, "Thank you for using " +
						                         "Warshaw Super Speedway Toll" +
						                         "\n\n" + "Your toll due is $" +
						                         formatter.format(total));

    	}
    }

    /**Private inner class that handles the event when the user clicks the exit
     *button */
    private class ExitButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		System.exit(0);

    	}
    }

	// embedded main
	public static void main(String[] args)
	{
		new TollCalculatorGUI();
	}

}