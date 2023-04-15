package modelo;

import conexion.Conexion;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;

public class clsFunciones {

    private final Conexion conectar = Conexion.getInstance();
    Random random = new Random();

    public boolean validarEdad(int edad) {
        boolean correcto = false;

        if (edad > 12 && edad < 80) {
            correcto = true;
        } else {
            JOptionPane.showMessageDialog(null, "Edad no valida");
        }
        return correcto;
    }

    public boolean validarId(String id) {
        boolean correcto = false;
        if (id.length() >= 9 && id.length() <= 16) {
            try {
                Connection conexion = conectar.conectar();
                PreparedStatement consultar = conexion.prepareStatement("SELECT * FROM empleados where id = ?");
                consultar.setString(1, id);
                ResultSet resultadoConsulta = consultar.executeQuery();
                System.out.println("ejecuto");
                if (resultadoConsulta.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "El ID ya fue registrado");
                } else {
                    correcto = true;
                }
                conectar.cerrarConexion();

            } catch (SQLException e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ID invalido \n debe contener almenos 9 digitos");
        }
        return correcto;
    }

    public boolean validarNombre(String nombre) {
        boolean correcto = false;
        if (nombre.length() > 3) {
            correcto = true;
        } else {
            JOptionPane.showMessageDialog(null, "Nombre invalido");
        }

        return correcto;
    }

    public boolean validarContraseña(String contraseña) {
        boolean correcto = false;
        if (contraseña.length() >= 8) {
            correcto = true;
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña invalida \n debe contener almenos 8 caracteres");
        }
        return correcto;
    }

    
    public double numeroAleatorioDouble(double inicio, double limite) {
    double numero = inicio + (limite - inicio) * random.nextDouble();
    return Math.round(numero * 100) / 100.0; // Redondear a 2 decimales
}


    public ArrayList generarAleatoriosReporte() {
        ArrayList<Double> mediciones = new ArrayList<>();
        mediciones.add(numeroAleatorioDouble(10, 30)); // Temperatura
        mediciones.add(numeroAleatorioDouble(35, 60)); // Humedad
        mediciones.add(numeroAleatorioDouble(1, 30)); // Velocidad del viento
        mediciones.add(numeroAleatorioDouble(0, 0.5)); // Precipitación
        mediciones.add(numeroAleatorioDouble(0, 8)); // Nubosidad
        mediciones.add(numeroAleatorioDouble(0, 1000)); // Radiación solar
        mediciones.add(numeroAleatorioDouble(950, 1050)); // Presión atmosférica
        return mediciones;
    }
    public Reporte generarReporte(){
        @SuppressWarnings("unchecked")
        ArrayList<Double> mediciones = generarAleatoriosReporte();
        Reporte reporte = new Reporte(mediciones.get(0), mediciones.get(1), mediciones.get(2), mediciones.get(3), 
        mediciones.get(4), mediciones.get(5), mediciones.get(6));
        return reporte;
    }
}
