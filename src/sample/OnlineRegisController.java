package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class OnlineRegisController {
    @FXML
    private Button btn_onlineRegisHome;

    @FXML
    void onClick_onlIneRegisHome(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
