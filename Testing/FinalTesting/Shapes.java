import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Shapes {

    public int x, y, w, h;
    public Color c;
    public boolean which;
    
    public Shapes(String what, int a, int b, 
		  int width, int height, Color col) {
	x = a;
	y = b; 
	w = width;
	h = height;
	c = col;
	if ( what == "circle") {
	    which == true;
	} else if ( what == "rectangle" ) {
	    which == false;
	}
    }

}
