import javax.swing.*;
import java.awt.*;
import java.awt.CardLayout;  
import java.awt.Dimension;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.image.BufferedImage;  
import java.io.IOException;  
import java.net.MalformedURLException;  
import java.net.URL;  
import java.awt.event.*;
  
import javax.imageio.ImageIO;  
import javax.swing.ImageIcon;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.JComponent;  

public class Player implements ActionListener {

    private JFrame frame;
    private JPanel header, screen, toolbox;
    private JButton upload;
    private ImageIcon temp;
    private int numPics;
    private JLabel label;
    private JLabel l;
    private ImageIcon[] images = new ImageIcon[1000];
    JTextArea text;

    public void actionPerformed(ActionEvent e){
	if ( e.getSource() == upload ) {
	    temp = new ImageIcon( text.getText() );
	    images[numPics] = temp;
	    numPics = numPics + 1;
	}
    }

    public Player() {

	frame = new JFrame("StopMotion Player");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	header = new JPanel(new GridBagLayout());
	header.setPreferredSize(new Dimension(1000,200));
	frame.getContentPane().add(header, BorderLayout.NORTH);
	
	GridBagConstraints h = new GridBagConstraints();
	h.gridy = 0;
	h.gridx = 0;
	upload = new JButton("Upload");
	upload.addActionListener(this);
	header.add(upload, h);
	h.gridx = 1;
	l = new JLabel("  Upload:  ");
	header.add(l, h);
	h.gridx = 2;
	text = new JTextArea();
	text.setColumns(30);
	text.setRows(1);
	text.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	header.add(text, h);

	screen = new JPanel(new GridBagLayout());
	screen.setPreferredSize(new Dimension(600,500));
	frame.getContentPane().add(screen, BorderLayout.WEST);
	screen.setBorder(BorderFactory.createLineBorder(Color.blue, 5));

	toolbox = new JPanel(new GridBagLayout());
	toolbox.setPreferredSize(new Dimension(400,200));
	frame.getContentPane().add(toolbox, BorderLayout.EAST);
	toolbox.setBorder(BorderFactory.createLineBorder(Color.red, 5));

	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

   public static void main(String[] args) {
       Player P = new Player();
   }

}
