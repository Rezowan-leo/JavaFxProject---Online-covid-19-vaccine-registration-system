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
import javafx.stage.Stage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class customerLoginController extends FileConst implements Initializable {

    @FXML
    public ComboBox cxOccupation;

    @FXML
    public TextField cxLogin_FirstName;

    @FXML
    public TextField cxLogin_LastName;

    @FXML
    public TextField cxLogin_PresentAddress;

    @FXML
    public TextField cxLogin_PermanentAddress;

    @FXML
    public TextField cxLogin_PostalCode;

    @FXML
    public TextField cxLogin_Phone;

    @FXML
    public TextField cxLogin_NID;

    @FXML
    public TextField cxLogin_Email;

    @FXML
    public TextArea cxLogin_MedicalCondition;

    @FXML
    private DatePicker cxLogin_DateOfBirth;

    @FXML
    public PasswordField cxLogin_Password;

    @FXML
    public PasswordField cxLogin_ConfirmPassword;

    @FXML
    public TextArea cxLogin_WorkExperience;

    @FXML
    private CheckBox cxLoginPage_male;

    @FXML
    private CheckBox cxLoginPage_female;

    @FXML
    private CheckBox cxLoginPage_other;

    @FXML
    private CheckBox cxLoginPageVaxYes;

    @FXML
    private CheckBox cxLoginPageVaxNo;

    @FXML
    private ComboBox cxLogin_comboCityCorp;

    @FXML
    private ComboBox cxLogin_comboThana;

    @FXML
    private ComboBox cxLogin_comboCenter;


    @FXML
    public TextArea cxLogin_Reference;

    @FXML
    public Button cxLogin_SubmitBtn;


    @FXML
    private Text cxLogin_passWordNotMatch;

    @FXML
    private CheckBox cxLogin_yesUpdate;

    @FXML
    private CheckBox cxLogin_noUpdate;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> occupations = FXCollections.observableArrayList("Government Service", "Social Service", "Residential Student", "University Student", "Medical Student", "Citizen above 30", "Citizen below 20", "Healthcare Professional", "Bank Employee", "National Player", "Farmer", "Other");

        cxOccupation.setItems(occupations);


        ObservableList<String> cityCorp = FXCollections.observableArrayList("Savar", "Dhamrai", "Keraniganj", "Nawabganj", "Dohar", "Dhaka North City Corporation", "Dhaka South City Corporation");

        cxLogin_comboCityCorp.setItems(cityCorp);

//        ObservableList<String> thanaDhakaNorth = FXCollections.observableArrayList("Tejgaon", "Gulshan");
//
//        ObservableList<String> thanaDhakaSouth = FXCollections.observableArrayList("Malibagh", "Dhanmondi");
//
//        ObservableList<String> centerTejgaon = FXCollections.observableArrayList("a", "b");
//        ObservableList<String> centerGulshan = FXCollections.observableArrayList("c", "d");
//        ObservableList<String> centerMalibagh = FXCollections.observableArrayList("e", "f");
//        ObservableList<String> centerDhanmondi = FXCollections.observableArrayList("g", "h");


//        if(cxLogin_comboCityCorp.getValue().equals("Dhaka North")) {
//
//            cxLogin_comboThana.setItems(thanaDhakaNorth);
//        }
//        else if(cxLogin_comboCityCorp.getValue().equals("Dhaka South")) {
//
//            cxLogin_comboThana.setItems(thanaDhakaSouth);
//        }
//
//        if(cxLogin_comboThana.getValue().equals("Tejgaon")) {
//
//            cxLogin_comboCenter.setItems(centerTejgaon);
//        }
//        else if(cxLogin_comboThana.getValue().equals("Gulshan")) {
//
//            cxLogin_comboCenter.setItems(centerGulshan);
//        }
//        else if(cxLogin_comboThana.getValue().equals("Malibagh")) {
//
//            cxLogin_comboCenter.setItems(centerMalibagh);
//        }
//
//        else if(cxLogin_comboThana.getValue().equals("Dhanmondi")) {
//
//            cxLogin_comboCenter.setItems(centerDhanmondi);
//        }


    }


    @FXML
    private Button btn_cxLoginHome;

    @FXML
    void onClick_cusLogHome(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @FXML
    void onClick_comboCityCorp(ActionEvent event) {

        ObservableList<String> thanaSavar = FXCollections.observableArrayList("Aminbazar", "Ashulia", "Banogram", "Bhakurta", "Biralia", "Dhamsona", "Kaundia", "Pathalia", "Savar", "Shimulia", "Tetuljhora", "Yearpur");
        ObservableList<String> thanaDhamrai = FXCollections.observableArrayList("Amta", "Baisakanda", "Balia", "Bhararia", "Chauhat", "Dhamrai", "Gangutia", "Jadabpur", "Kulla", "Kushura", "Nannar", "Rowail", "Sanora", "Sombhog", "Suapur", "Sutipara");
        ObservableList<String> thanaKeraniganj = FXCollections.observableArrayList("Aganagar", "Basta", "Hazratpur", "Kalatia", "Kalindi", "Konda", "Ruhitpur", "Sakta", "Subhadya", "Taranagar", "Tegharia", "Zinjira");
        ObservableList<String> thanaNawbganj = FXCollections.observableArrayList("Agla", "Kalakopa", "Kailail", "Galimpur", "Churain", "Joykrishnapur", "Nayansree", "Bakshanagar", "Baruakhali", "Barrah", "Bandura", "Jantrail", "Shikari Para", "Sholla");
        ObservableList<String> thanaDohar = FXCollections.observableArrayList("Kushumhati", "Mahmudpur", "Moksedpur", "Narisha", "Nayabari", "Raipara", "Sutarpara", "Bilashpur");
        ObservableList<String> thanaDhakaNorth = FXCollections.observableArrayList("Turag", "West Uttara", "East Uttara", "Uttarkhan", "Dakkhinkhan", "Bimanbandar", "Khilkhet", "Vatara", "Badda", "Rampura", "Hatirjheel", "Shilpanchal", "Tejgaon", "Sher-E-Bangla Nagar", "Mohammadpur", "Adabor", "Darussalam", "Mirpur", "Pallabi", "Rupnagar", "Shahali", "Kafrul", "Bhashantek", "Cantonment", "Banani", "Gulshan");
        ObservableList<String> thanaDhakaSouth = FXCollections.observableArrayList("Paltan", "Motijheel", "Sabujbagh", "Khilgaon", "Mugda", "Shahjahanpur", "Shampur", "Jatrabari", "Demra", "Kadamtali", "Gandaria", "Wari", "Ramna", "Shahbag", "Dhanmondi", "Hazaribagh", "Kalabgan", "Kotwali", "Sutrapur", "Lalbagh", "Bangsal", "Chawkbazar", "Kamrangirchar");

        if (cxLogin_comboCityCorp.getValue().equals("Savar")) {
            cxLogin_comboThana.setItems(thanaSavar);
        } else if (cxLogin_comboCityCorp.getValue().equals("Dhamrai")) {

            cxLogin_comboThana.setItems(thanaDhamrai);
        } else if (cxLogin_comboCityCorp.getValue().equals("Keraniganj")) {

            cxLogin_comboThana.setItems(thanaKeraniganj);
        } else if (cxLogin_comboCityCorp.getValue().equals("Nawabganj")) {

            cxLogin_comboThana.setItems(thanaNawbganj);
        } else if (cxLogin_comboCityCorp.getValue().equals("Dohar")) {

            cxLogin_comboThana.setItems(thanaDohar);
        } else if (cxLogin_comboCityCorp.getValue().equals("Dhaka North City Corporation")) {

            cxLogin_comboThana.setItems(thanaDhakaNorth);
        } else if (cxLogin_comboCityCorp.getValue().equals("Dhaka South City Corporation")) {

            cxLogin_comboThana.setItems(thanaDhakaSouth);
        }

    }

    @FXML
    void onClick_comboThana(ActionEvent event) {

        ObservableList<String> centerAminbazar = FXCollections.observableArrayList("Lalkuthi Maternity Hospital", "Nagor Matri Sadon", "Mohammadpur Nagar Matrisodon");
        ObservableList<String> centerAshulia = FXCollections.observableArrayList("CMH", "UTPS", "Savar Upazila Sastho Complex", "Shaheed Ahsan Ullah Master General Hospital");
        ObservableList<String> centerBanogram = FXCollections.observableArrayList("Nazirabazar Matrisadan", "Dhaka Mohanagar General Hospital", "Nagar Matrisadon");
        ObservableList<String> centerBhakurta = FXCollections.observableArrayList("Lalkuthi Maternity Hospital", "Nagormatri Sadon", "Mohammadpur Nagar Matrisadon");
        ObservableList<String> centerBiralia = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerDhamsona = FXCollections.observableArrayList("Upazila Health Complex Dhamrai", "CMH", "Ansar And VDP Government Hospital");
        ObservableList<String> centerKaundia = FXCollections.observableArrayList("Nagor Matri Sadon", "Lalkuthi Maternity Hospital", "50-Bed TB Hospital");
        ObservableList<String> centerPathalia = FXCollections.observableArrayList("Salimullah Medical Collage", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerSavar = FXCollections.observableArrayList("CMH Savar", "Savar Upazilla Health Complex", "Lalkuthi Maternity Hospital");
        ObservableList<String> centerShimulia = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Nazirabazar Matrisadan", "Dhaka Mahanagar Shishu Hospital");
        ObservableList<String> centerTetuljhora = FXCollections.observableArrayList("Lalkuthi Maternity Hospital", "Nagor Matri Sodon", "Mohammadpur Nagar Matrisodon");
        ObservableList<String> centerYearpur = FXCollections.observableArrayList("CHM Savar", "Shaheed Ahsan Ullah Master General Hospital", "UTPS");


        ObservableList<String> centerAmta = FXCollections.observableArrayList("Amta Rual Hospital", "Khosalpur Primary Health Center", "Maju NPHC");
        ObservableList<String> centerBaisakanda = FXCollections.observableArrayList("Salimullah Medical College", "Nagar Matri Sadan", "Nazirabazar Matrisadan");
        ObservableList<String> centerBalia = FXCollections.observableArrayList("Maa Tarini Nursing Home");
        ObservableList<String> centerBhararia = FXCollections.observableArrayList("Kamrangichar 31-Bed Hospital", "BGB Hospital", "Maternal And Child Health Training Institute");
        ObservableList<String> centerChauhat = FXCollections.observableArrayList("Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Sheikh Hasina National Institue Of Burn And Plastic Surgery");
        ObservableList<String> centerDhamrai = FXCollections.observableArrayList("Salimullah Medical College", "Dhaka Mohanagar General Hospital");
        ObservableList<String> centerGangutia = FXCollections.observableArrayList("Barakar Primary Health Center", "Shri Hospital", "Balitora Primary Health Care");
        ObservableList<String> centerJadabpur = FXCollections.observableArrayList("Apollo Clinic", "Urban Primary Health Clinic", "Urban Primary Health Center");
        ObservableList<String> centerKulla = FXCollections.observableArrayList("Badkulla", "PHC", "Upazilla Sodor Hospital");
        ObservableList<String> centerKushura = FXCollections.observableArrayList("Kaliakair Upazilla", "Satura Upazila Health Complex", "Manikganj Sadar Hospital", "CMH Savar");
        ObservableList<String> centerNannar = FXCollections.observableArrayList("Kaliakair Upazilla", "Manikganj Sadar Hospital", "CMH Savar");
        ObservableList<String> centerRowail = FXCollections.observableArrayList("Manikganj Sadar Hospital", "CMH Savar", "Barakar Primary Health Center", "Shri Hospital");
        ObservableList<String> centerSanora = FXCollections.observableArrayList("CMH Savar", "Barakar Primary Health Center", "Shri Hospital");
        ObservableList<String> centerSombhog = FXCollections.observableArrayList("Kaliakair Upazilla", "CMH Savar", "Barakar Primary Health Center", "Shri Hospital");
        ObservableList<String> centerSuapur = FXCollections.observableArrayList("Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Manikganj Sadar Hospital", "CMH Savar");
        ObservableList<String> centerSutipara = FXCollections.observableArrayList("Saturia Upazila Health Complex", "CMH Savar", "Savar Upazila Health Complex");


        ObservableList<String> centerAganagar = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerBasta = FXCollections.observableArrayList("Preventa Family Vaccine Center");
        ObservableList<String> centerHazratpur = FXCollections.observableArrayList("Keraniganj Upazila Health Complex", "Savar Upazila Health Complex", "Lalkuthi Maternity Hospital");
        ObservableList<String> centerKalatia = FXCollections.observableArrayList("Nogor Matrisodon Hazaribag", "BGB Hospital", "Mohammadpur Nagar Matrisodon");
        ObservableList<String> centerKalindi = FXCollections.observableArrayList("Nazat PHC", "Jeliakhali PHC", "Korakati Primary Health Center");
        ObservableList<String> centerKonda = FXCollections.observableArrayList("ICDDR");
        ObservableList<String> centerRuhitpur = FXCollections.observableArrayList("Upazila Health Complex", "Kamrangichar 31-Bed Hospital", "BGB Hospital");
        ObservableList<String> centerSakta = FXCollections.observableArrayList("Nazat PHC", "Jeliakhali PHC", "Korakati Primary Health Center");
        ObservableList<String> centerSubhadya = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerTaranagar = FXCollections.observableArrayList("Nogor Matrisodon Hazaribag", "BGB Hospital", "Mohammadpur Nagar Matrisodon");
        ObservableList<String> centerTegharia = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerZinjira = FXCollections.observableArrayList("Nagar Matri Sadan", "Nazira Bazar Matrisadan", "Sheikh Hasina National Institute Of Burn And Plastic Surgery");


        ObservableList<String> centerAgla = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerKalakopa = FXCollections.observableArrayList("Preventa Family Vaccine Center");
        ObservableList<String> centerKailail = FXCollections.observableArrayList("Keraniganj Upazila Health Complex", "Lalkuthi Maternity Hospital");
        ObservableList<String> centerGalimpur = FXCollections.observableArrayList("Nogor Matrisodon Hazaribag", "BGB Hospital", "Mohammadpur Nagar Matrisodon");
        ObservableList<String> centerChurain = FXCollections.observableArrayList("Jeliakhali PHC", "Korakati Primary Health Center");
        ObservableList<String> centerJoykrishnapur = FXCollections.observableArrayList("ICDDR", "Korakati Primary Health Center");
        ObservableList<String> centerNayansree = FXCollections.observableArrayList("Upazila Health Complex", "BGB Hospital");
        ObservableList<String> centerBakshanagar = FXCollections.observableArrayList("Nazat PHC", "Korakati Primary Health Center");
        ObservableList<String> centerBaruakhali = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerBarrah = FXCollections.observableArrayList("Nogor Matrisodon Hazaribag", "BGB Hospital");
        ObservableList<String> centerBandura = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerJantrail = FXCollections.observableArrayList("Nagar Matri Sadan", "Korakati Primary Health Center");
        ObservableList<String> centerShikariPara = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerSholla = FXCollections.observableArrayList("Preventa Family Vaccine Center");


        ObservableList<String> centerKushumhati = FXCollections.observableArrayList("Nagar Matri Sadan", "Nazira Bazar Matrisadan", "Sheikh Hasina National Institute Of Burn And Plastic Surgery");
        ObservableList<String> centerMahmudpur = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerMoksedpur = FXCollections.observableArrayList("Preventa Family Vaccine Center");
        ObservableList<String> centerNarisha = FXCollections.observableArrayList("Apollo Clinic", "Urban Primary Health Clinic", "Urban Primary Health Center");
        ObservableList<String> centerNayabari = FXCollections.observableArrayList("Salimullah Medical College", "Nagar Matri Sadan", "Nazirabazar Matrisadan");
        ObservableList<String> centerRaipara = FXCollections.observableArrayList("Nagar Matri Sadan", "Nazira Bazar Matrisadan", "Sheikh Hasina National Institute Of Burn And Plastic Surgery");
        ObservableList<String> centerSutarpara = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital");
        ObservableList<String> centerBilashpur = FXCollections.observableArrayList("Nagar Matri Sadan", "Urban Primary Health Center");


        ObservableList<String> centerTurag = FXCollections.observableArrayList("20-Bed TB Hospital", "Nagar Matrisodon", "Lalkuti Matrisodon");
        ObservableList<String> centerWestUttara = FXCollections.observableArrayList("Sir Salimullah Medical College", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerEastUttara = FXCollections.observableArrayList("Apollo Clinic", "Urban Primary Health Clinic", "Urban Primary Health Center");
        ObservableList<String> centerUttarkhan = FXCollections.observableArrayList("Nagar Matri Sadan", "Nazira Bazar Matrisadan", "Sheikh Hasina National Institute Of Burn And Plastic Surgery");
        ObservableList<String> centerDakkhinkhan = FXCollections.observableArrayList("Nazat PHC", "Jeliakhali PHC", "Korakati Primary Health Center");
        ObservableList<String> centerBimanbandar = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerKhilkhet = FXCollections.observableArrayList("Government Employee Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerVatara = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerBadda = FXCollections.observableArrayList("Badda General Hospital", "Shastho Sheba Kendro", "AMZ Hospital");
        ObservableList<String> centerRampura = FXCollections.observableArrayList("Rampura Sastha Seba Kendra", "Delta Specialized Hospital");
        ObservableList<String> centerHatirjheel = FXCollections.observableArrayList("National Institute of Diseases of the Chest and Hospital (NIDCH)", "Government Employee Hospital");
        ObservableList<String> centerShilpanchal = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerTejgaon = FXCollections.observableArrayList("National Institute Of Ear, Nose & Throat", "Shaheed Suhrawardy Medical College and Hospital", "National Institute of Diseases of the Chest and Hospital (NIDCH)");
        ObservableList<String> centerSherEBanglaNagar = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerMohammadpur = FXCollections.observableArrayList("Mohammadpur Fertility Services & Training Centre", "Shaheed Suhrawardy Medical College and Hospital");
        ObservableList<String> centerAdabor = FXCollections.observableArrayList("Shaheed Suhrawardy Medical College and Hospital", "Sorkari Bohi:Bivagio Dispensary", "Government Employee Hospital");
        ObservableList<String> centerDarussalam = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerMirpur = FXCollections.observableArrayList("Sorkari Bohi:Bivagio Dispensary", "Mirpur Adhunik Hospital And Diagnostic Center", "Mirpur General Hospital & Diagnostic Centre", "Unique General Hospital");
        ObservableList<String> centerPallabi = FXCollections.observableArrayList("Mirpur General Hospital & Diagnostic Centre", "Mirpur Adhunik Hospital And Diagnostic Center");
        ObservableList<String> centerRupnagar = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Urban Primary Health Clinic", "Nagar Matri sadan");
        ObservableList<String> centerShahali = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerKafrul = FXCollections.observableArrayList("Nazat PHC", "Dhaka Mohanagar General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerBhashantek = FXCollections.observableArrayList("Dhaka Mohanagar General Hospital", "Urban Primary Health Clinic");
        ObservableList<String> centerCantonment = FXCollections.observableArrayList("Siraj-Khaleda Memorial Cantonment Board General Hospital", "Kurmitola General Hospital", "Upazila Health Complex");
        ObservableList<String> centerBanani = FXCollections.observableArrayList("Square Hospital Consultation & Diagnostic Center, Banani", "Banani Clinic Limited", "BGMEA Health Center");
        ObservableList<String> centerGulshan = FXCollections.observableArrayList();


        ObservableList<String> centerPaltan = FXCollections.observableArrayList("Salimullah Medical Collage", "Dhaka Mohanagar General Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerMotijheel = FXCollections.observableArrayList("Central Police Hospital", "Government Employee Hospital");
        ObservableList<String> centerSabujbagh = FXCollections.observableArrayList("Siraj-Khaleda Memorial Cantonment Board General Hospital", "Nagar Matri sadan");
        ObservableList<String> centerKhilgaon = FXCollections.observableArrayList("Nari Maitree", "Government Employee Hospital", "National Institute Of Diseases Of The Chest And Hospital (NIDC)");
        ObservableList<String> centerMugda = FXCollections.observableArrayList("Government Employee Hospital", "Nagar Matri sadan", "Nari Maitree");
        ObservableList<String> centerShahjahanpur = FXCollections.observableArrayList("District Hospital Shahjahanpur", "New District Hospital Shahjahanpur");
        ObservableList<String> centerShampur = FXCollections.observableArrayList("Government Employee Hospital", "Old District Hospital");
        ObservableList<String> centerJatrabari = FXCollections.observableArrayList("Bangladesh Community General Hospital", "Jatrabari Specialised Hospital And Diagnostic", "Royal Hospital");
        ObservableList<String> centerDemra = FXCollections.observableArrayList("Holy Aid Hospital Ltd.", "Arimo General Hospital", "Famous Hospital & Diagnostic Center Ltd.");
        ObservableList<String> centerKadamtali = FXCollections.observableArrayList("Government Employee Hospital", "Arimo General Hospital");
        ObservableList<String> centerGandaria = FXCollections.observableArrayList("Government Employee Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerWari = FXCollections.observableArrayList("Health Care Hospital", "Wari Golden Hospital & Diagnostic Center", "Shaheed Khalek-Ibrahim General Hospital");
        ObservableList<String> centerRamna = FXCollections.observableArrayList("Dhaka Medical College Hospital", "Government Employee Hospital");
        ObservableList<String> centerShahbag = FXCollections.observableArrayList("Government Employee Hospital", "Dhaka Medical College Hospital", "BIRDEM General Hospital");
        ObservableList<String> centerDhanmondi = FXCollections.observableArrayList("Dhanmondi General And Kidney Hospital Limited", "Farabi General Hospital", "Women's And Children's General Hospital");
        ObservableList<String> centerHazaribagh = FXCollections.observableArrayList("Sadar Hospital Hazaribag", "Civil Surgeon Office Hazaribag", "Government Employee Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerKalabgan = FXCollections.observableArrayList("Dhanmondi General And Kidney Hospital Limited", "Dhaka Medical College Hospital");
        ObservableList<String> centerKotwali = FXCollections.observableArrayList("Government Employee Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerSutrapur = FXCollections.observableArrayList("Government Employee Hospital", "Nazira Bazar Government Mother & Children Health Care Hospital");
        ObservableList<String> centerLalbagh = FXCollections.observableArrayList("Nazat PHC", "Jeliakhali PHC", "Korakati Primary Health Center");
        ObservableList<String> centerBangsal = FXCollections.observableArrayList("Nazira Bazar Government Mother & Children Health Care Hospital", "Sir Salimullah Medical College", "Government Employee Hospital");
        ObservableList<String> centerChawkbazar = FXCollections.observableArrayList("Government Employee Hospital", "Nagar Matri Sadan");
        ObservableList<String> centerKamrangirchar = FXCollections.observableArrayList("Kaliakair Upazilla", "Satura Upazila Health Complex", "Manikganj Sadar Hospital", "CMH");


        if (cxLogin_comboThana.getValue().equals("Aminbazar")) {

            cxLogin_comboCenter.setItems(centerAminbazar);
        } else if (cxLogin_comboThana.getValue().equals("Ashulia")) {

            cxLogin_comboCenter.setItems(centerAshulia);
        } else if (cxLogin_comboThana.getValue().equals("Banogram")) {

            cxLogin_comboCenter.setItems(centerBanogram);
        } else if (cxLogin_comboThana.getValue().equals("Bhakurta")) {

            cxLogin_comboCenter.setItems(centerBhakurta);
        } else if (cxLogin_comboThana.getValue().equals("Biralia")) {

            cxLogin_comboCenter.setItems(centerBiralia);
        } else if (cxLogin_comboThana.getValue().equals("Dhamsona")) {

            cxLogin_comboCenter.setItems(centerDhamsona);
        } else if (cxLogin_comboThana.getValue().equals("Kaundia")) {

            cxLogin_comboCenter.setItems(centerKaundia);
        } else if (cxLogin_comboThana.getValue().equals("Pathalia")) {

            cxLogin_comboCenter.setItems(centerPathalia);
        } else if (cxLogin_comboThana.getValue().equals("Savar")) {

            cxLogin_comboCenter.setItems(centerSavar);
        } else if (cxLogin_comboThana.getValue().equals("Shimulia")) {

            cxLogin_comboCenter.setItems(centerShimulia);
        } else if (cxLogin_comboThana.getValue().equals("Tetuljhora")) {

            cxLogin_comboCenter.setItems(centerTetuljhora);
        } else if (cxLogin_comboThana.getValue().equals("Yearpur")) {

            cxLogin_comboCenter.setItems(centerYearpur);
        } else if (cxLogin_comboThana.getValue().equals("Amta")) {

            cxLogin_comboCenter.setItems(centerAmta);
        } else if (cxLogin_comboThana.getValue().equals("Baisakanda")) {

            cxLogin_comboCenter.setItems(centerBaisakanda);
        } else if (cxLogin_comboThana.getValue().equals("Balia")) {

            cxLogin_comboCenter.setItems(centerBalia);
        } else if (cxLogin_comboThana.getValue().equals("Bhararia")) {

            cxLogin_comboCenter.setItems(centerBhararia);
        } else if (cxLogin_comboThana.getValue().equals("Chauhat")) {

            cxLogin_comboCenter.setItems(centerChauhat);
        } else if (cxLogin_comboThana.getValue().equals("Dhamrai")) {

            cxLogin_comboCenter.setItems(centerDhamrai);
        } else if (cxLogin_comboThana.getValue().equals("Gangutia")) {

            cxLogin_comboCenter.setItems(centerGangutia);
        } else if (cxLogin_comboThana.getValue().equals("Jadabpur")) {

            cxLogin_comboCenter.setItems(centerJadabpur);
        } else if (cxLogin_comboThana.getValue().equals("Kulla")) {

            cxLogin_comboCenter.setItems(centerKulla);
        } else if (cxLogin_comboThana.getValue().equals("Kushura")) {

            cxLogin_comboCenter.setItems(centerKushura);
        } else if (cxLogin_comboThana.getValue().equals("Nannar")) {

            cxLogin_comboCenter.setItems(centerNannar);
        } else if (cxLogin_comboThana.getValue().equals("Rowail")) {

            cxLogin_comboCenter.setItems(centerRowail);
        } else if (cxLogin_comboThana.getValue().equals("Sanora")) {

            cxLogin_comboCenter.setItems(centerSanora);
        } else if (cxLogin_comboThana.getValue().equals("Sombhog")) {

            cxLogin_comboCenter.setItems(centerSombhog);
        } else if (cxLogin_comboThana.getValue().equals("Suapur")) {

            cxLogin_comboCenter.setItems(centerSuapur);
        } else if (cxLogin_comboThana.getValue().equals("Sutipara")) {

            cxLogin_comboCenter.setItems(centerSutipara);
        } else if (cxLogin_comboThana.getValue().equals("Aganagar")) {

            cxLogin_comboCenter.setItems(centerAganagar);
        } else if (cxLogin_comboThana.getValue().equals("Basta")) {

            cxLogin_comboCenter.setItems(centerBasta);
        } else if (cxLogin_comboThana.getValue().equals("Hazratpur")) {

            cxLogin_comboCenter.setItems(centerHazratpur);
        } else if (cxLogin_comboThana.getValue().equals("Kalatia")) {

            cxLogin_comboCenter.setItems(centerKalatia);
        } else if (cxLogin_comboThana.getValue().equals("Kalindi")) {

            cxLogin_comboCenter.setItems(centerKalindi);
        } else if (cxLogin_comboThana.getValue().equals("Konda")) {

            cxLogin_comboCenter.setItems(centerKonda);
        } else if (cxLogin_comboThana.getValue().equals("Ruhitpur")) {

            cxLogin_comboCenter.setItems(centerRuhitpur);
        } else if (cxLogin_comboThana.getValue().equals("Sakta")) {

            cxLogin_comboCenter.setItems(centerSakta);
        } else if (cxLogin_comboThana.getValue().equals("Subhadya")) {

            cxLogin_comboCenter.setItems(centerSubhadya);
        } else if (cxLogin_comboThana.getValue().equals("Taranagar")) {

            cxLogin_comboCenter.setItems(centerTaranagar);
        } else if (cxLogin_comboThana.getValue().equals("Tegharia")) {

            cxLogin_comboCenter.setItems(centerTegharia);
        } else if (cxLogin_comboThana.getValue().equals("Zinjira")) {

            cxLogin_comboCenter.setItems(centerZinjira);
        } else if (cxLogin_comboThana.getValue().equals("Agla")) {

            cxLogin_comboCenter.setItems(centerAgla);
        } else if (cxLogin_comboThana.getValue().equals("Kalakopa")) {

            cxLogin_comboCenter.setItems(centerKalakopa);
        } else if (cxLogin_comboThana.getValue().equals("Kailail")) {

            cxLogin_comboCenter.setItems(centerKailail);
        } else if (cxLogin_comboThana.getValue().equals("Galimpur")) {

            cxLogin_comboCenter.setItems(centerGalimpur);
        } else if (cxLogin_comboThana.getValue().equals("Churain")) {

            cxLogin_comboCenter.setItems(centerChurain);
        } else if (cxLogin_comboThana.getValue().equals("Joykrishnapur")) {

            cxLogin_comboCenter.setItems(centerJoykrishnapur);
        } else if (cxLogin_comboThana.getValue().equals("Nayansree")) {

            cxLogin_comboCenter.setItems(centerNayansree);
        } else if (cxLogin_comboThana.getValue().equals("Bakshanagar")) {

            cxLogin_comboCenter.setItems(centerBakshanagar);
        } else if (cxLogin_comboThana.getValue().equals("Baruakhali")) {

            cxLogin_comboCenter.setItems(centerBaruakhali);
        } else if (cxLogin_comboThana.getValue().equals("Barrah")) {

            cxLogin_comboCenter.setItems(centerBarrah);
        } else if (cxLogin_comboThana.getValue().equals("Bandura")) {

            cxLogin_comboCenter.setItems(centerBandura);
        } else if (cxLogin_comboThana.getValue().equals("Jantrail")) {

            cxLogin_comboCenter.setItems(centerJantrail);
        } else if (cxLogin_comboThana.getValue().equals("Shikari Para")) {

            cxLogin_comboCenter.setItems(centerShikariPara);
        } else if (cxLogin_comboThana.getValue().equals("Sholla")) {

            cxLogin_comboCenter.setItems(centerSholla);
        } else if (cxLogin_comboThana.getValue().equals("Kushumhati")) {

            cxLogin_comboCenter.setItems(centerKushumhati);
        } else if (cxLogin_comboThana.getValue().equals("Mahmudpur")) {

            cxLogin_comboCenter.setItems(centerMahmudpur);
        } else if (cxLogin_comboThana.getValue().equals("Moksedpur")) {

            cxLogin_comboCenter.setItems(centerMoksedpur);
        } else if (cxLogin_comboThana.getValue().equals("Narisha")) {

            cxLogin_comboCenter.setItems(centerNarisha);
        } else if (cxLogin_comboThana.getValue().equals("Nayabari")) {

            cxLogin_comboCenter.setItems(centerNayabari);
        } else if (cxLogin_comboThana.getValue().equals("Raipara")) {

            cxLogin_comboCenter.setItems(centerRaipara);
        } else if (cxLogin_comboThana.getValue().equals("Sutarpara")) {

            cxLogin_comboCenter.setItems(centerSutarpara);
        } else if (cxLogin_comboThana.getValue().equals("Bilashpur")) {

            cxLogin_comboCenter.setItems(centerBilashpur);
        } else if (cxLogin_comboThana.getValue().equals("Turag")) {

            cxLogin_comboCenter.setItems(centerTurag);
        } else if (cxLogin_comboThana.getValue().equals("West Uttara")) {

            cxLogin_comboCenter.setItems(centerWestUttara);
        } else if (cxLogin_comboThana.getValue().equals("East Uttara")) {

            cxLogin_comboCenter.setItems(centerEastUttara);
        } else if (cxLogin_comboThana.getValue().equals("Uttarkhan")) {

            cxLogin_comboCenter.setItems(centerUttarkhan);
        } else if (cxLogin_comboThana.getValue().equals("Dakkhinkhan")) {

            cxLogin_comboCenter.setItems(centerDakkhinkhan);
        } else if (cxLogin_comboThana.getValue().equals("Bimanbandar")) {

            cxLogin_comboCenter.setItems(centerBimanbandar);
        } else if (cxLogin_comboThana.getValue().equals("Khilkhet")) {

            cxLogin_comboCenter.setItems(centerKhilkhet);
        } else if (cxLogin_comboThana.getValue().equals("Vatara")) {

            cxLogin_comboCenter.setItems(centerVatara);
        } else if (cxLogin_comboThana.getValue().equals("Badda")) {

            cxLogin_comboCenter.setItems(centerBadda);
        } else if (cxLogin_comboThana.getValue().equals("Rampura")) {

            cxLogin_comboCenter.setItems(centerRampura);
        } else if (cxLogin_comboThana.getValue().equals("Hatirjheel")) {

            cxLogin_comboCenter.setItems(centerHatirjheel);
        } else if (cxLogin_comboThana.getValue().equals("Shilpanchal")) {

            cxLogin_comboCenter.setItems(centerShilpanchal);
        } else if (cxLogin_comboThana.getValue().equals("Tejgaon")) {

            cxLogin_comboCenter.setItems(centerTejgaon);
        } else if (cxLogin_comboThana.getValue().equals("Sher-E-Bangla Nagar")) {

            cxLogin_comboCenter.setItems(centerSherEBanglaNagar);
        } else if (cxLogin_comboThana.getValue().equals("Mohammadpur")) {

            cxLogin_comboCenter.setItems(centerMohammadpur);
        } else if (cxLogin_comboThana.getValue().equals("")) {

            cxLogin_comboCenter.setItems(centerAdabor);
        } else if (cxLogin_comboThana.getValue().equals("")) {

            cxLogin_comboCenter.setItems(centerAdabor);
        } else if (cxLogin_comboThana.getValue().equals("Darussalam")) {

            cxLogin_comboCenter.setItems(centerDarussalam);
        } else if (cxLogin_comboThana.getValue().equals("Mirpur")) {

            cxLogin_comboCenter.setItems(centerMirpur);
        } else if (cxLogin_comboThana.getValue().equals("Pallabi")) {

            cxLogin_comboCenter.setItems(centerPallabi);
        } else if (cxLogin_comboThana.getValue().equals("Rupnagar")) {

            cxLogin_comboCenter.setItems(centerRupnagar);
        } else if (cxLogin_comboThana.getValue().equals("Shahali")) {

            cxLogin_comboCenter.setItems(centerShahali);
        } else if (cxLogin_comboThana.getValue().equals("Kafrul")) {

            cxLogin_comboCenter.setItems(centerKafrul);
        } else if (cxLogin_comboThana.getValue().equals("Bhashantek")) {

            cxLogin_comboCenter.setItems(centerBhashantek);
        } else if (cxLogin_comboThana.getValue().equals("Cantonment")) {

            cxLogin_comboCenter.setItems(centerCantonment);
        } else if (cxLogin_comboThana.getValue().equals("Banani")) {

            cxLogin_comboCenter.setItems(centerBanani);
        } else if (cxLogin_comboThana.getValue().equals("Gulshan")) {

            cxLogin_comboCenter.setItems(centerGulshan);
        } else if (cxLogin_comboThana.getValue().equals("Paltan")) {

            cxLogin_comboCenter.setItems(centerPaltan);
        } else if (cxLogin_comboThana.getValue().equals("Motijheel")) {

            cxLogin_comboCenter.setItems(centerMotijheel);
        } else if (cxLogin_comboThana.getValue().equals("Sabujbagh")) {

            cxLogin_comboCenter.setItems(centerSabujbagh);
        } else if (cxLogin_comboThana.getValue().equals("Khilgaon")) {

            cxLogin_comboCenter.setItems(centerKhilgaon);
        } else if (cxLogin_comboThana.getValue().equals("Mugda")) {

            cxLogin_comboCenter.setItems(centerMugda);
        } else if (cxLogin_comboThana.getValue().equals("Shahjahanpur")) {

            cxLogin_comboCenter.setItems(centerShahjahanpur);
        } else if (cxLogin_comboThana.getValue().equals("Shampur")) {

            cxLogin_comboCenter.setItems(centerShampur);
        } else if (cxLogin_comboThana.getValue().equals("Jatrabari")) {

            cxLogin_comboCenter.setItems(centerJatrabari);
        } else if (cxLogin_comboThana.getValue().equals("Demra")) {

            cxLogin_comboCenter.setItems(centerDemra);
        } else if (cxLogin_comboThana.getValue().equals("Kadamtali")) {

            cxLogin_comboCenter.setItems(centerKadamtali);
        } else if (cxLogin_comboThana.getValue().equals("Gandaria")) {

            cxLogin_comboCenter.setItems(centerGandaria);
        } else if (cxLogin_comboThana.getValue().equals("Wari")) {

            cxLogin_comboCenter.setItems(centerWari);
        } else if (cxLogin_comboThana.getValue().equals("Ramna")) {

            cxLogin_comboCenter.setItems(centerRamna);
        } else if (cxLogin_comboThana.getValue().equals("Shahbag")) {

            cxLogin_comboCenter.setItems(centerShahbag);
        } else if (cxLogin_comboThana.getValue().equals("Dhanmondi")) {

            cxLogin_comboCenter.setItems(centerDhanmondi);
        } else if (cxLogin_comboThana.getValue().equals("Hazaribagh")) {

            cxLogin_comboCenter.setItems(centerHazaribagh);
        } else if (cxLogin_comboThana.getValue().equals("Kalabgan")) {

            cxLogin_comboCenter.setItems(centerKalabgan);
        } else if (cxLogin_comboThana.getValue().equals("Kotwali")) {

            cxLogin_comboCenter.setItems(centerKotwali);
        } else if (cxLogin_comboThana.getValue().equals("Sutrapur")) {

            cxLogin_comboCenter.setItems(centerSutrapur);
        } else if (cxLogin_comboThana.getValue().equals("Lalbagh")) {

            cxLogin_comboCenter.setItems(centerLalbagh);
        } else if (cxLogin_comboThana.getValue().equals("Bangsal")) {

            cxLogin_comboCenter.setItems(centerBangsal);
        } else if (cxLogin_comboThana.getValue().equals("Chawkbazar")) {

            cxLogin_comboCenter.setItems(centerChawkbazar);
        } else if (cxLogin_comboThana.getValue().equals("Kamrangirchar")) {

            cxLogin_comboCenter.setItems(centerKamrangirchar);
        }

    }

    @FXML
    void onClick_comboCenter(ActionEvent event) {

    }

//    {
//        try {
//            FileWriter fw8 = new FileWriter("vaccineCount.txt", true);
//            BufferedWriter bw8 = new BufferedWriter(fw8);
//            bw8.write("2 0 0");   // vaccineAvailable, regis, pend
//            bw8.newLine();
//            fw8.flush();
//            bw8.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



//    public int vaccineAvailability = 2;
//    public int pending = 0;
//    public int registered = 0;
//    public int n;

    @FXML
    void onClick_customerLoginSubmit(ActionEvent event) {
        int registered = 0;
        int vaccineAvailable = 0;
        int pending = 0;

        try {
            FileReader fr9 = new FileReader("vaccineCount.txt");
            BufferedReader br9 = new BufferedReader(fr9);
            String wholeLine;
            String[] parts = new String[3];
            while ((wholeLine = br9.readLine()) != null) {
                parts = wholeLine.split(" ");
                vaccineAvailable = Integer.parseInt(parts[0]);
                registered = Integer.parseInt(parts[1]);
                pending = Integer.parseInt(parts[2]);
            }

            if (vaccineAvailable > 0) {

                try {

                    if (cxLogin_Password.getText().equals(cxLogin_ConfirmPassword.getText())) {

                        if(pending > 0){
                            pending = pending - 1;
                        }

                        FileWriter fw9 = new FileWriter("vaccineCount.txt", true);
                        BufferedWriter bw9 = new BufferedWriter(fw9);
                        bw9.write((vaccineAvailable-1)+" "+(registered+1)+" "+pending);   // vaccineAvailable, regis, pend
                        bw9.newLine();
                        fw9.flush();
                        bw9.flush();


                        String[] cxArray = new String[18];

                        cxArray[0] = cxLogin_FirstName.getText();
                        cxArray[1] = cxLogin_LastName.getText();
                        cxArray[2] = cxLogin_NID.getText();
                        cxArray[3] = (String) cxLogin_comboCityCorp.getValue();
                        cxArray[4] = (String) cxLogin_comboThana.getValue();
                        cxArray[5] = (String) cxLogin_comboCenter.getValue();
                        cxArray[6] = cxLogin_PresentAddress.getText();
                        cxArray[7] = cxLogin_PermanentAddress.getText();
                        cxArray[8] = cxLogin_PostalCode.getText();
                        cxArray[9] = (String) cxOccupation.getValue();
                        if (cxLoginPage_male.isSelected()) {
                            cxArray[10] = cxLoginPage_male.getText();
                        } else if (cxLoginPage_female.isSelected()) {
                            cxArray[10] = cxLoginPage_female.getText();
                        } else if (cxLoginPage_other.isSelected()) {
                            cxArray[10] = cxLoginPage_other.getText();
                        }
                        cxArray[11] = String.valueOf(cxLogin_DateOfBirth.getValue());

                        if (cxLoginPageVaxYes.isSelected()) {
                            cxArray[12] = cxLoginPageVaxYes.getText();
                        } else if (cxLoginPageVaxNo.isSelected()) {
                            cxArray[12] = cxLoginPageVaxNo.getText();
                        }
                        cxArray[13] = cxLogin_MedicalCondition.getText();
                        cxArray[14] = cxLogin_Phone.getText();
                        cxArray[15] = cxLogin_Email.getText();

                        if (cxLogin_yesUpdate.isSelected()) {
                            cxArray[16] = cxLogin_yesUpdate.getText();
                        } else if (cxLogin_noUpdate.isSelected()) {
                            cxArray[16] = cxLogin_noUpdate.getText();
                        }
                        cxArray[17] = cxLogin_Password.getText();

                        try {
                            FileWriter fw = new FileWriter("userInfo.txt", true);
                            BufferedWriter bw = new BufferedWriter(fw);

                            bw.write("First Name: " + cxArray[0]);
                            bw.newLine();
                            bw.write("Last Name: " + cxArray[1]);
                            bw.newLine();
                            bw.write("NID: " + cxArray[2]);
                            bw.newLine();
                            bw.write("City Corporation: " + cxArray[3]);
                            bw.newLine();
                            bw.write("Thana: " + cxArray[4]);
                            bw.newLine();
                            bw.write("Vaccine Center: " + cxArray[5]);
                            bw.newLine();
                            bw.write("Present Address: " + cxArray[6]);
                            bw.newLine();
                            bw.write("Permanent Address: " + cxArray[7]);
                            bw.newLine();
                            bw.write("Postal Code: " + cxArray[8]);
                            bw.newLine();
                            bw.write("Occupation: " + cxArray[9]);
                            bw.newLine();
                            bw.write("Gender: " + cxArray[10]);
                            bw.newLine();
                            bw.write("Date Of Birth: " + cxArray[11]);
                            bw.newLine();
                            bw.write("Vaccine Status: " + cxArray[12]);
                            bw.newLine();
                            bw.write("Medical Condition: " + cxArray[13]);
                            bw.newLine();
                            bw.write("Phone: " + cxArray[14]);
                            bw.newLine();
                            bw.write("Email: " + cxArray[15]);
                            bw.newLine();
                            bw.write("Receive Updates: " + cxArray[16]);
                            bw.newLine();
                            bw.write("Password: " + cxArray[17]);
                            bw.newLine();
                            bw.newLine();


                            bw.close();
                            fw.close();


                            FileWriter fw2 = new FileWriter("userOnlyPass.txt", true);
                            BufferedWriter bw2 = new BufferedWriter(fw2);
                            bw2.write(cxArray[2]);
                            bw2.write(" ");
                            bw2.write(cxArray[17]);
                            bw2.write(" ");
                            bw2.write(String.valueOf(cxLogin_comboCenter.getItems()));
                            bw2.newLine();

                            bw2.close();
                            fw2.close();


                            try {
                                FileWriter fw3 = new FileWriter("UserVaccineCard.txt");
                                BufferedWriter bw3 = new BufferedWriter(fw3);


                                String serverAddress = "127.0.0.1";
                                int serverPort = 6666;
                                NetworkUtil nc = new NetworkUtil(serverAddress, serverPort);
                                //String name = "C";
                                Object ob = (String) "Online Covid-19 Vaccine Registration System\n\nVaccine Card\n\nHello " + cxArray[0] + " " + cxArray[1] + "\nCongratulations! The vaccine registration of the NID " + cxArray[2] + " is complete\n" + "\nThe vaccine center is " + cxArray[5]+"\nDate: 23/10/2021, Saturday\n";
                                nc.write(ob);
                                bw3.write(String.valueOf(ob));
                                bw3.newLine();
                                bw3.flush();

                                System.out.println("\nHello " + cxArray[0] + " " + cxArray[1] + "\nCongratulations! The vaccine registration for NID " + cxArray[2] + " is completed!\n" + "The vaccine center is " + cxArray[5] + "\n"+"Date: 23/10/2021, Saturday");
                                //System.out.println(nc.read());

                                FileWriter fw4 = new FileWriter("UserCongDraft.txt");
                                BufferedWriter bw4 = new BufferedWriter(fw4);
                                bw4.write(cxArray[0] + " " + cxArray[1]);
                                bw4.newLine();
                                bw4.write(cxArray[2]);
                                bw4.newLine();
                                bw4.write(cxArray[5]);
                                bw4.flush();

                            } catch (IOException e) {
                                e.printStackTrace();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        Stage st = new Stage();
                        Parent root2 = FXMLLoader.load(getClass().getResource("cong.fxml"));

                        Parent root = FXMLLoader.load(getClass().getResource("homeUser.fxml"));
                        Main.primaryStage.setScene(new Scene(root));
                        st.setScene(new Scene(root2));
                        Main.primaryStage.show();
                        st.setTitle("Online Covid-19 Vaccine Registration System");
                        st.show();


//                    Main.primaryStage.setScene(new Scene(root2));
//                    Main.primaryStage.show();

                    } else {
                        cxLogin_passWordNotMatch.setText("Password does not match!");
                    }
                } catch (IOException e) {
                    e.printStackTrace();

                }

            } else {

                FileWriter fw10 = new FileWriter("vaccineCount.txt", true);
                BufferedWriter bw10 = new BufferedWriter(fw10);
                bw10.write((vaccineAvailable)+" "+(registered)+" "+(pending+1));   // vaccineAvailable, regis, pend
                bw10.newLine();
                fw10.flush();
                bw10.flush();

                if (cxLogin_Password.getText().equals(cxLogin_ConfirmPassword.getText())) {

                    String[] cxArray2 = new String[18];

                    cxArray2[0] = cxLogin_FirstName.getText();
                    cxArray2[1] = cxLogin_LastName.getText();
                    cxArray2[2] = cxLogin_NID.getText();
                    cxArray2[3] = (String) cxLogin_comboCityCorp.getValue();
                    cxArray2[4] = (String) cxLogin_comboThana.getValue();
                    cxArray2[5] = (String) cxLogin_comboCenter.getValue();
                    cxArray2[6] = cxLogin_PresentAddress.getText();
                    cxArray2[7] = cxLogin_PermanentAddress.getText();
                    cxArray2[8] = cxLogin_PostalCode.getText();
                    cxArray2[9] = (String) cxOccupation.getValue();
                    if (cxLoginPage_male.isSelected()) {
                        cxArray2[10] = cxLoginPage_male.getText();
                    } else if (cxLoginPage_female.isSelected()) {
                        cxArray2[10] = cxLoginPage_female.getText();
                    } else if (cxLoginPage_other.isSelected()) {
                        cxArray2[10] = cxLoginPage_other.getText();
                    }
                    cxArray2[11] = String.valueOf(cxLogin_DateOfBirth.getValue());

                    if (cxLoginPageVaxYes.isSelected()) {
                        cxArray2[12] = cxLoginPageVaxYes.getText();
                    } else if (cxLoginPageVaxNo.isSelected()) {
                        cxArray2[12] = cxLoginPageVaxNo.getText();
                    }
                    cxArray2[13] = cxLogin_MedicalCondition.getText();
                    cxArray2[14] = cxLogin_Phone.getText();
                    cxArray2[15] = cxLogin_Email.getText();

                    if (cxLogin_yesUpdate.isSelected()) {
                        cxArray2[16] = cxLogin_yesUpdate.getText();
                    } else if (cxLogin_noUpdate.isSelected()) {
                        cxArray2[16] = cxLogin_noUpdate.getText();
                    }
                    cxArray2[17] = cxLogin_Password.getText();


                    try {

                        FileWriter fw = new FileWriter("UserPending.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write("First Name: " + cxArray2[0]);
                        bw.newLine();
                        bw.write("Last Name: " + cxArray2[1]);
                        bw.newLine();
                        bw.write("NID: " + cxArray2[2]);
                        bw.newLine();
                        bw.write("City Corporation: " + cxArray2[3]);
                        bw.newLine();
                        bw.write("Thana: " + cxArray2[4]);
                        bw.newLine();
                        bw.write("Vaccine Center: " + cxArray2[5]);
                        bw.newLine();
                        bw.write("Present Address: " + cxArray2[6]);
                        bw.newLine();
                        bw.write("Permanent Address: " + cxArray2[7]);
                        bw.newLine();
                        bw.write("Postal Code: " + cxArray2[8]);
                        bw.newLine();
                        bw.write("Occupation: " + cxArray2[9]);
                        bw.newLine();
                        bw.write("Gender: " + cxArray2[10]);
                        bw.newLine();
                        bw.write("Date Of Birth: " + cxArray2[11]);
                        bw.newLine();
                        bw.write("Vaccine Status: " + cxArray2[12]);
                        bw.newLine();
                        bw.write("Medical Condition: " + cxArray2[13]);
                        bw.newLine();
                        bw.write("Phone: " + cxArray2[14]);
                        bw.newLine();
                        bw.write("Email: " + cxArray2[15]);
                        bw.newLine();
                        bw.write("Receive Updates: " + cxArray2[16]);
                        bw.newLine();
                        bw.write("Password: " + cxArray2[17]);
                        bw.newLine();
                        bw.newLine();

                        bw.close();
                        fw.close();


                        Stage st = new Stage();
                        Parent root2 = FXMLLoader.load(getClass().getResource("sorry.fxml"));

                        st.setScene(new Scene(root2));
                        Main.primaryStage.show();
                        st.setTitle("Online Covid-19 Vaccine Registration System");
                        st.show();

                    } catch (IOException e) {
                        e.printStackTrace();
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
