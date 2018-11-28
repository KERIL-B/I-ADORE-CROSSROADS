package sample.utils;


import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class CoordinatesUtils {

    private static final List<Integer> xCoordinates = Arrays.asList(0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11);
    private static final List<Integer> yCoordinates = Arrays.asList(0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11);

    public static Point getCoordinatesOfLane(Long id) {
        return new Point(xCoordinates.get(id.intValue()), yCoordinates.get(id.intValue()));
    }

    public static Point getVehicleCoordinate(Long laneId, Long indexInQueue) {
        return
    }

}
