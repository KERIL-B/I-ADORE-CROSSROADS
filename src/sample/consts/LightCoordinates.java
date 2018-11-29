package sample.consts;

import java.util.Arrays;
import java.util.List;

public class LightCoordinates {
    private static final List<Double> xList = Arrays.asList(.0, 1., 2., 3., 4., 5., 6., 7., 8., 9., 10., 11.);
    private static final List<Double> yList = Arrays.asList(.0, 1., 2., 3., 4., 5., 6., 7., 8., 9., 10., 11.);

    public static List<Double> getxList() {
        return xList;
    }

    public static List<Double> getyList() {
        return yList;
    }
}
