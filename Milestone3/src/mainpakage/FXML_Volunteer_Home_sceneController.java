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
public class FXML_Volunteer_Home_sceneController implements Initializable {
     private Volunteer user;
    public void initData(Volunteer u) {
        user = u;  
    }  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CreateVaccineStatusONclick(ActionEvent event) {
    }

    @FXML
    private void CreateListforVITAONclick(ActionEvent event) {
    }

    @FXML
    private void CtrateHealthDataOnClick(ActionEvent event) {
    }

    @FXML
    private void CreateListLoanONClick(ActionEvent event) {
    }

    @FXML
    private void ViewEligableListLoanONclick(ActionEvent event) {
    }

    @FXML
    private void CreateListNewbornChildONclick(ActionEvent event) {
    }

    @FXML
    private void ViewListAboutVaccineStatus(ActionEvent event) {
    }

    @FXML
    private void CollectComplainONClick(ActionEvent event) {
    }

    @FXML
    private void LOgOUTONClick(ActionEvent event) {
    }
    
}
