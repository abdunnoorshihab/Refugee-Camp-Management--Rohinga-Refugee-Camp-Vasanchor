/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpakage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class NgoOfficerLogInSceneController implements Initializable {

    @FXML
    private TextField Idfxid;
    @FXML
    private TextField passwordFxid;
    @FXML
    private ComboBox<?> Comboboxfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LogINActionONclick(ActionEvent event) {
    }
    
}
