
package modelo;

import conexion.Conexion;
import javax.swing.JOptionPane;
import java.sql.*;


public class clsFunciones {
   private Conexion conectar = Conexion.getInstance();
 public  boolean validarEdad(int edad){
     boolean correcto = false;
     
     if (edad > 12 && edad < 80) {
         correcto = true;
     }else{
         JOptionPane.showMessageDialog(null,"Edad no valida");
     }
     return correcto;
 }
 public  boolean validarId(String id){
     boolean correcto = false;
     if (id.length()>= 9 && id.length() <= 16) {
         try {
             Connection conexion = conectar.conectar();
            PreparedStatement consultar = conexion.prepareStatement("SELECT * FROM empleados where id = ?");
            consultar.setString(1, id);
            ResultSet resultadoConsulta = consultar.executeQuery();
             if (resultadoConsulta.isBeforeFirst()) {
                 JOptionPane.showMessageDialog(null, "El ID ya fue registrado");
             }else{
                 correcto = true;
             }
             conectar.cerrarConexion();
             
         } catch (SQLException e) {
             System.out.println(e);
         }
     }
     return correcto;
 }
 public boolean validarNombre(String nombre){
     boolean correcto = false;
     if (nombre.length() > 3 ) {
       correcto = true; 
     }else{
         JOptionPane.showMessageDialog(null, "Nombre invalido");
     }
     
     return correcto;
 }
 public boolean validarContraseña(String contraseña){
     boolean correcto = false;
     if (contraseña.length() >= 8) {
         correcto = true;
     } else{
         JOptionPane.showMessageDialog(null, "Contraseña invalida");
     }
     return correcto;
 }
}
