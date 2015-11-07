package FloorPlanObject;

import java.awt.Color;
import java.awt.Dimension;

/**
 * Line Object
 * Have start position, end position, thickness, type and color
 * @author DongKyu
 *
 */

public class Line extends FPObject {
	
	/** Dimension for start position */
	private Dimension startPosition;
	/** Dimension for end position */
	private Dimension endPosition;
	/** Integer for thisckness */
	private int thickness;
	/** LineType for line type */
	private LineType type;
	/** Color for line color */
	private Color color;
	
	
	public Dimension getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(Dimension startPosition) {
		this.startPosition = startPosition;
	}
	public Dimension getEndPosition() {
		return endPosition;
	}
	public void setEndPosition(Dimension endPosition) {
		this.endPosition = endPosition;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	public LineType getType() {
		return type;
	}
	public void setType(LineType type) {
		this.type = type;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
