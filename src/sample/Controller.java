package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    public Button button;

    @FXML
    public TextField textField;
    public TextArea textArea;


    public void clickButtonSend(javafx.event.ActionEvent actionEvent) {
    textArea.appendText(textField.getText() + "\n");
    textField.clear();
    }
}
