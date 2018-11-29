package sample.consts;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Images {

    private static ImageView CROSSROAD = new ImageView(new Image("resources/crossroad.png"));
    private static Image RED_LIGHT = new Image("resources/red_light.png");
    private static Image GREEN_LIGHT = new Image("resources/green_light.png");
    private static Image VEHICLE = new Image("resources/vehicle.png");

    public static ImageView getCrossroad() {
        return CROSSROAD;
    }

    public static Image getRedLight() {
        return RED_LIGHT;
    }

    public static Image getGreenLight() {
        return GREEN_LIGHT;
    }

    public static Image getVehicle() {
        return VEHICLE;
    }

    public static double getBGWifth() {
        return CROSSROAD.getImage().getWidth();
    }

    public static double getBGHeight() {
        return CROSSROAD.getImage().getHeight();
    }
}
