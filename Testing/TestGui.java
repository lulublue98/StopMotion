import javax.swing.*;
import java.awt.*;

public class TestGui extends JFrame {

    private Container pane; 
    private JButton b1, b2, b3, b4, b5, exit;
    private JLabel label;
    private JPanel canvas;

    public TestGui() {
	setTitle("Test Gui Page");
	setSize(1000,700);
	setLocation(25,25);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	pane.setLayout(new FlowLayout(FlowLayout.LEFT,30,50));

	b1 = new JButton("                   button 1                    ");
	b2 = new JButton("                   button 2                    ");
	b3 = new JButton("                   button 3                    ");
	b4 = new JButton("                   button 4                    ");
	b5 = new JButton("                   button 5                    ");
	exit = new JButton("                     EXIT                         ");
	pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

	pane.add(b1);
	pane.add(b2);
	pane.add(b3);
	pane.add(b4);
	pane.add(exit);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(600,500));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,5));
	pane.add(canvas);

	
    }

    public static void main(String[] args) {
	TestGui T = new TestGui();
	T.setVisible(true);
    }
}
   
