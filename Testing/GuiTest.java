import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame {

    private Container pane;
    private JButton button, exit;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;

    public GuiTest() {
	setTitle("Gui Test Page");
	setSize(1100,700);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	//pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	label = new JLabel("buttons: ");
	pane.add(label);
	button = new JButton("button");
	pane.add(button);
	button2 = new JButton("button2");
	pane.add(button2);
	buttone3 = new JButton("button3");
	pane.add(button3);
	exit = new JButton("EXIT");
	pane.add(exit);
	text = new JTextArea("text goes here");
	text.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	text.setColumns(80);
	text.setRows(10);
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
