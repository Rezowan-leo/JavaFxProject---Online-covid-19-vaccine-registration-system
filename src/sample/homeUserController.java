package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;

public class homeUserController {

    @FXML
    private Button btn_homeUserSignOut;

    @FXML
    private Text homeUser_Cong;



    @FXML
    private Button btn_homeUserUpdate;

    @FXML
    void onClick_homeUserSignOut(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

//    public void initialize(){
//        homeUser_Cong.setText(ob);
//    }


    @FXML
    void onClick_homeUserUpdate(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("customerLogin.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
