package lesson6.gametank;

import java.awt.*;


public class Eagle extends FieldObject implements Destroyable{

    public Eagle(int x, int y) {
        super(x, y);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(150, 0, 140));
        g.fillRect(x, y, 64, 64);
    }
}
