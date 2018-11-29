package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sample.domain.Lane;
import sample.enums.DirectionEnum;
import sample.service.DisplayService;

import java.util.ArrayList;
import java.util.List;

import static sample.consts.Images.getBGHeight;
import static sample.consts.Images.getBGWifth;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new StackPane();
        DisplayService service = new DisplayService(pane);
        service.display(getTestData());
        Scene scene = new Scene(pane, getBGWifth(), getBGHeight());
        primaryStage.setTitle("MY LOVELY CROSSROAD");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    //OGANES POIGRAYSYA I UDALI ETO!
    private static List<Lane> getTestData() {
        List<Lane> lanes = new ArrayList<>();
        lanes.add(new Lane(0L, DirectionEnum.UP, 5, true));
        lanes.add(new Lane(1L, DirectionEnum.UP, 5, false));
        lanes.add(new Lane(2L, DirectionEnum.UP, 5, false));
        lanes.add(new Lane(3L, DirectionEnum.LEFT, 5, true));
        lanes.add(new Lane(4L, DirectionEnum.LEFT, 5, false));
        lanes.add(new Lane(5L, DirectionEnum.LEFT, 5, true));
        lanes.add(new Lane(6L, DirectionEnum.DOWN, 5, false));
        lanes.add(new Lane(7L, DirectionEnum.DOWN, 5, true));
        lanes.add(new Lane(8L, DirectionEnum.DOWN, 5, true));
        lanes.add(new Lane(9L, DirectionEnum.RIGHT, 5, false));
        lanes.add(new Lane(10L, DirectionEnum.RIGHT, 5, false));
        lanes.add(new Lane(11L, DirectionEnum.RIGHT, 5, false));
        return lanes;
    }
}
