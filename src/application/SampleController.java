package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import application.FileHandling;

public class SampleController implements Initializable{

    @FXML
    private Text total;
    @FXML
    private Text wpm;
    @FXML
    private Text invalid;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // we need to display data
        int[] data = FileHandling.sumUpNumbers("src/data");
        total.setText(String.valueOf(data[0]));
        wpm.setText(String.valueOf(Math.round(data[1]*1.0/data[3])));
        invalid.setText(String.valueOf(data[2]));
    }
	
	
    public void playGame(ActionEvent ddd) throws IOException {
        Main m = new Main();
            m.changeScene("Game.fxml");
    }
	
}
