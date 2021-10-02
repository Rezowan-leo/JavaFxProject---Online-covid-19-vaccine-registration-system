package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class adminLoginController {

    @FXML
    private Button btn_adminLoginRegis;


    @FXML
    private Button btn_adminLoginForgot;

    @FXML
    private Button btn_adminLoginHome;

    @FXML
    private TextField adminL_NID;

    @FXML
    private PasswordField adminL_pass;

    @FXML
    private Button btn_adminLogin;

    @FXML
    void onClick_Home(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @FXML
    void onClick_forgotPass(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("passForgot.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @FXML
    void onClick_adminLoginRegis(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("adminLoginPage.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onClick_Loginbtn(ActionEvent event) {
        String wholeLine = null;

        try {
            FileReader fr = new FileReader("adminOnlyPass.txt");
            BufferedReader br = new BufferedReader(fr);

            while((wholeLine = br.readLine()) != null){
                String[] parts = wholeLine.split(" ");
                if(adminL_NID.getText().equals(parts[0])){
                    if(adminL_pass.getText().equals(parts[1])) {
                       try {
                            Parent root = FXMLLoader.load(getClass().getResource("adminHome.fxml"));
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
        }






