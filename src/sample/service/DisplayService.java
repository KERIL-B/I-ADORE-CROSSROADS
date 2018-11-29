package sample.service;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sample.domain.Lane;

import static sample.consts.Images.*;
import static sample.utils.DirectionUtils.getDirection;

import java.util.List;

public class DisplayService {
    private Pane crossroad;

    public DisplayService(Pane crossroad) {
        this.crossroad = crossroad;
        crossroad.getChildren().add(getCrossroad());
    }

    public void display(List<Lane> lanes) {
        lanes.forEach(lane -> {

        });
    }

    public void displayLight(Long laneId, boolean green) {
        ImageView img = green ? getGreenLight() : getRedLight();
        double rotationAngel = Math.PI * getDirection(laneId).getId();
        img.setRotate(rotationAngel);

    }
}
