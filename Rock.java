package lesson6.gametank;

import java.awt.*;


public class Rock extends FieldObject implements Destroyable {

    public Rock(int x, int y) {
        super(x, y);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(255, 255, 0));
        g.fillRect(x, y, 64, 64);
    }
}
