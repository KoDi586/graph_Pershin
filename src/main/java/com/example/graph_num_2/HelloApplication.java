package com.example.graph_num_2;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");

//        Hello Controller helloController = fxmlLoader.getController();
//        ServiceTwo.main(new String[0]);
//        helloController.setAm1Points(ServiceTwo.getAm1Points());
//        helloController.setAm2Points(ServiceTwo.getAm2Points());

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}