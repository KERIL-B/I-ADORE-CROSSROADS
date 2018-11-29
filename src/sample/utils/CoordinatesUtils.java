package sample.utils;

import sample.domain.Lane;

import static sample.consts.LaneCoordinates.*;
import static sample.enums.DirectionEnum.*;

public class CoordinatesUtils {

    public static double getVehicleCoordinateX(Lane lane, int indexInQueue) {
        int directionK;
        if (LEFT == lane.getDirection())
            directionK = 1;
        else if (RIGHT == lane.getDirection())
            directionK = -1;
        else directionK = 0;

        return getX(lane.getId()) + directionK * indexInQueue * getInterval();
    }

    public static double getVehicleCoordinateY(Lane lane, int indexInQueue) {
        int directionK;
        if (UP == lane.getDirection())
            directionK = 1;
        else if (DOWN == lane.getDirection())
            directionK = -1;
        else directionK = 0;

        return getY(lane.getId()) + directionK * (indexInQueue * getInterval() + getBeforeLightInterval());
    }

    public static double getLightCoordinateX(Long laneId) {
        return getX(laneId);
    }

    public static double getLightCoordinateY(Long laneId) {
        return getY(laneId);
    }
}
