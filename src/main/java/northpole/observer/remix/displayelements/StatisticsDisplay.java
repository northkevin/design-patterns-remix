package northpole.observer.remix.displayelements;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StatisticsDisplay extends Application {

    @Override public void init() {}

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("fxml-demo.fxml"));
        Scene scene = new Scene(pane);

        primaryStage.setTitle("FXML Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override public void stop() {
        System.exit(0);
    }
}
