/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Rental Servicios
 */
public class principal extends Application{

      
    @Override
    public void start(Stage stage) throws Exception {
 Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
 
Scene scene = new Scene(root);
 
stage.setScene(scene);
stage.show();
 }

    @Override
    public void init() throws Exception {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
       launch(args);      
       
    }
    
 

   
    
}
