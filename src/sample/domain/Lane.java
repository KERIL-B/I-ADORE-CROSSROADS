package sample.domain;

import sample.enums.DirectionEnum;

public class Lane {
    private Long id;
    private DirectionEnum direction;
    private int vehiclesCount;
    private boolean green;

    public Long getId() {
        return id;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public int getVehiclesCount() {
        return vehiclesCount;
    }

    public boolean isGreen() {
        return green;
    }

    public Lane(Long id, DirectionEnum direction, int vehiclesCount, boolean green) {
        this.id = id;
        this.direction = direction;
        this.vehiclesCount = vehiclesCount;
        this.green = green;
    }
}
