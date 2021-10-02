package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class adminLoginPassController {

    @FXML
    private TextField adminUserName;

    @FXML
    public PasswordField adminLoigin_Password;

    @FXML
    private Button btn_adminForgot;

    @FXML
    private Button btn_adminLogin;

    @FXML
    private Button btn_adminHome;

    @FXML
    private Text adminLogin_textIncorrect;

    @FXML
    void onClick_LoginAdmin(ActionEvent event) {

        String pass = "zar123";

        if(adminLoigin_Password.getText().equals(pass)){

            try {
                Parent root = FXMLLoader.load(getClass().getResource("adminHomePanel.fxml"));
                Main.primaryStage.setScene(new Scene(root));
                Main.primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else{
            adminLogin_textIncorrect.setText("Incorrect Password");
        }

    }

    @FXML
    void onClick_adminHome(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_adminPassForg(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("passForgot.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
