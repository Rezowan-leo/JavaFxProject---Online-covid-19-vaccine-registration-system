import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class adminLoginPageController implements Initializable {

    @FXML
    private ComboBox adminOccupation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> occupation = FXCollections.observableArrayList("Government Service", "Social Service", "Residential Student", "University Student", "Medical Student", "Citizen above 30", "Citizen below 20", "Healthcare Professional", "Bank Employee", "National Player", "Farmer", "Other");

        adminOccupation.setItems(occupation);


    }
}
