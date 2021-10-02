package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class homeAdminController {
    @FXML
    private Button btn_homeAdminUpdate;

    @FXML
    private Button btn_homAdminSignOut;

    @FXML
    void onClick_homeAdminSignOut(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_homeAdminUpdate(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("adminLoginPage.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
