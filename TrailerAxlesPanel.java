/**
 * @(#)TrailerAxlesPanel.java
 *
 *
 * @Derick Warshaw // Lab 12 // COSC1337
 * @version 1.00 2014/4/24
 */
import javax.swing.*;
import java.awt.*;

/**The TrailerAxlesPanel class allows the user to select how many axles the
 *trailer has */
public class TrailerAxlesPanel extends JPanel
{
	private JRadioButton zeroTrailerAxleButton;	// select 0 trailer axle
	private JRadioButton oneTrailerAxleButton;	// select 1 trailer axle
    private JRadioButton twoTrailerAxleButton;	// select 2 trailer axle
    private JRadioButton threeTrailerAxleButton;// select 3 trailer axle

    private ButtonGroup trailerAxlesGroup; // radio button group


	/**TrailerAxlesPanel Constructor performs setup operations */
    public TrailerAxlesPanel()
    {
    	// grid layout
    	setLayout(new GridLayout(4,1));

    	// create radio buttons with 0 axles being the default
    	zeroTrailerAxleButton = new JRadioButton("0                    ", true);
    	oneTrailerAxleButton = new JRadioButton("1                    ");
		twoTrailerAxleButton = new JRadioButton("2                    ");
		threeTrailerAxleButton = new JRadioButton("3 or more                 ");

		// add radio buttons to group
		trailerAxlesGroup = new ButtonGroup();
		trailerAxlesGroup.add(zeroTrailerAxleButton);
		trailerAxlesGroup.add(oneTrailerAxleButton);
		trailerAxlesGroup.add(twoTrailerAxleButton);
		trailerAxlesGroup.add(threeTrailerAxleButton);

		// add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Trailer Axles"));

		//add the radio buttons to the panel
		add(zeroTrailerAxleButton);
		add(oneTrailerAxleButton);
		add(twoTrailerAxleButton);
		add(threeTrailerAxleButton);

    }

    /**The getVehicleAxleCost method determines how much to charge
     *@returns cost is a fee
     * */
     public double getTrailerAxleCost()
     {
     	// constant variables for toll values
		final double TRAILER_AXLES_0 = 0.00;
    	final double TRAILER_AXLES_1 = 0.25;
    	final double TRAILER_AXLES_2 = 0.50;
    	final double TRAILER_AXLES_3_OR_MORE = 0.75;

		// cost holds a calculated value based on number of axles selected
		double cost = 0.0;

		// determining which toll rate to apply based on number of axles
     	if(zeroTrailerAxleButton.isSelected())
     	{
			cost = TRAILER_AXLES_0;

     	}

     	else if(oneTrailerAxleButton.isSelected())
     	{
     		cost = TRAILER_AXLES_1;

     	}

     	else if(twoTrailerAxleButton.isSelected())
     	{
     		cost = TRAILER_AXLES_2;

     	}

     	else if(threeTrailerAxleButton.isSelected())
     	{

     		cost = TRAILER_AXLES_3_OR_MORE;


     	}

		return cost;

     }

}