package sample.consts;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Images {

    private static ImageView crossroad = new ImageView(new Image("crossroad.png"));
    private static ImageView redLight = new ImageView(new Image("red_light.png"));
    private static ImageView greenLight = new ImageView(new Image("green_light.png"));
    private static ImageView vehicle = new ImageView(new Image("vehicle.png"));

    public static ImageView getCrossroad() {
        return crossroad;
    }

    public static ImageView getRedLight() {
        return redLight;
    }

    public static ImageView getGreenLight() {
        return greenLight;
    }

    public static ImageView getVehicle() {
        return vehicle;
    }
}
