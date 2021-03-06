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

public class TestGui4_1 {

    private JFrame frame;
    private JButton clear;
    private Canvas canvas;
    private JPanel panel, panel2;
    private CheckboxGroup options;
    private Checkbox Linebox;
    private Checkbox Drawbox;
    private Image backgroundImage;
    private static final String IMAGE_ADDR = "http://www.slate.com/content/dam/slate/blogs/the_slatest/2014/05/09/amazon_white_background_patent_online_sales_giant_files_quesitonable_claim/screen_shot_20140509_at_4.01.21_pm.png.CROP.promo-medium2.01.21_pm.png"; 
    private static final String IMAGE_PANEL = "Image Panel";  
    private static final String IMAGE_PATH = "1.jpg";

    /*
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == clear) {
	    canvas.clear();
	    canvas.paintComponent(canvas.getGraphics());
	}
	else if (e.getSource() == quit) {
	    System.exit(0);
	}
	else if (e.getSource() == doStuff) {
	    String opt = options.getSelectedCheckbox().getLabel();
	    int n;
	    if (opt.equals("Triple"))
		n=3;
	    else if (opt.equals("Double"))
		n = 2;
	    else
		n=1;
	    String s = fnamefield.getText();
	    for (int i=0;i<n;i++)
		System.out.println(i+":"+s);
	    System.out.println();
	}
    }
    */

    public TestGui4_1() {
	
	options = new CheckboxGroup();
	Linebox = new Checkbox("Line",options,true);
	Drawbox = new Checkbox("Freehand",options,true);
	
	frame = new JFrame("Test Gui");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel = new JPanel(new GridBagLayout());
	panel.setPreferredSize(new Dimension(1000,200));
	frame.getContentPane().add(panel, BorderLayout.NORTH);
	
	canvas = new Canvas(options);
	frame.getContentPane().add(canvas, BorderLayout.WEST);
	canvas.setPreferredSize(new Dimension(600,500));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	
	panel2 = new JPanel(new GridBagLayout());
	panel2.setPreferredSize(new Dimension(400,200));
	frame.getContentPane().add(panel2, BorderLayout.EAST);
	panel2.setBorder(BorderFactory.createLineBorder(Color.red, 5));
	
	GridBagConstraints c = new GridBagConstraints();
	c.insets = new Insets(40,40,70,70);
	GridBagConstraints c2 = new GridBagConstraints();
	c2.insets = new Insets(40,40,0,0);
	
	c.gridx = 0;
	c.gridy = 0;
	panel2.add(Linebox, c);
	c.gridy = 1;
	panel2.add(Drawbox, c);

	paintComponent(canvas);
	/*
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
	*/
	
	

	/*
	JFrame f = new JFrame("stackoverflow") { 
		private Image backgroundImage = ImageIO.read(new File("whitebg.png")); 
		    super.paint(g);
		    g.drawImage(backgroundImage, 0, 0, null);
	    }

	*/

    }

    public void paintComponent(Graphics g) {
	Image img = ImageIO.read(new File("screenShot.jpg"));
	g.drawImage(img, 0, 0, null);
    }

    public static void main(String[] args) {
	TestGui4_1 T = new TestGui4_1();
    }
}
