import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui implements ActionListener {

    private JFrame frame;
    private JPanel header, screen, toolbox;

    frame = new JFrame("StopMotion Player
");
    frame.setSize(1000,700);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    header = new JPanel(new GridBagLayout());
    header.setPreferredSize(new Dimension(1000,200));
    frame.getContentPane().add(header, BorderLayout.NORTH);
    
    
