package lesson6.gametank;

import lesson6.menu.*;

import java.awt.*;
import java.util.Objects;

public class BattleField implements Drawable{

    private boolean COLORDED_MODE = false;

    private int BF_WIDTH = 576;
    private int BF_HEIGHT = 576;

    private Brick b = new Brick();
    private Water w = new Water();
    private Eagle e = new Eagle();
    private Rock r = new Rock();

//    private String[][] battleField = {
//            {"B", " ", "B", "B", "B", "B", "B", "B", "B"},
//            {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
//            {"B", "B", " ", " ", "B", " ", " ", "B", "B"},
//            {"B", " ", "B", " ", " ", " ", "B", " ", "B"},
//            {"B", " ", "B", " ", " ", " ", " ", " ", "B"},
//            {" ", " ", " ", "B", " ", "B", " ", "B", "B"},
//            {" ", "B", " ", " ", " ", " ", " ", "B", "B"},
//            {" ", " ", " ", "B", "B", "B", " ", " ", "B"},
//            {"B", " ", " ", "B", " ", " ", " ", " ", "B"}};

    private FieldObject[][] battleField = {
            {b, w, w, b, w, b, b, b, b},
            {e, null, null, null, null, null, null, null, b},
            {b, b, null, null, r, null, null, b, b},
            {b, null, b, null, null, null, b, null, b},
            {b, null, w, null, null, null, null, null, b},
            {null, null, null, b, null, w, null, b, b},
            {null, b, null, null, null, null, null, b, b},
            {null, null, null, null, null, b, null, null, b},
            {b, null, null, b, null, null, null, null, w}};


    public BattleField() {

    }

    public FieldObject[][] getBattleField() {
        return battleField;
    }

    public int getBF_WIDTH() {
        return BF_WIDTH;
    }

    public int getBF_HEIGHT() {
        return BF_HEIGHT;
    }

    public FieldObject scanQuadrant(int v, int h) {

        return battleField[v][h];
    }

    public void updateQuadrant(int v, int h, FieldObject f) {

        battleField[v][h] = f;
    }

//    public int getDimensionX() {
//
//        return (battleField[0][0]).length();
//    }

    public  int getDimensionY() {

        return battleField[0].length;
    }

    public void fillBattleField() {


    }

    @Override
    public void draw(Graphics g) {

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++) {
            for (int h = 0; h < 9; h++) {
                if (COLORDED_MODE) {
                    if (i % 2 == 0) {
                        cc = new Color(252, 241, 177);
                    } else {
                        cc = new Color(233, 243, 255);
                    }
                } else {
                    cc = new Color(180, 180, 180);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }

        for (int j = 0; j < this.getDimensionY(); j++) {
            for (int k = 0; k < this.getDimensionY(); k++) {
                String coordinates = getQuadrantXY(j + 1, k + 1);
                int separator = coordinates.indexOf("_");
                int y = Integer.parseInt(coordinates.substring(0, separator));
                int x = Integer.parseInt(coordinates.substring(separator + 1));
                if (this.scanQuadrant(j, k) instanceof Brick) {

                    g.setColor(new Color(0, 0, 255));
                    g.fillRect(x, y, 64, 64);
                }
                else if  (this.scanQuadrant(j, k) instanceof Rock) {

                    g.setColor(new Color(255, 255, 0));
                    g.fillRect(x, y, 64, 64);
                }
                else if (this.scanQuadrant(j, k) instanceof Water) {

                    g.setColor(new Color(0, 0, 139));
                    g.fillRect(x, y, 64, 64);
                }
                else if (this.scanQuadrant(j, k) instanceof Eagle) {

                    g.setColor(new Color(150, 0, 140));
                    g.fillRect(x, y, 64, 64);
                }
            }
        }
    }

    public String getQuadrantXY(int v, int h) {

        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }
}
