package vistas;

import conexion.Conexion;
import javax.swing.*;
import modelo.MiExcepcion;
import modelo.Reporte;
import modelo.clsFunciones;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuInvestigador extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();
    clsFunciones funciones = new clsFunciones();

    public MenuInvestigador(String tipo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.labelMenude.setText("Menu de: " + tipo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_salir_JFInicio = new javax.swing.JLabel();
        labelMenude = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarEmpleado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLista = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_salir_JFInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btn_salir_JFInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salir_JFInicioMouseClicked(evt);
            }
        });
        jPanel1.add(btn_salir_JFInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        labelMenude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMenude.setText("Menu de: ");
        jPanel1.add(labelMenude, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALIR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 50, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ver lista de reportes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/generarReporte2.png"))); // NOI18N
        btnGenerarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarReporteMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Generar Reporte");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnAgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarEmpleado.png"))); // NOI18N
        jPanel1.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Agregar Reporte");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Editar reporte");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Eliminar reporte");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Buscar reporte");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        btnLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jPanel1.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 120, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String[] args) {
        MenuInvestigador in = new MenuInvestigador("");
        in.setVisible(true);
    }
    private void btn_salir_JFInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_JFInicioMouseClicked
        this.dispose();
        InicioDeSesion i = new InicioDeSesion();
        i.setVisible(true);

    }//GEN-LAST:event_btn_salir_JFInicioMouseClicked
    private void guardarReporte(Reporte reporte) throws MiExcepcion {
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement guardar = conexion.prepareStatement("Insert into reporte values(?,?,?,?,?,?,?,?,?) ");
            guardar.setString(1, "0");
            guardar.setDouble(2, reporte.getTemperatura());
            guardar.setDouble(3, reporte.getHumedad());
            guardar.setDouble(4, reporte.getvViento());
            guardar.setDouble(5, reporte.getPrecipitacion());
            guardar.setDouble(6, reporte.getNubosidad());
            guardar.setDouble(7, reporte.getRadiacionSolar());
            guardar.setDouble(8, reporte.getPresionAtmosferica());
            guardar.setTimestamp(9, reporte.getFechaActual());
            guardar.executeUpdate(); // hacemos la petionc
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            conectar.cerrarConexion();

        } catch (SQLException e) {
            throw new MiExcepcion("Error al guardar el reporte", e);
        }
    }
    private void btnGenerarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporteMouseClicked
        Reporte reporte = funciones.generarReporte();
        try {
            guardarReporte(reporte);
        } catch (MiExcepcion ex) {
            System.err.println(ex);
        }
        JOptionPane.showMessageDialog(null, reporte);

    }//GEN-LAST:event_btnGenerarReporteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarEmpleado;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGenerarReporte;
    private javax.swing.JLabel btnLista;
    private javax.swing.JLabel btn_salir_JFInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMenude;
    // End of variables declaration//GEN-END:variables
}
