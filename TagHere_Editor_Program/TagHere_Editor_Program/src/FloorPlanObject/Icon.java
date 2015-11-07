package FloorPlanObject;

import java.awt.Dimension;
import java.awt.Image;

/**
 * Icon Object
 * Have image, position and text
 * @author DongKyu
 *
 */

public class Icon extends FPObject {
	
	/** Image for icon image */
	private Image iconImage;
	/** Dimension for position */
	private Dimension position;
	/** String for extra data */
	private String text;
	
	
	public Image getIconImage() {
		return iconImage;
	}
	public void setIconImage(Image iconImage) {
		this.iconImage = iconImage;
	}
	public Dimension getPosition() {
		return position;
	}
	public void setPosition(Dimension position) {
		this.position = position;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
