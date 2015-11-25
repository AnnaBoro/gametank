package lesson6.gametank;

import java.awt.*;


public class Brick  extends FieldObject{

//    private int x;
//    private int y;


    public Brick(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(0, 0, 255));
        g.fillRect(x, y, 64, 64);
    }

}
