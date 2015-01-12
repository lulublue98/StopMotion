import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class ColorButton extends JPanel implements MouseListener {

    private Color color;
    private Canvas c;

    public ColorButton( int r, int g, int b ) {
	color = new Color( r, g, b );
	setBackground(color);
    }

    public void addCanvas( Canvas c ) {
	this.c = c;
    }

    public void mouseClicked(MouseEvent e) {
	c.setLineColor(color);
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }

}
