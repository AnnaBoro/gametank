package lesson6.gametank;


import java.awt.*;

public class Water extends FieldObject {

    public Water(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(0, 0, 139));
        g.fillRect(x, y, 64, 64);
    }
}
