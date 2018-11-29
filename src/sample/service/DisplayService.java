package sample.service;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sample.domain.Lane;
import sample.enums.DirectionEnum;

import java.util.ArrayList;
import java.util.List;

import static sample.consts.Images.*;
import static sample.utils.CoordinatesUtils.*;

public class DisplayService {
    private Pane crossroad;

    public DisplayService(Pane crossroad) {
        this.crossroad = crossroad;
        crossroad.getChildren().add(getCrossroad());
    }

    public void display(List<Lane> lanes) {
        lanes.forEach(lane -> {
            displayVehicles(lane);
            displayLight(lane);
        });
    }

    private void displayVehicles(Lane lane) {
        List<ImageView> vehicles = new ArrayList<>();
        for (int i = 0; i < lane.getVehiclesCount(); i++) {
            ImageView vehicle = getVehicle();
            vehicle.setRotate(getRotationAngle(lane.getDirection()));
            vehicle.setTranslateX(getVehicleCoordinateX(lane, i));
            vehicle.setTranslateX(getVehicleCoordinateY(lane, i));
            vehicles.add(vehicle);
        }
        crossroad.getChildren().addAll(vehicles);
    }

    private void displayLight(Lane lane) {
        ImageView img = lane.isGreen() ? getGreenLight() : getRedLight();
        img.setRotate(getRotationAngle(lane.getDirection()));
        img.setTranslateX(getLightCoordinateX(lane.getId()));
        img.setTranslateY(getLightCoordinateY(lane.getId()));
        crossroad.getChildren().add(img);
    }

    private double getRotationAngle(DirectionEnum direction) {
        return Math.PI * direction.getId();
    }
}
