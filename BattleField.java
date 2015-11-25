package lesson6.gametank;

import java.awt.*;

public class BattleField{

    private int BF_WIDTH = 576;
    private int BF_HEIGHT = 576;

    private FieldObject[][] battleField = {
            {new Brick(0, 0), new Water(0, 1), new Water(0, 2), new Brick(0, 3), new Water(0, 4), new Brick(0, 5),
                    new Brick(0, 6), new Brick(0, 7), new Brick(0, 8)},
            {new Eagle(1, 0), null, null, null, null, null, null, null, new Brick(0, 8)},
            {new Brick(2, 0), new Brick(2, 1), null, null, new Rock(2, 4), null, null, new Brick(2, 7), new Brick(2, 8)},
            {new Brick(3, 0), null, new Brick(3, 2), null, null, null, new Brick(3, 6), null, new Brick(3, 8)},
            {new Brick(4, 0), null, new Water(4, 2), null, null, null, null, null, new Brick(4, 8)},
            {null, null, null, new Brick(5, 3), null, new Water(5, 5), null, new Brick(5, 7), new Brick(5, 8)},
            {null, new Brick(6, 1), null, null, null, null, null, new Brick(6, 7), new Brick(6, 8)},
            {null, null, null, null, null, new Brick(7, 5), null, null, new Brick(7, 8)},
            {new Brick(8, 0), null, null, new Brick(8, 3), null, null, null, null, new Water(8, 8)}};


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

                        battleField[j][k].draw(g);
                }
            }
        }
    }

    public String getQuadrantXY(int v, int h) {

        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }
}
