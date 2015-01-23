import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Rectangle {

    public int x, y, z, w;
    public Color c;

    public Rectangle(int a, int b, int width, int length, Color col) {
	x = a;
	y = b;
	w = width;
	z = length;
	c = col;
    }
}
