import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.StringJoiner;

public class DrawGraphics {
    //    ArrayList<Bouncer> BounceSprites = new ArrayList<Bouncer>();
//    ArrayList<StraightMover> StraightSprites = new ArrayList<StraightMover>();
    ArrayList<Mover> Sprites = new ArrayList<Mover>();

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        Rectangle boxRed = new Rectangle(50, 50, new Color(242, 80, 34));
        Rectangle boxBlue = new Rectangle(50, 50, new Color(0, 164, 239));
        Rectangle boxGreen = new Rectangle(50, 50, new Color(127, 186, 0));
        Rectangle boxYellow = new Rectangle(50, 50, new Color(255, 185, 0));
        Text text = new Text("Microsoft", new Color(116, 116, 116), 143, 26);
        final int offset = 1;
        final int correction = 100;
//        BounceSprites.add(new Bouncer(100-offset, 100-offset, boxRed));
//        BounceSprites.add(new Bouncer(150+offset, 100-offset, boxGreen));
//        BounceSprites.add(new Bouncer(100-offset, 150+offset, boxBlue));
//        BounceSprites.add(new Bouncer(150+offset, 150+offset, boxYellow));
//        BounceSprites.add(new Bouncer(78,250,text));
//        for(Bouncer b: BounceSprites)
//        {
//            b.setMovementVector((int)(Math.random()*30),(int)(Math.random()*30));
//        }
//        StraightSprites.add(new StraightMover(100-offset,100-offset,boxRed));
//        StraightSprites.add(new StraightMover(150+offset, 100-offset, boxGreen));
//        StraightSprites.add(new StraightMover(100-offset, 150+offset, boxBlue));
//        StraightSprites.add(new StraightMover(150+offset, 150+offset, boxYellow));
//        StraightSprites.add(new StraightMover(78,250,text));
//        for(StraightMover s:StraightSprites)
//        {
//            s.setMovementVector((int)(Math.random()*30),(int)(Math.random()*30));
//        }

        Sprites.add(new Bouncer(100 - offset + correction, 100 - offset + correction, boxRed));
        Sprites.add(new Bouncer(150 + offset + correction, 100 - offset + correction, boxGreen));
        Sprites.add(new Bouncer(100 - offset + correction, 150 + offset + correction, boxBlue));
        Sprites.add(new Bouncer(150 + offset + correction, 150 + offset + correction, boxYellow));
        Sprites.add(new Bouncer(78 + correction, 250 + correction, text));
//        for(Mover m:Sprites)
//        {
//            m.setMovementVector((int)(Math.random()*30),(int)(Math.random()*30));
//        }
    }

    /**
     * Draw the contents of the window on surface.
     */
    public void draw(Graphics surface) {
//        for(Bouncer b: BounceSprites)
//        {
//            b.draw(surface);
//        }
//        for(StraightMover s : StraightSprites)
//        {
//            s.draw(surface);
//        }
        for (Mover m : Sprites) {
            m.draw(surface);
        }
    }
}
