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

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXML_NGO_Officer_HomeSceneController implements Initializable {
 private Ngo_Officer user;

    public void initData(Ngo_Officer u) {
        user = u;    
    }
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewCoronaVaccinONClick(ActionEvent event) {
    }

    @FXML
    private void ViewVitaminASupplimentONClick(ActionEvent event) {
    }

    @FXML
    private void ViewHealthConditionONClick(ActionEvent event) {
    }

    @FXML
    private void ViewMeetingScheduleONClick(ActionEvent event) {
    }

    @FXML
    private void logOUTONClick(ActionEvent event) {
    }

    @FXML
    private void ViewForLoanONClick(ActionEvent event) {
    }

    @FXML
    private void LoanEligiblityONClick(ActionEvent event) {
    }

    @FXML
    private void UpdateNewbornChildListONClick(ActionEvent event) {
    }

    @FXML
    private void GiveEligiblelistwhoapplyforLoanOnClick(ActionEvent event) {
    }

    @FXML
    private void CreateupdatefornewbornchildList(ActionEvent event) {
    }
    
}
