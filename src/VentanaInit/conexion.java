package VentanaInit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rental Servicios
 */
public class conexion {
   private static conexion instancia; 
   private final static String dir ="com.mysql.jdbc.Driver"; 
   private final static String bd = "persona";
   private final static String url = "jdbc:mysql://localhost:3306/"+bd;
   private final static String user ="root";
   private final static String pass = "";
   private Connection ct;
   private Statement st;
   public ResultSet rs= null;
   
   public synchronized static conexion getInstancia (){ //sincronizacion del servidor y netbeans
       if (instancia ==  null){
           instancia = new conexion();
       }
   return instancia;
}
   
   public conexion () {
    try{
        Class.forName(dir).newInstance();
        ct= DriverManager.getConnection(url, user,pass);// Maneja el drive y hace una conexion en la direccion del usuario 
        st= ct.createStatement(); // permite la comunicacion entre el netbeans y la base de datos, pasa toda la informacion si se inserta, si se elimina
        System.out.println("La BD esta conectada");
    }
     catch (Exception e){
     System.out.println("No pudo conectar a la BD");
    }
  }
   public void Desconectar (){
      if(ct!=null){
      try{
        ct.close();
        System.out.println("BD desconectada Gracias");
      }
      catch(SQLException e1){
          System.out.println (e1);
      }  
  }
     
  }
  
  public void IngresarDatos (String sent){
      try{
        st=ct.createStatement();  
        st.executeUpdate(sent); 
               
        JOptionPane.showMessageDialog(null, "Registro Exitoso","Exito!",JOptionPane.INFORMATION_MESSAGE);
      }
      catch (SQLException e){
          JOptionPane.showMessageDialog(null, "Error en la insercion, por favor verifique\n"+e, "ERROR", JOptionPane.ERROR_MESSAGE);
          System.out.println(e);
      }
      finally {Desconectar();}
  }
}
