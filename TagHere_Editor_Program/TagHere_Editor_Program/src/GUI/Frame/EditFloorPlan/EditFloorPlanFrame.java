package GUI.Frame.EditFloorPlan;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;

import Data.ColorData;
import Data.DimenData;
import GUI.Component.SimpleJFrame;
import GUI.Component.TitleBarPanel;

/**
 * JFrame for edit floor plan
 * @author DongKyu
 * @since 11.07.15
 */
public class EditFloorPlanFrame extends SimpleJFrame {
	
	/** For show title bar */
	private TitleBarPanel titleBar;

	public EditFloorPlanFrame(String frameName, int width, int height) {
		super(frameName, width, height);
		this.setLayout(null);
		
		titleBar = new TitleBarPanel(this, frameName, width);
		titleBar.setLocation(0, 0);

		
		
		this.add(titleBar);
		this.getRootPane().setBorder(BorderFactory.createLineBorder(ColorData.GRAY, 2));
	}

}
