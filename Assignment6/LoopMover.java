import java.awt.*;

public class LoopMover implements Mover {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;

    /**
     * Create a Bouncer that positions sprite at (startX, startY).
     */
    public LoopMover(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    @Override
    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    @Override
    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the sprite
        sprite.draw(surface, x, y);

        // Move the object each time we draw it
        x += xDirection;
        y += yDirection;

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
        if ((x <= 0 && xDirection < 0) ||
                (x + sprite.getWidth()/2 >= SimpleDraw.WIDTH && xDirection > 0)) {
//            xDirection = -xDirection;
            int midWidth = SimpleDraw.WIDTH / 2;
            x = 2 * midWidth - x;
        }
        if ((y <= 0 && yDirection < 0) ||
                (y + sprite.getHeight()/2 >= SimpleDraw.HEIGHT && yDirection > 0)) {
//            yDirection = -yDirection;
            int midHeight = SimpleDraw.HEIGHT / 2;
            y = 2 * midHeight - y;
        }
    }
}
