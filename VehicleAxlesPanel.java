/**
 * @(#)VehicleAxlesPanel.java
 *
 *
 * @Derick Warshaw // Lab 12 // COSC1337
 * @version 1.00 2014/4/24
 */
import javax.swing.*;
import java.awt.*;

/**The VehicleAxlesPanel class allows the user to select how many axles the
 *vehicle has */
public class VehicleAxlesPanel extends JPanel
{
    private JRadioButton twoVehicleAxleButton;	// select 2 vehicle axle
    private JRadioButton threeVehicleAxleButton;// select 3 vehicle axle
    private JRadioButton fourVehicleAxleButton;// select 4 vehicle axle
    private JRadioButton fiveOrMoreVehicleAxleButton;// 5 or more

    private ButtonGroup vehicleAxlesGroup; // radio button group




	/**VehicleAxlesPanel Constructor performs setup operations */
    public VehicleAxlesPanel()
    {
    	// grid layout
    	setLayout(new GridLayout(4,1));

    	// create radio buttons with 2 axles being the default
		twoVehicleAxleButton = new JRadioButton("2                    ", true);
		threeVehicleAxleButton = new JRadioButton("3                    ");
		fourVehicleAxleButton = new JRadioButton("4                    ");
		fiveOrMoreVehicleAxleButton = new JRadioButton("5 or more            ");

		// add radio buttons to group
		vehicleAxlesGroup = new ButtonGroup();

		vehicleAxlesGroup.add(twoVehicleAxleButton);
		vehicleAxlesGroup.add(threeVehicleAxleButton);
		vehicleAxlesGroup.add(fourVehicleAxleButton);
		vehicleAxlesGroup.add(fiveOrMoreVehicleAxleButton);

		// add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Vehicle Axles"));

		//add the radio buttons to the panel
		add(twoVehicleAxleButton);
		add(threeVehicleAxleButton);
		add(fourVehicleAxleButton);
		add(fiveOrMoreVehicleAxleButton);

    }

    /**The getVehicleAxleCost method determines how much to charge
     *@returns cost is a double data type fee
     * */
     public double getVehicleAxleCost()
     {
		// constant values for tolls
    	final double VEHICLE_AXLES_2 = 0.25;
    	final double VEHICLE_AXLES_3 = 0.50;
    	final double VEHICLE_AXLES_4 = 0.75;
    	final double VEHICLE_AXLES_5_OR_MORE = 1.00;

		// cost is a calculated value for the appropriate toll
		double cost = 0.0;

		// determining which toll is appropriate given number of axles selected
     	if(twoVehicleAxleButton.isSelected())
     	{
			cost = VEHICLE_AXLES_2;

     	}

     	else if(threeVehicleAxleButton.isSelected())
     	{
     		cost = VEHICLE_AXLES_3;

     	}

     	else if(fourVehicleAxleButton.isSelected())
     	{
     		cost = VEHICLE_AXLES_4;

     	}

     	else if(fiveOrMoreVehicleAxleButton.isSelected())
     	{

     		cost = VEHICLE_AXLES_5_OR_MORE;


     	}

		return cost;

     }
}