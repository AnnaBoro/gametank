package lesson6.gametank;

import lesson6.menu.*;

import java.awt.*;
import java.util.Objects;

public class BattleField{

    private int BF_WIDTH = 576;
    private int BF_HEIGHT = 576;

    private Brick b;
    private Water w;
    private Eagle e;
    private Rock r;

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

    public  int getDimensionY() {

        return battleField[0].length;
    }

    public void draw (Graphics g) {

        for (int j = 0; j < this.getDimensionY(); j++) {
            for (int k = 0; k < this.getDimensionY(); k++) {
                String coordinates = getQuadrantXY(j + 1, k + 1);
                int separator = coordinates.indexOf("_");
                int y = Integer.parseInt(coordinates.substring(0, separator));
                int x = Integer.parseInt(coordinates.substring(separator + 1));

                if (this.scanQuadrant(j, k) != null) {


                        battleField[j][k] = new FieldObject(x * 64, y * 64);
                        battleField[j][k].draw(g);
                }
            }
        }
    }

    public String getQuadrantXY(int v, int h) {

        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }
}
