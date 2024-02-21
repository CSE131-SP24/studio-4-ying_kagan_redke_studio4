package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		Double x = in.nextDouble();
		Double y = in.nextDouble();
		Double halfWidth = in.nextDouble();
		Double halfHigh = in.nextDouble();
		
		
		
		StdDraw.setPenColor(r,g,b);
		
		if(shape.equals("ellipse")) {
			if(filled == true) {
			StdDraw.filledEllipse(x, y, halfWidth, halfHigh);
			} else {
				StdDraw.ellipse(x, y, halfWidth, halfHigh);		
		}
		}else if(shape.equals("rectangle")) {
			if(filled == true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHigh);
				} else {
					StdDraw.rectangle(x, y, halfWidth, halfHigh);		
			}
		} else if(shape.equals("triangle")) {
				
				double parameter5 = in.nextDouble();
				double parameter6 = in.nextDouble();				
				double[] xArray = {x, halfWidth, parameter5};
				double[] yArray = {y, halfHigh, parameter6};
				
			StdDraw.filledPolygon(xArray, yArray);
		} else {
			double parameter5 = in.nextDouble();
			double parameter6 = in.nextDouble();
			double[] xArray = {x, halfWidth, parameter5};
			double[] yArray = {y, halfHigh, parameter6};
			
			StdDraw.polygon(xArray, yArray);		
	}
		}

		
		
		
	}
		
	