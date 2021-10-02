import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sample.Main;

import java.io.IOException;

public class frontController {

    @FXML
    private Button butn_frontSignIn;

    @FXML
    void onClick_SignInFront(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
