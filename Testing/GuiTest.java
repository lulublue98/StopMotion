import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame {

    private Container pane;
    private JButton button, exit;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;
    private JButton b1, b2, b3;

    public GuiTest() {
	setTitle("Gui Test Page");
	setSize(1100,700);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	//pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	
	label = new JLabel("buttons: ");
	b1 = new JButton("button");
	b2 = new JButton("button2");
	b3 = new JButton("button3");
	exit = new JButton("EXIT");
	text = new JTextArea("text goes here");
	text.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	text.setColumns(80);
	text.setRows(10);
	
	pane.add(label);
	pane.add(b1);
	pane.add(b2);
	pane.add(b3);
	pane.add(exit);
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300, 300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.green,2));
	pane.add(canvas);

	/*
	  This is for adding more stuff like buttons and smaller sections

	JPanel P = new JPanel();
	pane.add(P);
	P.setLayout(new GridLayout(3,3));
	*/

    }

    public static void main(String[] args) {
	GuiTest T = new GuiTest();
	T.setVisible(true);
    }

}
