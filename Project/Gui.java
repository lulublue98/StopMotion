import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui implements ActionListener {

    private JFrame frame;
    private JButton clear, undo, save, upload;
    private Canvas canvas;
    private JPanel header, toolbox, ColorPanel, GreyScale;
    private CheckboxGroup options;
    private Checkbox Linebox, Drawbox, Circlebox;
    JTextArea text1, text2;
    private String s, f;
    private JLabel l1, l2;
    private ImageIcon image;
    private JLabel label;

    private ColorButton c1, c2, c3, c4, c5, c6, c7, c8,
	c9, c10, c11, c12, c13, c14, c15, c16,
	gr1, gr2, gr3, gr4;

    public void actionPerformed(ActionEvent e) {
	if ( e.getSource() == clear ) {
	    canvas.clear();
	    canvas.paintComponent(canvas.getGraphics());
	} else if ( e.getSource() == undo ) {
	    canvas.removeLine();
	    canvas.paintComponent(canvas.getGraphics());
	} else if ( e.getSource() == save ) {
	    s = text1.getText();
	    canvas.saveImage(canvas, s);
	    s = "";
	} else if ( e.getSource() == upload ) {
	    f = text2.getText();
	    image = new ImageIcon( f );
	    label = new JLabel(image);
	    canvas.add(label);
	}
    }

    public Gui() {

	options = new CheckboxGroup();
	Linebox = new Checkbox("Line",options,true);
	Drawbox = new Checkbox("Freehand",options,true);
	Circlebox = new Checkbox("Circle",options,true);

	frame = new JFrame("StopMotion");
	header = new JPanel(new GridBagLayout());
	header.setPreferredSize(new Dimension(1000,200));
	frame.getContentPane().add(header, BorderLayout.NORTH);
	
	GridBagConstraints h = new GridBagConstraints();
	h.gridy = 0;
	h.gridx = 0;
	save = new JButton("Save");
	save.addActionListener(this);
	header.add(save, h);
	h.gridx = 1;
	l1 = new JLabel("Enter filename:");
	header.add(l1, h);	
	h.gridx = 2;
	text1 = new JTextArea();
	text1.setColumns(30);
	text1.setRows(1);
	text1.setBorder(BorderFactory.createLineBorder(Color.red,2));
	header.add(text1, h);
	h.gridy = 1;
	h.gridx = 0;
	upload = new JButton("Upload");
	upload.addActionListener(this);
	header.add(upload, h);
	h.gridx = 1;
	l2 = new JLabel("Upload a background image:  ");
	header.add(l2, h);
	h.gridx = 2;
	text2 = new JTextArea();
	text2.setColumns(30);
	text2.setRows(1);
	text2.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	header.add(text2, h);

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
	GreyScale.setPreferredSize(new Dimension(24, 72));
	GreyScale.setBorder(BorderFactory.createLineBorder(Color.black, 2));

	c1 = new ColorButton(255, 0, 0);
	c1.addCanvas( canvas );
	c1.addMouseListener(c1);
	c2 = new ColorButton(255, 255, 0);
	c2.addCanvas( canvas );
	c2.addMouseListener(c2);
	c3 = new ColorButton(0, 102, 0);
	c3.addCanvas( canvas );
	c3.addMouseListener(c3);
	c4 = new ColorButton(0, 0, 255);
	c4.addCanvas( canvas );
	c4.addMouseListener(c4);
	c5 = new ColorButton(255, 102, 178);
	c5.addCanvas( canvas );
	c5.addMouseListener(c5);
	c6 = new ColorButton(255, 204, 153);
	c6.addCanvas( canvas );
	c6.addMouseListener(c6);
	c7 = new ColorButton(0, 255, 0);
	c7.addCanvas( canvas );
	c7.addMouseListener(c7);
	c8 = new ColorButton(51, 153, 255);
	c8.addCanvas( canvas );
	c8.addMouseListener(c8);
	c9 = new ColorButton(153, 0, 153);
	c9.addCanvas( canvas );
	c9.addMouseListener(c9);
	c10 = new ColorButton(255, 128, 0);
	c10.addCanvas( canvas );
	c10.addMouseListener(c10);
	c11 = new ColorButton(0, 204, 102);
	c11.addCanvas( canvas );
	c11.addMouseListener(c11);
	c12 = new ColorButton(153, 153, 255);
	c12.addCanvas( canvas );
	c12.addMouseListener(c12);
	c13 = new ColorButton(76, 0, 153);
	c13.addCanvas( canvas );
	c13.addMouseListener(c13);
	c14 = new ColorButton(102, 51, 0);
	c14.addCanvas( canvas );
	c14.addMouseListener(c14);
	c15 = new ColorButton(0, 204, 204);
	c15.addCanvas( canvas );
	c15.addMouseListener(c15);
	c16 = new ColorButton(153, 51, 255);
	c16.addCanvas( canvas );
	c16.addMouseListener(c16);
	gr1 = new ColorButton(0, 0, 0);
	gr1.addCanvas( canvas );
	gr1.addMouseListener(c16);
	gr2 = new ColorButton(75, 75, 75);
	gr2.addCanvas( canvas );
	gr2.addMouseListener(c16);
	gr3 = new ColorButton(150, 150, 150);
	gr3.addCanvas( canvas );
	gr3.addMouseListener(c16);
	gr4 = new ColorButton(255, 255, 255);
	gr4.addCanvas( canvas );
	gr4.addMouseListener(c16);

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
	g.gridx = 8;
	ColorPanel.add(c9, g);
	g.gridx = 9;
	ColorPanel.add(c10, g);
	g.gridx = 10;
	ColorPanel.add(c11, g);
	g.gridx = 11;
	ColorPanel.add(c12, g);
	g.gridx = 12;
	ColorPanel.add(c13, g);
	g.gridx = 13;
	ColorPanel.add(c14, g);
	g.gridx = 14;
	ColorPanel.add(c15, g);
	g.gridx = 15;
	ColorPanel.add(c16, g);
	GridBagConstraints gr = new GridBagConstraints();
	gr.gridx = 0;
	gr.gridy = 0;
	GreyScale.add(gr1, gr);
	gr.gridy = 1;
	GreyScale.add(gr2, gr);
	gr.gridy = 2;
	GreyScale.add(gr3, gr);
	gr.gridy = 3;
	GreyScale.add(gr4, gr);	

	f.gridy = 2;
	f.gridx = 0;
	toolbox.add(ColorPanel, f);
	f.gridx = 1;
	toolbox.add(GreyScale, f);

	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
	Gui T = new Gui();
    }
}
