package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sampleController {

    @FXML
    private Button btn_sampleCreate;

    @FXML
    private Button btn_sampleForgot;

    @FXML
    private Button btn_sampleHome;

    @FXML
    private TextField cxLogin_NID;

    @FXML
    private PasswordField cxLogin_Password;

    @FXML
    private Button btn_cxLogin;



    @FXML
    void onClick_sampleHome(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_sampleForgotPass(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("passForgot.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_sampleCreate(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("customerLogin.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_Loginbtn1(ActionEvent event) {
        String wholeLine = null;

        try {
            FileReader fr = new FileReader("userOnlyPass.txt");
            BufferedReader br = new BufferedReader(fr);

            while ((wholeLine = br.readLine()) != null) {
                String[] parts = wholeLine.split(" ");
                if (cxLogin_NID.getText().equals(parts[0])) {
                    if (cxLogin_Password.getText().equals(parts[1])) {
                        try {
                            Parent root = FXMLLoader.load(getClass().getResource("homeUser.fxml"));
                            Main.primaryStage.setScene(new Scene(root));
                            Main.primaryStage.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void onClick_smapleAdminLogin(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("adminLogin.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_sampleLogin(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("homeUser.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}