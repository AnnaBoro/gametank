package lesson6.gametank;

import java.awt.*;

public class T34 extends AbstractTank {

    public T34(ActionField actionField, BattleField battleField) {

        super(actionField, battleField);
        tankColor = new Color(0, 255, 0);
        towerColor = new Color(255, 0, 0);
    }

    public T34(ActionField actionField, BattleField battleField, int x, int y, Direction direction) {
        super(actionField, battleField, x, y, direction);
        tankColor = new Color(0, 255, 0);
        towerColor = new Color(255, 0, 0);
    }
}
