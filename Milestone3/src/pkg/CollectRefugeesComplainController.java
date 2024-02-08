
package pkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mainpakage.Refugee;


public class CollectRefugeesComplainController implements Initializable {

    @FXML
    private ComboBox<String> ComboBoxforComplain;
    
     //private ArrayList<Refugee> refArr = new ArrayList<Refugee>();
    @FXML
    private TextField Namefxid;
    @FXML
    private TextField ComplainType;
    @FXML
    private TextField idFxId;
   
    @FXML
    private TextArea textfieldfxid;
    ArrayList<Refugee> refArr;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         refArr= new ArrayList<Refugee>();
    ComboBoxforComplain.getItems().add("Chicken Pox");
    ComboBoxforComplain.getItems().add("Titenus ");
    ComboBoxforComplain.getItems().add("Influenzae ");
    ComboBoxforComplain.getItems().add("Mumps ");
    ComboBoxforComplain.getItems().add("Polio ");
    ComboBoxforComplain.getItems().add("Pneumococcal ");
    ComboBoxforComplain.getItems().add("Hepatitis B ");    
    }    

    @FXML
    private void AddComlainOnclick(ActionEvent event) {
        refArr.add(
                new Refugee(
                         Namefxid.getText(),
                        Integer.parseInt(idFxId.getText()),
                       
                        ComplainType.getText())
                        
                
    };
       

    @FXML
    private void BackButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void createComplainOnclick(ActionEvent event) {
    }
    
}
