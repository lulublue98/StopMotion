import javax.swing.*;
import java.awt.*;

public class TestGui2 extends JFrame {

    private Container pane; 
    private JButton b1, b2, b3, b4, exit;
    private JLabel label;
    private JPanel canvas;

    public TestGui2() {
	setTitle("Test Gui Page");
	setSize(1000,700);
	setLocation(25,25);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

	b1 = new JButton("button 1");
	b2 = new JButton("button 2");
	b3 = new JButton("button 3");
	exit = new JButton("exit");
	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(600,500));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,5));

	c.weightx = 0.5;
	c.weighty = 0;
	//	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 0;
	pane.add(b1, c);

	//	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 1;
	c.gridy = 0;
	pane.add(b2, c);

	c.gridx = 2;
	c.gridy = 0;
	pane.add(b3, c);

	c.gridx = 3;
	c.gridy = 0;
	pane.add(exit, c);

	c.gridx = 0;
	c.gridy = -3;
	pane.add(canvas, c);
    }

    public static void main(String[] args) {
	TestGui2 T = new TestGui2();
	T.setVisible(true);
    }
}
	
	
