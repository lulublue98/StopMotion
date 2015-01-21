import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Canvas extends JPanel implements MouseListener, MouseMotionListener {

    private ArrayList<Line> lines = new ArrayList<Line>();
    private ArrayList<Circle> circles = new ArrayList<Circle>();
    private Line tmpline;
    private int startX,startY;
    private int oldX, oldY;
    private Color c;
    private boolean drawing = false;
    private boolean enabled = true;
    private CheckboxGroup options;

    public void mouseMoved(MouseEvent e) {
    }
    public void mouseDragged(MouseEvent e) {
	String opt = options.getSelectedCheckbox().getLabel();
	if (opt.equals("Line")) {
	    this.startDrawing(new Line(startX,startY,
				       e.getX(),e.getY(),
				       c));
	}
	else if (opt.equals("Freehand")) {
	    this.addLine(new Line(oldX, oldY,
				  e.getX(),e.getY(),
				  c));
	    oldX = e.getX();
	    oldY = e.getY();
	}
	this.update(this.getGraphics());
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
	startX = e.getX();
	startY = e.getY();
	oldX = startX;
	oldY = startY;
    }
    public void mouseReleased(MouseEvent e) {
	String opt = options.getSelectedCheckbox().getLabel();
	if (opt.equals("Line")) {
	    this.addLine(new Line(startX,startY,
				  e.getX(),e.getY(),
				  c));
	    this.stopDrawing();
	} else if (opt.equals("Circle")) {
	    double x,y;
	    x = Math.abs(startX-e.getX());
	    y = Math.abs(startY-e.getY());
	    int size = (int)Math.sqrt(x*x+y*y);
	    this.addCircle(new Circle(e.getX(),e.getY(),
				      size,c));
	    this.stopDrawing();
	}
	this.update(this.getGraphics());
    }
    
    public Canvas(CheckboxGroup options) {
	this.options = options;
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
	c = new Color(0, 0, 0);
    }

    public void setLineColor( Color color ) {
	c = color;
    }

    public void startDrawing(Line l) {
	drawing = true;
	tmpline = l;
    }

    public void stopDrawing() {
	drawing=false;
    }

    public void clear() {
	lines = new ArrayList<Line>();
	circles = new ArrayList<Circle>();
	drawing=false;
	this.update(this.getGraphics());
    }

    public void addLine(Line l) {
	lines.add(l);
    }

    public void addCircle(Circle cir) {
	circles.add(cir);
    }

    public void removeLine() {
	lines.remove(lines.size()-1);
	drawing=false;
	this.update(this.getGraphics());
    }

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	if (drawing) {
	    g.setColor(c);
	    g.drawLine(tmpline.x0,tmpline.y0,
		       tmpline.x1,tmpline.y1);
	}
	for (Circle cir : circles) {
	    g.setColor(cir.c);
	    g.fillOval(cir.x,cir.y,cir.r,cir.r);
	}
	for (Line l : lines) {
	    g.setColor(l.c);
	    g.drawLine(l.x0,l.y0,l.x1,l.y1);
	}
    }

    public void saveImage(Canvas panel, String x) {
	int w = panel.getWidth();  
        int h = panel.getHeight();  
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);  
        Graphics2D g2 = bi.createGraphics();  
        panel.paint(g2);  
        g2.dispose();  
        try {  
	    ImageIO.write(bi, "jpg", new File(x + ".jpg"));  
	}  
        catch(IOException ioe) {  
	    System.out.println("Panel write help: " + ioe.getMessage());  
	}  
    }

}
