package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class adminLoginPageController implements Initializable {

    @FXML
    public ComboBox adminOccupation;

    @FXML
    public TextField adminLogin_FirstName;

    @FXML
    public TextField adminLogin_LastName;

    @FXML
    public TextField adminLogin_PresentAddress;

    @FXML
    public TextField adminLogin_PermanentAddress;

    @FXML
    public TextField adminLogin_PostalCode;

    @FXML
    public TextField adminLogin_Phone;

    @FXML
    public TextField adminLogin_NID;

    @FXML
    public TextField adminLogin_Email;

    @FXML
    public TextArea adminLogin_MedicalCondition;

    @FXML
    private DatePicker adminLogin_DateOfBirth;

    @FXML
    public PasswordField adminLogin_Password;

    @FXML
    public PasswordField adminLogin_ConfirmPassword;

    @FXML
    public TextArea adminLogin_WorkExperience;

    @FXML
    private CheckBox adminLoginPage_male;

    @FXML
    private CheckBox adminLoginPage_female;

    @FXML
    private CheckBox adminLoginPage_other;

    @FXML
    private CheckBox adminLoginPageVaxYes;

    @FXML
    private CheckBox adminLoginPageVaxNo;


    @FXML
    public TextArea adminLogin_Reference;

    @FXML
    public Button adminLogin_SubmitBtn;

    @FXML
    private Text adminLoginPage_PassNotMatch;

    @FXML
    private CheckBox adminLoginPageAgree;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> occupation = FXCollections.observableArrayList("Government Service", "Social Service", "Residential Student", "University Student", "Medical Student", "Citizen above 30", "Citizen below 20", "Healthcare Professional", "Bank Employee", "National Player", "Farmer", "Other");

        adminOccupation.setItems(occupation);

    }

   @FXML
   void onClick_adminLoginPageOccupation(ActionEvent event) {
       String occ = (String) adminOccupation.getValue();
    }


    @FXML
    public Button btn_adminLoginPageHome;

    @FXML
    void onClick_adminLoginPageHome(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }


    @FXML
    void onClick_adminLoginPageSubmit(ActionEvent event) {

        try {

            if(adminLogin_Password.getText().equals(adminLogin_ConfirmPassword.getText())) {
                if(adminLoginPageAgree.isSelected()) {

                    String[] adminArray = new String[16];

                    adminArray[0] = adminLogin_FirstName.getText();
                    adminArray[1] = adminLogin_LastName.getText();
                    adminArray[2] = adminLogin_PresentAddress.getText();
                    adminArray[3] = adminLogin_PermanentAddress.getText();
                    adminArray[4] = adminLogin_PostalCode.getText();
                    adminArray[5] = adminLogin_Phone.getText();
                    adminArray[6] = adminLogin_NID.getText();
                    adminArray[7] = adminLogin_Email.getText();
                    adminArray[8] = (String) adminOccupation.getValue();
                    if(adminLoginPage_male.isSelected()) {
                        adminArray[9] = adminLoginPage_male.getText();
                    }
                    else if(adminLoginPage_female.isSelected()) {
                        adminArray[9] = adminLoginPage_female.getText();
                    }
                    else if(adminLoginPage_other.isSelected()) {
                        adminArray[9] = adminLoginPage_other.getText();
                    }
                    adminArray[10] = String.valueOf(adminLogin_DateOfBirth.getValue());

                    if(adminLoginPageVaxYes.isSelected()){
                        adminArray[11] = adminLoginPageVaxYes.getText();
                    }
                    else if(adminLoginPageVaxNo.isSelected()){
                        adminArray[11] = adminLoginPageVaxNo.getText();
                    }
                    adminArray[12] = adminLogin_MedicalCondition.getText();
                    adminArray[13] = adminLogin_WorkExperience.getText();
                    adminArray[14] = adminLogin_Reference.getText();
                    adminArray[15] = adminLogin_Password.getText();

                    //new FileConst(adminArray);

                    try {

                        FileWriter fw = new FileWriter("adminInfo.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write("First Name: " + adminArray[0]);
                        bw.newLine();
                        bw.write("Last Name: " + adminArray[1]);
                        bw.newLine();
                        bw.write("Present Address: " + adminArray[2]);
                        bw.newLine();
                        bw.write("Permanent Address: " + adminArray[3]);
                        bw.newLine();
                        bw.write("Postal Code: " + adminArray[4]);
                        bw.newLine();
                        bw.write("Phone: " + adminArray[5]);
                        bw.newLine();
                        bw.write("NID: " + adminArray[6]);
                        bw.newLine();
                        bw.write("Email: " + adminArray[7]);
                        bw.newLine();
                        bw.write("Occupation: " + adminArray[8]);
                        bw.newLine();
                        bw.write("Gender: " + adminArray[9]);
                        bw.newLine();
                        bw.write("Date Of Birth: " + adminArray[10]);
                        bw.newLine();
                        bw.write("Vaccinated: " + adminArray[11]);
                        bw.newLine();
                        bw.write("Medical Condition: " + adminArray[12]);
                        bw.newLine();
                        bw.write("Work Experience: " + adminArray[13]);
                        bw.newLine();
                        bw.write("Reference: " + adminArray[14]);
                        bw.newLine();
                        bw.write("Password: " + adminArray[15]);
                        bw.newLine();
                        bw.newLine();

                        bw.close();
                        fw.close();

                        FileWriter fw2 = new FileWriter("adminOnlyPass.txt", true);
                        BufferedWriter bw2 = new BufferedWriter(fw2);
                        bw2.write(adminArray[6]);
                        bw2.write(" ");
                        bw2.write(adminArray[15]);
                        bw2.newLine();

                        bw2.close();
                        fw2.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    Parent root = FXMLLoader.load(getClass().getResource("adminHome.fxml"));
                    Main.primaryStage.setScene(new Scene(root));
                    Main.primaryStage.show();
                }
            }
            else{
                adminLoginPage_PassNotMatch.setText("Password does not match!");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
