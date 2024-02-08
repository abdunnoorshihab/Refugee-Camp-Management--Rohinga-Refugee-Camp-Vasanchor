/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpakage;

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
public class FXML_Ngo_Officer_View_Newborn_Child_listController implements Initializable {

    @FXML
    private TableView<NewbornChildList> tablefxiD;
    @FXML
    private TableColumn<NewbornChildList, String> col1fxid;
    @FXML
    private TableColumn<NewbornChildList, String> col2fxId;
    @FXML
    private TableColumn<NewbornChildList, Integer> col3fxid;
    private Ngo_Officer user;
    public void initData(Ngo_Officer u){
        user = u;

    /**
     * Initializes the controller class.
     */
    @Override
     void initialize(URL url, ResourceBundle rb) {
        col1fxid.setCellValueFactory(new PropertyValueFactory<NewbornChildList,String>("name"));
        col2fxId.setCellValueFactory(new PropertyValueFactory<NewbornChildList,String>("gender"));
        col3fxid.setCellValueFactory(new PropertyValueFactory<NewbornChildList,Integer>("age"));
        
        ArrayList<NewbornChildList>u = Ngo_Officer.viewEmployeeList();
        for(NewbornChildList i: u){
            tablefxiD.getItems().add(i);
    }
        // TODO
    }    

     @FXML
     public void HomesceneOnClick() ActionEvent = null event
{
        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(getClass().getResource("FXML_NGO_Officer_HomeSceneController.fxml"));
        Parent homeScene1 = loader1.load();
        Scene homepage1 = new Scene(homeScene1);
         FXML_NGO_Officer_HomeSceneController controller1 = loader1.getController();
        controller1.initData(user);
        Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window1.setScene(homepage1);
        window1.show();
    };
    }
    
    
}
