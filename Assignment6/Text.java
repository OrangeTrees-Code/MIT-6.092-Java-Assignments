import java.awt.*;

public class Text implements Sprite{
    private String text;
    private Color color;
    private int width;
    private int height;


    public Text(String text,Color color,int width,int height)
    {
        this.text= text;
        this.color=color;
        this.width=width;
        this.height=height;
    }
    @Override
    public void draw(Graphics surface, int leftX, int topY) {
        surface.setColor(color);
        Font defaultFont = surface.getFont();
        surface.setFont(new Font(defaultFont.getName(), Font.PLAIN,36));
        surface.drawString(text,leftX,topY);
        surface.setFont(defaultFont);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight()
    {
        return height;
    }
}
