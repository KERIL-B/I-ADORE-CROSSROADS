package sample.enums;

public enum DirectionEnum {
    UP(0),
    LEFT(1),
    DOWN(2),
    RIGHT(3);

    private int id;

    DirectionEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
