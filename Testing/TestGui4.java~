import javax.swing.*;
import java.awt.*;

public class TestGui4 {

    public static void main(String[] args) {
	JFrame frame = new JFrame("Test Gui");
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel(new GridBagLayout());
	frame.getContentPane().add(panel, BorderLayout.NORTH);
	GridBagConstraints c = new GridBagConstraints();
	

	JButton b1 = new JButton("Button 1");
	JButton b2 = new JButton("Button 2");
	JButton b3 = new JButton("Button 3");

	c.gridx = 0;
	c.gridy = 0;
	panel.add(b1, c);
	c.gridx = 1;
	c.gridy = 1;
	panel.add(b2, c);
	c.gridx = 2;
	c.gridy = 2;
	panel.add(b3, c);
    }
}
