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
    private JPanel panel, panel2;
    private CheckboxGroup options;
    private Checkbox Linebox;
    private Checkbox Drawbox;

    public void actionPerformed(ActionEvent e) {
	if ( e.getSource() == clear ) {
	    canvas.clear();
	    canvas.paintComponent(canvas.getGraphics());
	} 
    }

    public Gui() {
	
	color = new JButton(Color.red);

	options = new CheckboxGroup();
	Linebox = new Checkbox("Line",options,true);
	Drawbox = new Checkbox("Freehand",options,true);	

	frame = new JFrame("Gui");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel = new JPanel(new GridBagLayout());
	panel.setPreferredSize(new Dimension(1000,200));
	frame.getContentPane().add(panel, BorderLayout.NORTH);

	clear = new JButton("Clear");
	panel.add(clear);
	
	canvas = new Canvas(options);
	frame.getContentPane().add(canvas, BorderLayout.WEST);
	canvas.setPreferredSize(new Dimension(600,500));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	
	panel2 = new JPanel(new GridBagLayout());
	panel2.setPreferredSize(new Dimension(400,200));
	frame.getContentPane().add(panel2, BorderLayout.EAST);
	panel2.setBorder(BorderFactory.createLineBorder(Color.red, 5));
	
	GridBagConstraints c = new GridBagConstraints();
	c.insets = new Insets(40,40,70,70);
	GridBagConstraints c2 = new GridBagConstraints();
	c2.insets = new Insets(40,40,0,0);
	
	c.gridx = 0;
	c.gridy = 0;
	panel2.add(Linebox, c);
	c.gridy = 1;
	panel2.add(Drawbox, c);
	c.gridy = 2;
	panel2.add(Color, c);

    }

    public static void main(String[] args) {
	Gui T = new Gui();
    }
}
