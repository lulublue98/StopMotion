import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Line {

    public int x0,y0,x1,y1;
    public Color c;

    public Line(int x0,int y0, int x1, int y1, Color c) {
	this.x0 = x0; this.y0 = y0;
	this.x1 = x1; this.y1 = y1;
	this.c = c;
    }

    public Color getColor() {
	return c;
    }

}
