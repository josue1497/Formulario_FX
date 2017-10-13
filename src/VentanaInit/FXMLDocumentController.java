package VentanaInit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import VentanaInit.conexion;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 *
 * @author Rental Servicios
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnRegistrar;
    @FXML
    TextField txtNombre,txtApellido;
    DatePicker date_fecha;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       btnRegistrar.setOnAction((e)->{
           String nombre=txtNombre.getText();
           String apellido=txtApellido.getText();
           
           SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
           String fecha=formato.format(date_fecha.getDayCellFactory());
           //conexion con=new conexion();
           /*con.IngresarDatos("INSERT INTO `Persona`.`datos_personales` "
                    + "(`nombre`, `apellido`, `fecha_nacimiento`) "
                    + "VALUES ('"+nombre+"', '"+apellido+"', '"+fecha+"');");*/
           System.out.println(fecha);
           txtNombre.setText("");
           txtApellido.setText("");
           date_fecha.setDayCellFactory(null);
       });
    }    
    
}
