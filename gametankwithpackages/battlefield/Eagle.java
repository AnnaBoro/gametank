package lesson6.gametank.gametankwithpackages.battlefield;

import lesson6.gametank.gametankwithpackages.behavior.Destroyable;

import java.awt.*;


public class Eagle extends FieldObject implements Destroyable{

    public Eagle(int y, int x) {
        super(y, x);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(150, 0, 140));
        g.fillRect(x * 64, y * 64, 64, 64);
    }
}