import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Paint extends JPanel{
    private BufferedImage paintImage = new BufferedImage(500, 400, BufferedImage.TYPE_3BYTE_BGR);

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(paintImage, 0, 0, null);
    }

    // draw painting
    public void updatePaint(){
        Graphics g = paintImage.createGraphics();

        // draw on paintImage using Graphics

        g.dispose();
        // repaint panel with new modified paint
        repaint();
    }

    public void save() throws IOException{
        ImageIO.write(paintImage, "PNG", new File("filename.png"));
    }

    public void load() throws IOException {
        paintImage = ImageIO.read(new File("filename.png"));
        // update panel with new paint image
        repaint();
    }
}
