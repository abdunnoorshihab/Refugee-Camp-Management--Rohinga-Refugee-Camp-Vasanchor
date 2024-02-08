
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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXML_LogInController implements Initializable {

    @FXML
    private TextField PasswordType;
    @FXML
    private TextField IdType;
    @FXML
    private ComboBox<String> comboUserType;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
           comboUserType.getItems().addAll("Ngo officer","Volunteer","Resource manager","Local MP","Administrator","Educational reprasantative","Madecal officer");
        ArrayList<Users>uList = UsersList.listOfUser();
        for(Users i : uList){
            System.out.println(i.toString());
    }    
    
}

    @FXML
    private void onClickloginButton(ActionEvent event)throws IOException {
        Users u = Users.login(Integer.parseInt(IdType.getText()),PasswordType.getText(),comboUserType.getValue().toString());
        if(u == null){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error Alert");
            a.setHeaderText("Invalid Id or Password");
            a.setContentText("Oops! Something went wrong...");
            a.showAndWait();
        }
        else{
            if(u instanceof Ngo_Officer){
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("FXML_NGO_Officer_HomeSceneController.fxml"));
                Parent homeScene1 = loader1.load();
                Scene homepage1 = new Scene(homeScene1);
                 FXML_NGO_Officer_HomeSceneController controller1 = loader1.getController();
                controller1.initData((Ngo_Officer)u);
                Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                window1.setScene(homepage1);
                window1.show();
            } 
        }
    
            
            else if(u instanceof Volunteer){
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("FXML_Volunteer_Home_sceneController.fxml"));
                Parent homeScene1 = loader1.load();
                Scene homepage1 = new Scene(homeScene1);
               FXML_Volunteer_Home_sceneController controller1 = loader1.getController();
                controller1.initData((Volunteer)u);
                Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                window1.setScene(homepage1);
                window1.show();
            } 
            else if(u instanceof Customer){
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("FXML_CustomerHomeScene.fxml"));
                Parent homeScene1 = loader1.load();
                Scene homepage1 = new Scene(homeScene1);
                FXML_CustomerHomeSceneController controller1 = loader1.getController();
                controller1.initData((Customer)u);
                Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                window1.setScene(homepage1);
                window1.show();
            } 
            else if(u instanceof Worker){
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("FXML_WorkerHomeScene.fxml"));
                Parent homeScene1 = loader1.load();
                Scene homepage1 = new Scene(homeScene1);
                FXML_WorkerHomeSceneController controller1 = loader1.getController();
                controller1.initData((Worker)u);
                Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                window1.setScene(homepage1);
                window1.show();
            } 
            else if(u instanceof Supplier){
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("FXML_SupplierHomeScene.fxml"));
                Parent homeScene1 = loader1.load();
                Scene homepage1 = new Scene(homeScene1);
                FXML_SupplierHomeSceneController controller1 = loader1.getController();
                controller1.initData((Supplier)u);
                Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                window1.setScene(homepage1);
                window1.show();
            } 
            else if(u instanceof Admin){
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("FXML_AdminHomeScen.fxml"));
                Parent homeScene1 = loader1.load();
                Scene homepage1 = new Scene(homeScene1);
                FXML_AdminHomeScenController controller1 = loader1.getController();
                controller1.initData((Admin) u);
                Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
                window1.setScene(homepage1);
                window1.show();
            }
        }
                
        
    }
    
}

 }

