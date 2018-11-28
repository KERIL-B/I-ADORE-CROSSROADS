package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import sample.domain.Lane;

import java.util.List;

public class Main extends Application {

    private FlowPane fp;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.fp = new FlowPane();

        Image img = new Image("resources/img.jpg");
        ImageView imgView = new ImageView(img);
        fp.getChildren().addAll(imgView);

        Button btn = new Button("pow");
        btn.setOnAction(actionEvent -> {
            Image img2 = new Image("resources/img.png");
            ImageView imgView2 = new ImageView(img2);
            fp.getChildren().addAll(imgView2);
        });
        fp.getChildren().add(btn);

        Scene scene = new Scene(fp, 1000, 1000);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
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
}
