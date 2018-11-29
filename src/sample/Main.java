package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sample.domain.Lane;

import java.util.List;
import java.util.Random;

public class Main extends Application {

    private static Pane pane;
    private static Random rnd;

    @Override
    public void start(Stage primaryStage) throws Exception {
        pane = new StackPane();
        rnd = new Random();

        spawnLogos();

        Scene scene = new Scene(pane, 1000, 1000);
        //    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void refresh(List<Lane> lanes) {
        lanes.forEach(lane -> {

        });
    }

    private static void spawnLogos() {
        pane.getChildren().addAll(getSkull(0, 0),
                getLogo(0, 0),
                getSkull(150, 150),
                getLogo(75, 75),
                getSkull(-200, -200)
        );
    }

    private static ImageView getLogo(double x, double y) {
        return getImg(x, y, "img.png");
    }

    private static ImageView getSkull(double x, double y) {
        return getImg(x, y, "img.jpg");
    }

    private static ImageView getImg(double x, double y, String imgName) {
        ImageView logo = new ImageView(new Image("resources/" + imgName));
        logo.setTranslateX(x);
        logo.setTranslateY(y);
        return logo;
    }

    private static Rectangle getRect(double x, double y) {
        Rectangle rectangle = new Rectangle(x, y);
        return rectangle;
    }

}
