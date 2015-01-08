import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class WriteImageType2{
    private JFrame frame;
    private Canvas canvas;
    private CheckboxGroup options;

    public WriteImageType2() {
	canvas = new Canvas(options);
	frame.getContentPane().add(canvas, BorderLayout.WEST);
	canvas.setPreferredSize(new Dimension(600,500));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
      
	try {
	    int width = 600, height = 500;
	    BufferedImage canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

	    ImageIO.write(canvas, "PNG", new File("c:\\TestFile.PNG"));

	} catch (IOException ie) {
	    ie.printStackTrace();
	}

    }

    public static void main(String[] args) {
	WriteImageType T = new WriteImageType();
    }
}
