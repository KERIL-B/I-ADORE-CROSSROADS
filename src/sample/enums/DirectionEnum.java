package sample.enums;

public enum DirectionEnum {
    UP(0),
    DOWN(1),
    RIGHT(2),
    LEFT(3);

    private int id;

    DirectionEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
