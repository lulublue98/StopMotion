import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Tester implements ActionListener {

    private JFrame frame;
    private JButton quit;
    private Canvas canvas;
    private JButton clear;
    private JPanel iface;
    private CheckboxGroup options;
    private Checkbox Linebox;

    /*
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == clear) {
	    canvas.clear();
	    canvas.paintComponent(canvas.getGraphics());
	}
	else if (e.getSource() == quit) {
	    System.exit(0);
	}
    }
    */

    public Tester() {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(new FlowLayout());
	
	options = new CheckboxGroup();
	Linebox = new Checkbox("Line",options,true);

	canvas = new Canvas(options);
	canvas.setBorder(BorderFactory.createLineBorder (Color.blue, 2));
	iface = new JPanel();
	iface.setLayout(new GridLayout(16,1));
	frame.getContentPane().add(canvas);
	frame.getContentPane().add(iface);

	frame.setSize(550,600);
	frame.setVisible(true);
    }
}
