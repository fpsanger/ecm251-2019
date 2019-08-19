package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    @FXML // falando q o componente pode ser ligado com o sample.fxml
    private Label lblTexto;

    @FXML
    private TextField txtName;


    @FXML
    public void changeText (){

        lblTexto.setText("Ola "+ txtName.getText());

        txtName.clear();

    }
}
