package sample.consts;

import java.util.Arrays;
import java.util.List;

import static sample.consts.Images.getVehicle;

public class LaneCoordinates {
    private static final List<Double> X_COORDINATES = Arrays.asList(17.0, 1., 2., 3., 4., 5., 6., 7., 8., 9., 10., 11.);
    private static final List<Double> Y_COORDINATES = Arrays.asList(112.0, 112., 112., 3., 4., 5., 6., 7., 8., 9., 10., 11.);
    private static final double INTERVAL = getVehicle().getImage().getHeight() + 5;
    private static final double BEFORE_LIGHT_INTERVAL = getVehicle().getImage().getHeight() / 2 + 5;

    public static double getInterval() {
        return INTERVAL;
    }

    public static double getX(Long laneId) {
        return X_COORDINATES.get(laneId.intValue());
    }

    public static double getY(Long laneId) {
        return Y_COORDINATES.get(laneId.intValue());
    }

    public static double getBeforeLightInterval() {
        return BEFORE_LIGHT_INTERVAL;
    }
}
