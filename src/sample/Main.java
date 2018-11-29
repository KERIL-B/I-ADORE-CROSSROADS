package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sample.domain.Lane;
import sample.enums.DirectionEnum;
import sample.service.DisplayService;

import java.util.Collection;
import java.util.Collections;
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

    private static List<Lane> getTestData() {
        return Collections.singletonList(new Lane(0L, DirectionEnum.UP, 1, true));
    }
}
