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
    private Image backgroundImage;
    private String IMAGE_ADDR;
    private String IMAGE_PANEL;  
    private String IMAGE_PATH;
    private CardLayout layout;
    private JButton start;

    public void actionPerformed(ActionEvent e){
    }

    public Player() {

	frame = new JFrame("StopMotion Player");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	header = new JPanel(new GridBagLayout());
	header.setPreferredSize(new Dimension(1000,200));
	frame.getContentPane().add(header, BorderLayout.NORTH);
	
	screen = new JPanel(new GridBagLayout());
	screen.setPreferredSize(new Dimension(600,500));
	frame.getContentPane().add(screen, BorderLayout.WEST);
	screen.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	
	public JPanel createBtnPanel() {  
	    JButton startBtn = new JButton("Start");  
	    startBtn.addActionListener(new StartBtnListener());      
	    JPanel buttonPanel = new JPanel();  
	    buttonPanel.add(startBtn);  
	    return buttonPanel;  
	}
	  
	toolbox = new JPanel(new GridBagLayout());
	toolbox.setPreferredSize(new Dimension(400,200));
	frame.getContentPane().add(toolbox, BorderLayout.EAST);
	toolbox.setBorder(BorderFactory.createLineBorder(Color.red, 5));

	IMAGE_ADDR = "rainbow.jpg";
	IMAGE_PANEL = "Image Panel";
	IMAGE_PATH = ".jpg";
	layout = new CardLayout();

	BufferedImage image = null;  
	try  
	    {  
		image = ImageIO.read(new URL(IMAGE_ADDR));  
	    }  
	catch (MalformedURLException e)  
	    {  
		e.printStackTrace();  
	    }  
	catch (IOException e)  
	    {  
		e.printStackTrace();  
	    }  
	if (image != null)  
	    {  
		canvas.add(new JLabel(new ImageIcon(image)));  
	    }  

	frame.getContentPane().add(new UploadPics().getComponent()); 
	frame.pack(); 

    }

   public static void main(String[] args) {  
       java.awt.EventQueue.invokeLater(new Runnable() {  
	       public void run() {  
		   createAndShowUI();  
	       }  
	   });
       
   }

}
