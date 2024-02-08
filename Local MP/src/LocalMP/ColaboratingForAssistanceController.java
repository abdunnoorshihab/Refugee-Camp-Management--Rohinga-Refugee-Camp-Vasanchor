/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocalMP;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ColaboratingForAssistanceController implements Initializable {

    @FXML
    private DatePicker MyDatePicker;
    @FXML
    private Label myLabel;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getDate(ActionEvent event) {
        LocalDate myDate= MyDatePicker.getValue();
        System.out.println(myDate.toString());
    }

    @FXML
    private void pressedButton1(ActionEvent event) {
        System.out.println("Button 1 Pressed");
        System.out.println(textField1.getText());
    }

    @FXML
    private void pressedButton2(ActionEvent event) {
        System.out.println("Button 2 pressed");
        System.out.println(textField2.getText());
    }
    
}
