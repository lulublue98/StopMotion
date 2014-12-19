import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiTwo extends JFrame implements ActionListener {

    private Container pane;
    private JButton button, exit;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;
    private JCheckBox box;
    private int x = 10;
    private int y = 10;
    
    private class Canvas extends JPanel {
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.setColor(Color.red);
	    g.fillOval(x,y,30,30);
	}
    }

    private class key implements KeyListener {
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button ) {
	    System.out.println("Click!");
	} else if (e.getSource() == exit ) {
	    System.out.println("Bye");
	    System.exit(0);
	}
    }

    public GuiTwo() {

	setTitle("Second Gui Test");
	setSize(1100,700);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	pane.setLayout(new FlowLayout());

	label = new JLabel("buttons: ");
	pane.add(label);
	button = new JButton("button");
	button.addActionListener(this);
	pane.add(button);
	exit = new JButton("EXIT");
	exit.addActionListener(this);
	box = new JCheckBox("type");
	pane.add(exit);
	pane.add(box);

	text = new JTextArea("text goes here");
	text.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	text.setColumns(80);
	text.setRows(10);
	text.addKeyListener(new key());
	pane.add(text);

	canvas = new Canvas();
	canvas.setPreferredSize(new Dimension(300, 300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(canvas);

    }

    public static void main(String[] args) {
	GuiTwo T = new GuiTwo();
	T.setVisible(true);
    }

}
