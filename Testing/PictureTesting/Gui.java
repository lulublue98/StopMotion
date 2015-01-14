import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui implements ActionListener {

    private JFrame frame;
    private JButton clear, undo, save;
    private Canvas canvas;
    private JPanel header, toolbox, ColorPanel, GreyScale;
    private CheckboxGroup options;
    private Checkbox Linebox;
    private Checkbox Drawbox;
    private JTextArea text;
    private String s;

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
    private ColorButton c11;
    private ColorButton c12;
    private ColorButton c13;
    private ColorButton c14;
    private ColorButton c15;
    private ColorButton c16;

    public void actionPerformed(ActionEvent e) {
	if ( e.getSource() == clear ) {
	    canvas.clear();
	    canvas.paintComponent(canvas.getGraphics());
	} else if ( e.getSource() == undo ) {
	    canvas.removeLine();
	    canvas.paintComponent(canvas.getGraphics());
	} else if ( e.getSource() == save ) {
	    canvas.saveImage(canvas, s);
	}
    }

    public Gui() {

	options = new CheckboxGroup();
	Linebox = new Checkbox("Line",options,true);
	Drawbox = new Checkbox("Freehand",options,true);	

	frame = new JFrame("StopMotion");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	header = new JPanel(new GridBagLayout());
	header.setPreferredSize(new Dimension(1000,200));
	frame.getContentPane().add(header, BorderLayout.NORTH);
	
	save = new JButton("Save");
	save.addActionListener(this);
	header.add(save);

	canvas = new Canvas(options);
	frame.getContentPane().add(canvas, BorderLayout.WEST);
	canvas.setPreferredSize(new Dimension(600,500));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	
	toolbox = new JPanel(new GridBagLayout());
	toolbox.setPreferredSize(new Dimension(400,200));
	frame.getContentPane().add(toolbox, BorderLayout.EAST);
	toolbox.setBorder(BorderFactory.createLineBorder(Color.red, 5));
	
	GridBagConstraints f = new GridBagConstraints();
	f.insets = new Insets(10,10,50,50);
	f.gridx = 0;
	f.gridy = 0;
	clear = new JButton("Clear");
	clear.addActionListener(this);
	toolbox.add(clear, f);
	f.gridx = 1;
	undo = new JButton("Undo");
	undo.addActionListener(this);
	toolbox.add(undo, f);
	f.gridy = 1;
	f.gridx = 0;
	toolbox.add(Linebox, f);
	f.gridx = 1;
	toolbox.add(Drawbox, f);

	ColorPanel = new JPanel();
	ColorPanel.setPreferredSize(new Dimension(72,72));
	ColorPanel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
	GreyScale = new JPanel();
	GreyScale.setPreferredSize(new Dimension(72, 8));

	c1 = new ColorButton(255, 0, 0);
	c1.addCanvas( canvas );
	c1.addMouseListener(c1);
	c2 = new ColorButton(255, 255, 0);
	c2.addCanvas( canvas );
	c2.addMouseListener(c2);
	c3 = new ColorButton(0, 255, 0);
	c3.addCanvas( canvas );
	c3.addMouseListener(c3);
	c4 = new ColorButton(0, 0, 255);
	c4.addCanvas( canvas );
	c4.addMouseListener(c4);
	c5 = new ColorButton(255, 100, 100);
	c5.addCanvas( canvas );
	c5.addMouseListener(c5);
	c6 = new ColorButton(255, 255, 100);
	c6.addCanvas( canvas );
	c6.addMouseListener(c6);
	c7 = new ColorButton(100, 255, 100);
	c7.addCanvas( canvas );
	c7.addMouseListener(c7);
	c8 = new ColorButton(100, 100, 255);
	c8.addCanvas( canvas );
	c8.addMouseListener(c8);
	c9 = new ColorButton(0, 0, 0);
	c9.addCanvas( canvas );
	c9.addMouseListener(c9);
	c10 = new ColorButton(0, 0, 0);
	c10.addCanvas( canvas );
	c10.addMouseListener(c10);
	c11 = new ColorButton(0, 0, 0);
	c11.addCanvas( canvas );
	c11.addMouseListener(c11);
	c12 = new ColorButton(0, 0, 0);
	c12.addCanvas( canvas );
	c12.addMouseListener(c12);
	c13 = new ColorButton(0, 0, 0);
	c13.addCanvas( canvas );
	c13.addMouseListener(c13);
	c14 = new ColorButton(0, 0, 0);
	c14.addCanvas( canvas );
	c14.addMouseListener(c14);
	c15 = new ColorButton(0, 0, 0);
	c15.addCanvas( canvas );
	c15.addMouseListener(c15);
	c16 = new ColorButton(0, 0, 0);
	c16.addCanvas( canvas );
	c16.addMouseListener(c16);

	GridBagConstraints g = new GridBagConstraints();
	g.gridx = 0;
	g.gridy = 0;
	ColorPanel.add(c1, g);
	g.gridx = 1;
	ColorPanel.add(c2, g);
	g.gridx = 2;
	ColorPanel.add(c3, g);
	g.gridx = 3;
	ColorPanel.add(c4, g);
	g.gridx = 4;
	ColorPanel.add(c5, g);
	g.gridx = 5;
	ColorPanel.add(c6, g);
	g.gridx = 6;
	ColorPanel.add(c7, g);
	g.gridx = 7;
	ColorPanel.add(c8, g);

	f.gridy = 2;
	f.gridx = 0;
	toolbox.add(ColorPanel, f);

	text = new JTextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	header.add(text);
	s = text.getText();

    }

    public static void main(String[] args) {
	Gui T = new Gui();
    }
}
