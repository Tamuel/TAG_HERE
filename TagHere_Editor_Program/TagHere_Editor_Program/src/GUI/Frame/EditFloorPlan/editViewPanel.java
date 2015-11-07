package GUI.Frame.EditFloorPlan;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Data.ColorData;
import FloorPlan.Building;
import FloorPlan.FloorPlan;

public class editViewPanel extends JPanel {
	
	/** For approach current floor plan */
	private FloorPlan floorPlan;
	
	public editViewPanel(int width, int height, FloorPlan floorPlan) {
		super();
		this.floorPlan = floorPlan;
		this.setLayout(null);

		

		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(ColorData.GRAY, 1));
		this.setPreferredSize(new Dimension(width, height));
		this.setSize(new Dimension(width, height));
	}

}
