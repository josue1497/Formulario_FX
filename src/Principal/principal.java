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
public class principal extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try{
        Parent root = FXMLLoader.load(getClass().getResource("/VentanaInit/FXMLDocument.fxml"));
       
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show(); 
        }catch(Exception e){
            System.out.println("Error al Invocar FXML");
        }
    }


    public static void main(String[] args) {
        launch(args);

    }

}
