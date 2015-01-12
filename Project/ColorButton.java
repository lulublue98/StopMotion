import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class ColorButton extends JPanel implements ActionListener {

    private Color color;

    public ColorButton( int r, int g, int b ) {
	color = new Color( r, g, b );
	setBackground(color);
    }

    public Color getColor() {
	return color;
    }

    public void addActionPerformed(Gui g) {
    }

}
