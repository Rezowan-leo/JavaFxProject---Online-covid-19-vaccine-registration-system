package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public ArrayList<String[]> alMain = new ArrayList<String[]>();

    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception{

        primaryStage = stage;

        Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root));
        stage.setTitle("Online Covid-19 Vaccine Registration System");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}