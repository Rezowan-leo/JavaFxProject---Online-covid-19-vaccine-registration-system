package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class forgotPassController {

    @FXML
    private Button passForg_confirm;

    @FXML
    private TextField passForg_tf;

    @FXML
    private Button btn_forgPassHome;

    @FXML
    private Text passForg_Text;


    @FXML
    void onClick_forgPassHome(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_passForgConfirm(ActionEvent event) {

        passForg_Text.setText("Password recovery link sent to "+passForg_tf.getText());

    }

}
