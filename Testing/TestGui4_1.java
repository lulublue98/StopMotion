import javax.swing.*;
import java.awt.*;

public class TestGui4_1 {

    public TestGui4_1() {

	CheckboxGroup options = new CheckboxGroup();
	JButton b1 = new JButton("         Button 1         ");
	JButton b2 = new JButton("         Button 2         ");
	JButton b3 = new JButton("         Button 3         ");
	JButton b4 = new JButton("         Add Pic          ");
	JButton b5 = new JButton("Button 5");
	JButton b6 = new JButton("Button 6");
	JButton b7 = new JButton("Button 7");
        Checkbox lines = new Checkbox("Lines",options,false);

	JFrame frame = new JFrame("Test Gui");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel(new GridBagLayout());
	frame.getContentPane().add(panel, BorderLayout.NORTH);
	
	TestCanvas panel2 = new TestCanvas(options);
	frame.getContentPane().add(panel2, BorderLayout.WEST);
	panel2.setPreferredSize(new Dimension(600,500));
	panel2.setBorder(BorderFactory.createLineBorder(Color.blue, 5));

	JPanel panel3 = new JPanel(new GridBagLayout());
	frame.getContentPane().add(panel3, BorderLayout.EAST);
	panel3.setBorder(BorderFactory.createLineBorder(Color.red, 5));
	    
	GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(40,40,70,70);
	GridBagConstraints c2 = new GridBagConstraints();
	c2.insets = new Insets(40,40,0,0);

	c.gridx = 0;
	c.gridy = 0;
	panel.add(b1, c);
	c.gridx = 1;
	c.gridy = 0;
	panel.add(b2, c);
	c.gridx = 2;
	c.gridy = 0;
	panel.add(b3, c);
	c.gridx = 3;
	c.gridy = 0;
	panel.add(b4, c);

	c.gridx = 0;
	c.gridy = 0;
	panel3.add(b5, c2);
	c.gridx = 0;
	c.gridy = 3;
	panel3.add(b6, c2);
	c.gridx = 0;
	c.gridx = 5;
	panel3.add(b7, c2);
				 
    }

    public static void main(String[] args) {
	TestGui4_1 T = new TestGui4_1();
    }
}
