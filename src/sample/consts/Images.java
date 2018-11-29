package sample.consts;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Images {

    private static ImageView CROSSROAD = new ImageView(new Image("resources/crossroad.png"));
    private static ImageView RED_LIGHT = new ImageView(new Image("resources/red_light.png"));
    private static ImageView GREEN_LIGHT = new ImageView(new Image("resources/green_light.png"));
    private static ImageView VEHICLE = new ImageView(new Image("resources/vehicle.png"));

    public static ImageView getCrossroad() {
        return CROSSROAD;
    }

    public static ImageView getRedLight() {
        return RED_LIGHT;
    }

    public static ImageView getGreenLight() {
        return GREEN_LIGHT;
    }

    public static ImageView getVehicle() {
        return VEHICLE;
    }

    public static double getBGWifth() {
        return CROSSROAD.getImage().getWidth();
    }

    public static double getBGHeight() {
        return CROSSROAD.getImage().getHeight();
    }
}
