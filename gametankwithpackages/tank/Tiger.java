package lesson6.gametank.gametankwithpackages.tank;

import lesson6.gametank.actionfield.ActionField;
import lesson6.gametank.battlefield.BattleField;

import java.awt.*;


public class Tiger extends AbstractTank {

    private int armor;

    public Tiger(ActionField actionField, BattleField battleField, int armor) {
        super(actionField, battleField);
        this.armor = armor;
        tankColor = new Color(255, 0, 0);
        towerColor = new Color(0, 255, 0);
    }

    public Tiger(ActionField actionField, BattleField battleField, int x, int y, Direction direction) {
        super(actionField, battleField, x, y, direction);
        armor = 1;
        tankColor = new Color(255, 0, 0);
        towerColor = new Color(0, 255, 0);
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }
}
