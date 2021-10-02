package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;

public class donateController {
    @FXML
    private Button btn_donateHome;

    @FXML
    private Text donation_Thank;


    @FXML
    private Button btn_donationConfirm;


    @FXML
    void onClick_donationConfirm(ActionEvent event) {

        donation_Thank.setText("Thank you for your donation!");

    }


    @FXML
    void onClick_donateHome(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
