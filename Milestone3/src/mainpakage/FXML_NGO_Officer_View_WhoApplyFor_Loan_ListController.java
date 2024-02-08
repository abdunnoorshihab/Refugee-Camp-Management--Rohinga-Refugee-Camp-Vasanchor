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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXML_NGO_Officer_View_WhoApplyFor_Loan_ListController implements Initializable {

    @FXML
    private TableView<Refugee> tablefxID;
    @FXML
    private TableColumn<Refugee, String> col1fxid;
    @FXML
    private TableColumn<Refugee, Integer> IDfxid;
    @FXML
    private TableColumn<Refugee, String> Genderfxid;
    @FXML
    private TableColumn<Refugee, Integer> Categoryfxid;
    private Ngo_Officer user;
      public void initData(Ngo_Officer u){
        user = u;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        col1fxid.setCellValueFactory(new PropertyValueFactory<Refugee,String>("name"));
        IDfxid.setCellValueFactory(new PropertyValueFactory<Refugee,Integer>("ID"));
        Genderfxid.setCellValueFactory(new PropertyValueFactory<Refugee,String>("Gender"));
        Categoryfxid.setCellValueFactory(new PropertyValueFactory<Refugee,Integer>("age"));
                
        ArrayList<Refugee>u = Ngo_Officer.viewEmmployeeList();
        for(Refugee i: u){
            tablefxID.getItems().add(i);
     
    }    
    
}

    @FXML
    private void HomeSceneOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(getClass().getResource("FXML_NGO_Officer_HomeSceneController.fxml"));
        Parent homeScene1 = loader1.load();
        Scene homepage1 = new Scene(homeScene1);
        FXML_NGO_Officer_HomeSceneController controller1 = loader1.getController();
        controller1.initData(user);
        Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window1.setScene(homepage1);
        window1.show();
    }
    }
