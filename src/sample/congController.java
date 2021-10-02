package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class congController {

    @FXML
    private Text cong_t1;

    @FXML
    private Text cont_t2;

    public void initialize(){
        try {
            FileReader fr = new FileReader("UserCongDraft.txt");
            BufferedReader br = new BufferedReader(fr);

            String name = br.readLine();
            String nid = br.readLine();
            String center = br.readLine();

            cong_t1.setText("Congratulations "+name+", the NID "+nid+" has been registered for COVID-19 vaccination!");
            cont_t2.setText("The vaccine center is "+center);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
