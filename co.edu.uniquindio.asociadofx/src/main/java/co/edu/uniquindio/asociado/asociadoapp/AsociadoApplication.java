package co.edu.uniquindio.asociado.asociadoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AsociadoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AsociadoApplication.class.getResource("Asociado.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Asociado aplication");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}