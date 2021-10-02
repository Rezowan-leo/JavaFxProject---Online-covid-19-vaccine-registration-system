package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class frontController {

    @FXML
    private Button btn_frontSignUp;

    @FXML
    private Button front_aboutUs;

    @FXML
    private Button front_connectWithUs;

    @FXML
    private Button front_Donate;

    @FXML
    private Button front_onlineRegis;

    @FXML
    private Button front_gallery;

    @FXML
    private Button front_admin;

    @FXML
    void onClick_Gallery(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("gallery.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_aboutUs(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("aboutUs.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_connect(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("connect.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @FXML
    void onClick_donate(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("donate.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_onlineRegis(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("onlineRegisProcess.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_frontSignUp(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_frontAdmin(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("adminSignIn.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
