package sample.utils;

import sample.enums.DirectionEnum;

import static sample.enums.DirectionEnum.*;

public class DirectionUtils {

    private static final int NUMBER_OF_LANES_IN_ROAD = 3;

    public static DirectionEnum getDirection(Long laneId) {
        if (laneId < NUMBER_OF_LANES_IN_ROAD)
            return UP;
        else if (laneId < 2 * NUMBER_OF_LANES_IN_ROAD)
            return LEFT;
        else if (laneId < 3 * NUMBER_OF_LANES_IN_ROAD)
            return DOWN;
        else return RIGHT;
    }
}
