import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class customerLoginController implements Initializable {

    @FXML
    private ComboBox customerOccupation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> occupations = FXCollections.observableArrayList("Government Service", "Social Service", "Residential Student", "University Student", "Medical Student", "Citizen above 30", "Citizen below 20", "Healthcare Professional", "Bank Employee", "National Player", "Farmer", "Other");

        customerOccupation.setItems(occupations);


    }
}
