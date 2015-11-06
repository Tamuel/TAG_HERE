package GUI.Frame.SelectFloorPlan;

import javax.swing.JScrollPane;

import GUI.Component.SimpleJFrame;
import GUI.Component.TitleBarPanel;

/**
 * JFrame for show floor plan list and preview
 * @author DongKyu
 * @since 11.07.15
 */

public class SelectFloorPlanFrame extends SimpleJFrame{
	
	/** Title bar panel */
	private TitleBarPanel titleBar;
	/** JPanel for search floor plan */
	private SearchPanel searchPanel;
	/** For floor plan list scroll */
	private JScrollPane searchScroll;

	public SelectFloorPlanFrame(String frameName, int width, int height) {
		super(frameName, width, height);
		
		titleBar = new TitleBarPanel();
		searchPanel = new SearchPanel(width / 3, height);
		searchScroll = new JScrollPane();
		
//		searchScroll.setLocation(0, titleBarHeight);
//		searchScroll.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, new Color(200, 200, 200)));
//		searchScroll.setSize(subjectList.getWidth() + scrollBarWidth, this.HEIGHT - titleBar.getHeight());
//		searchScroll.setWheelScrollingEnabled(true);
//		searchScroll.setViewportView(subjectList);
	}
}