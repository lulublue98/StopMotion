import javax.swing.*;
import javax.swing.colorchooser.*;
import javax.swing.event.*;
import java.awt.*;

public class TestGui3 extends JFrame {

    private Container pane; 
    private JButton b1, b2, b3, b4, exit, chooseButton;
    private JLabel label;
    private JPanel p, p2, p3;

    public TestGui3() {
	setTitle("Test Gui Page");
	setSize(1000,700);
	setLocation(25,25);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	pane.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagConstraints gbc2 = new GridBagConstraints();
	gbc.insets = new Insets(20,20,20,20);
	gbc2.insets = new Insets(20,20,10,40);

	gbc.gridx = 0;
	gbc.gridy = 0;

	p = new JPanel();
	p.setPreferredSize(new Dimension(600,500));
	p.setBorder(BorderFactory.createLineBorder(Color.blue,5));
	p2 = new JPanel();
	p3 = new JPanel();

	b1 = new JButton("   Button 1  ");
	b2 = new JButton("   Button 2   ");
	b3 = new JButton("   Button 3   ");

	pane.add(b1,gbc);
	gbc.gridx = 1;
	gbc.gridy = 0;
	pane.add(b2,gbc);
	gbc.gridx = 2;
	gbc.gridy = 0;
	pane.add(b3,gbc);
	/*
	gbc.gridx = 0;
	gbc.gridx = 3;
	pane.add(p, gbc2);
	*/
    }

    public static void main(String[] args) {
	TestGui3 T = new TestGui3();
	T.setVisible(true);
    }
}
