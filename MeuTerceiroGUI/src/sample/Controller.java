package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BasicCalculator;


public class Controller {

    @FXML
    private TextField txtValue1;

    @FXML
    private TextField txtValue2;

    @FXML
    private Label lblResp;

    @FXML
    public void sum(){

        BasicCalculator cassio = new BasicCalculator();
        lblResp.setText(""+ cassio.getAdd(txtValue1.getText(),txtValue2.getText()));

    }

    public void sub(){

        BasicCalculator cassio = new BasicCalculator();
        lblResp.setText(""+ cassio.getSub(txtValue1.getText(),txtValue2.getText()));


    }


}
