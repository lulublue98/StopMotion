import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui implements ActionListener {

    private JFrame frame;
    private JButton clear;
    private Canvas canvas;
    private JPanel header, toolbox, ColorPanel;
    private CheckboxGroup options;
    private Checkbox Linebox;
    private Checkbox Drawbox;

    private ColorButton c1;
    private ColorButton c2;
    private ColorButton c3;
    private ColorButton c4;
    private ColorButton c5;
    private ColorButton c6;
    private ColorButton c7;
    private ColorButton c8;
    private ColorButton c9;
    private ColorButton c10;

    public void actionPerformed(ActionEvent e) {
	if ( e.getSource() == clear ) {
	    canvas.clear();
	    canvas.paintComponent(canvas.getGraphics());
	} else if ( e.getSource() == c1 ) {
	    Color tempcolor = new Color(0, 0, 0);
	    tempcolor = c1.getColor();
	    canvas.setLineColor( tempcolor );
	}
    }

    public Gui() {

	options = new CheckboxGroup();
	Linebox = new Checkbox("Line",options,true);
	Drawbox = new Checkbox("Freehand",options,true);	

	frame = new JFrame("Gui");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	header = new JPanel(new GridBagLayout());
	header.setPreferredSize(new Dimension(1000,200));
	frame.getContentPane().add(header, BorderLayout.NORTH);

	clear = new JButton("Clear");
	clear.addActionListener(this);
	header.add(clear);
	
	canvas = new Canvas(options);
	frame.getContentPane().add(canvas, BorderLayout.WEST);
	canvas.setPreferredSize(new Dimension(600,500));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	
	toolbox = new JPanel(new GridBagLayout());
	toolbox.setPreferredSize(new Dimension(400,200));
	frame.getContentPane().add(toolbox, BorderLayout.EAST);
	toolbox.setBorder(BorderFactory.createLineBorder(Color.red, 5));
	
	GridBagConstraints f = new GridBagConstraints();
	f.insets = new Insets(40,40,70,70);
	f.gridx = 0;
	f.gridy = 0;
	toolbox.add(Linebox, f);
	f.gridy = 1;
	toolbox.add(Drawbox, f);

	ColorPanel = new JPanel();
	ColorPanel.setPreferredSize(new Dimension(72,72));
	ColorPanel.setBorder(BorderFactory.createLineBorder(Color.black, 2));

	c1 = new ColorButton(10, 100, 255);
	c2 = new ColorButton(255, 190, 190);
	c3 = new ColorButton(100, 200, 50);
	/*
	c4 = new ColorButton(0, 0, 0);
	c5 = new ColorButton(0, 0, 0);
	c6 = new ColorButton(0, 0, 0);
	c7 = new ColorButton(0, 0, 0);
	c8 = new ColorButton(0, 0, 0);
	c9 = new ColorButton(0, 0, 0);
	c10 = new ColorButton(0, 0, 0);
	*/
	c1.addActionListener(this);
	c2.addActionListener(this);
	c3.addActionListener(this);
	/*
	c4.addActionListener(this);
	c5.addActionListener(this);
	c6.addActionListener(this);
	c7.addActionListener(this);
	c8.addActionListener(this);
	c9.addActionListener(this);
	c10.addActionListener(this);
	*/

	GridBagConstraints g = new GridBagConstraints();
	g.gridx = 0;
	g.gridy = 0;
	ColorPanel.add(c1, g);
	g.gridx = 1;
	ColorPanel.add(c2, g);
	g.gridx = 2;
	ColorPanel.add(c3, g);

	f.gridy = 2;
	toolbox.add(ColorPanel, f);

    }

    public static void main(String[] args) {
	Gui T = new Gui();
    }
}
