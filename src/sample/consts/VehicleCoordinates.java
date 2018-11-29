package sample.consts;

import java.util.Arrays;
import java.util.List;

public class VehicleCoordinates {
    private static final List<Double> xCoordinates = Arrays.asList(.0, 1., 2., 3., 4., 5., 6., 7., 8., 9., 10., 11.);
    private static final List<Double> yCoordinates = Arrays.asList(.0, 1., 2., 3., 4., 5., 6., 7., 8., 9., 10., 11.);
    private static final double gap = 50.;

    public static double getGap() {
        return gap;
    }

    public static double getX(Long laneId) {
        return xCoordinates.get(laneId.intValue());
    }

    public static double getY(Long laneId) {
        return yCoordinates.get(laneId.intValue());
    }
}
