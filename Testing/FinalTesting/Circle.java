import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle {

    private int x;
    private int y;
    private int width;
    Ellipse2D.Double circle;

    public Color c;

    public Circle() {
	circle = new Ellipse2D.Double(x, y, width, width);
    }

    public Color getColor() {
	return c;
    }
