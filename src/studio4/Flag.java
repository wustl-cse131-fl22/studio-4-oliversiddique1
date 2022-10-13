package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.rectangle(.5, .5, .4, .2);
	StdDraw.setPenColor(Color.BLUE);
	StdDraw.line(0.2, 0.6, 0.8, 0.6);
	StdDraw.line(0.2, 0.4, 0.8, 0.4);
	StdDraw.setPenColor(Color.RED);
	StdDraw.line(0.2, 0.35, 0.8, 0.35);
	StdDraw.line(0.2, 0.65, 0.8, 0.65);
	StdDraw.setPenColor(Color.YELLOW);
	StdDraw.filledRectangle(.5, .5, .2, .05);
	}
}