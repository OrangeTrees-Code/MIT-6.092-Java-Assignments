import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
//    BouncingBox box;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        boxes.add(new BouncingBox(220, 70, new Color(243,177,51)));
        boxes.add(new BouncingBox(220, 50, new Color(139,173,55)));
        boxes.add(new BouncingBox(200, 50, new Color(226,83,57)));
        boxes.add(new BouncingBox(200, 70, new Color(52,152,219)));
        for(BouncingBox box:boxes)
        {
            box.setMovementVector((int)(Math.random()*30),(int)(Math.random()*30));
        }
    }

    /**
     * Draw the contents of the window on surface. Called 20 times per second.
     */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        for(BouncingBox b:boxes)
        {
            b.draw(surface);
        }
        surface.drawPolygon(new int[]{50, 100, 100}, new int[]{50, 100, 50}, 3);
        surface.drawOval(125, 125, 100, 50);
        surface.drawArc(100,100,50,50,0,270);
    }
} 