/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpakage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXML_NGO_Officer_Give_Eligible_List_Who_ApplyFor_LoanController implements Initializable {

    @FXML
    private TextField namefxId;
    @FXML
    private TextField IdFxId;
    @FXML
    private TextField LoantypeFxID;
     private Ngo_Officer user;
    private ArrayList<Ngo_Officer> NgoList;
    public void initData(Ngo_Officer u) {
        user = u;
    }

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        NgoList = new ArrayList<Ngo_Officer>();
        // TODO
    }    

    @FXML
    private void SubmitOnClick(ActionEvent event) {
         NgoList.add(
                new Ngo_Officer(
                        Integer.parseInt(IdFxId.getText()),
                        namefxId.getText(),
                        LoantypeFxID.getText()
                )
         );
    };
                 

    @FXML
    private void BackOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(getClass().getResource("FXML_NGO_Officer_HomeSceneController.fxml"));
        Parent homeScene1 = loader1.load();
        Scene homepage1 = new Scene(homeScene1);
        FXML_NGO_Officer_HomeSceneController controller1 = loader1.getController();
        controller1.initData(user);
        Stage window1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window1.setScene(homepage1);
        window1.show();
    }
    
}

    
    
    

