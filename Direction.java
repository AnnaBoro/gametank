package lesson6.gametank;

/**
 * Created by anna on 23.11.15.
 */
public enum Direction {

    UP(1), DOWN(2), LEFT(3), RIGHT(4);

    private int id;

    private Direction(int id) {

        this.id = id;
    }

    public int getId() {
        return id;
    }
}
