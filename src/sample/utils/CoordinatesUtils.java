package sample.utils;

import sample.domain.Lane;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static sample.consts.LightCoordinates.getxList;
import static sample.consts.LightCoordinates.getyList;
import static sample.enums.DirectionEnum.*;

public class CoordinatesUtils {

    public static double getVehicleCoordinateX(Lane lane, int indexInQueue) {
        int directionK;
        if (LEFT == lane.getDirection())
            directionK = 1;
        else if (RIGHT == lane.getDirection())
            directionK = -1;
        else directionK = 0;

        return xCoordinates.get(indexInQueue) + directionK * indexInQueue * getGap();
    }

    public static double getVehicleCoordinateY(Lane lane, int indexInQueue) {
        int directionK;
        if (UP == lane.getDirection())
            directionK = 1;
        else if (DOWN == lane.getDirection())
            directionK = -1;
        else directionK = 0;

        return yCoordinates.get(indexInQueue) + directionK * indexInQueue * getGap();
    }

    public static double getLightCoordinateX(Long laneId) {
        return getxList().get(laneId.intValue());
    }

    public static double getLightCoordinateY(Long laneId) {
        return getyList().get(laneId.intValue());
    }
}
