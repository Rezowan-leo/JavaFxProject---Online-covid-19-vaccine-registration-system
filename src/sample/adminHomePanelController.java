package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.annotation.processing.Filer;
import java.io.*;

public class adminHomePanelController {

    @FXML
    private TextArea admin_Regis;

    @FXML
    private TextArea adminPending;

    @FXML
    private TextField adminVaccineAv;

    @FXML
    private TextField TotalRegis;

    @FXML
    private TextField TotalPending;

    @FXML
    private Button btn_update;

    @FXML
    private Button adminSignOut;

    @FXML
    private TextField UpdateVaccine;

    @FXML
    private TextArea adminVolunteer;

    public void initialize() {
        String vac = null;
        String reg = null;
        String pend = null;

        String wholeFile1 = "";
        String wholeFile2 = "";
        String wholeFile3 = "";

        try {
            FileReader fr11 = new FileReader("vaccineCount.txt");

            BufferedReader br11 = new BufferedReader(fr11);
            String wholeLine;
            String[] parts = new String[3];
            while ((wholeLine = br11.readLine()) != null) {
                parts = wholeLine.split(" ");
            }
            TotalRegis.setText(String.valueOf(parts[1]));
            TotalPending.setText(String.valueOf(parts[2]));
            adminVaccineAv.setText(String.valueOf(parts[0]));
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr6 = new FileReader("userInfo.txt");
            BufferedReader br6 = new BufferedReader(fr6);
            String wholeLine;
            while((wholeLine = br6.readLine()) != null ){
                wholeFile1 = wholeFile1 + "\n" + wholeLine;
            }
            if(Integer.parseInt(TotalRegis.getText()) > 0) {
                admin_Regis.setText(wholeFile1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr7 = new FileReader("UserPending.txt");
            BufferedReader br7 = new BufferedReader(fr7);
            String wholeLine2;
            while((wholeLine2 = br7.readLine()) != null ){
                wholeFile2 = wholeFile2 + "\n" + wholeLine2;
            }
            if(Integer.parseInt(TotalPending.getText()) > 0) {
                adminPending.setText(wholeFile2);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr15 = new FileReader("adminInfo.txt");
            BufferedReader br15 = new BufferedReader(fr15);
            String wholeLine3;
            while((wholeLine3 = br15.readLine()) != null ){
                wholeFile3 = wholeFile3 + "\n" + wholeLine3;
            }
                adminVolunteer.setText(wholeFile3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onClick_adminSignOut(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
            Main.primaryStage.setScene(new Scene(root));
            Main.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onClick_btnUpdate(ActionEvent event) {
        int vacAv = 0;
        int regisCount = 0;
        int pendingCount = 0;


       int updateVac = Integer.parseInt(UpdateVaccine.getText());

        try {
            FileReader fr13 = new FileReader("vaccineCount.txt");
            BufferedReader br13 = new BufferedReader(fr13);
            String wholeLine;
            String[] parts = new String[3];
            while ((wholeLine = br13.readLine()) != null) {
                parts = wholeLine.split(" ");
                vacAv = Integer.parseInt(parts[0]);
                regisCount = Integer.parseInt(parts[1]);
                pendingCount = Integer.parseInt(parts[2]);
            }


            FileWriter fw12 = new FileWriter("vaccineCount.txt", true);
            BufferedWriter bw12 = new BufferedWriter(fw12);
            bw12.write((vacAv+updateVac)+" "+ regisCount +" "+pendingCount);   // vaccineAvailable, regis, pend
            bw12.newLine();
            fw12.flush();
            bw12.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
