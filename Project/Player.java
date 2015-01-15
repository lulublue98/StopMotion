import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Player implements ActionListener {

    private JFrame frame;
    private JPanel header, screen, toolbox;

    frame = new JFrame("StopMotion Player");
    frame.setSize(1000,700);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    header = new JPanel(new GridBagLayout());
    header.setPreferredSize(new Dimension(1000,200));
    frame.getContentPane().add(header, BorderLayout.NORTH);
    
    screen = new JPanel(new GridBagLayout());
    screen.setPreferredSize(new Dimension(400,200));
    frame.getContentPane().add(screen, BorderLayout.EAST);
    screen.setBorder(BorderFactory.createLineBorder(Color.red, 5));

    toolbox = new JPanel(new GridBagLayout());
    toolbox.setPreferredSize(new Dimension(400,200));
    frame.getContentPane().add(toolbox, BorderLayout.EAST);
    toolbox.setBorder(BorderFactory.createLineBorder(Color.red, 5));
    

    public static void main(String[] args) {
	Player P = new Player();
    }

}
