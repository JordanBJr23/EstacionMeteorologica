package vistas;

import conexion.Conexion;
import javax.swing.*;
import modelo.MiExcepcion;
import modelo.Reporte;
import modelo.clsFunciones;
import java.sql.*;

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
        btnGenerarReporte = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
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

        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/generarReporte2.png"))); // NOI18N
        btnGenerarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarReporteMouseClicked(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Generar Reporte");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Eliminar reporte");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Buscar reporte");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, 20));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 120, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String id = JOptionPane.showInputDialog("Digite el id del reporte");
        if (id != null && !id.isEmpty()) {

            if (MiExcepcion.esNumero(id)) {
                int idBuscar = Integer.parseInt(id);
                try {
                    Connection conexion = conectar.conectar();
                    PreparedStatement buscar = conexion.prepareStatement("SELECT * FROM reporte where id = ?");
                    buscar.setInt(1, idBuscar);
                    ResultSet resultadoQuery = buscar.executeQuery();

                    boolean existe = false;
                    while (resultadoQuery.next()) {
                        existe = true;
                        JOptionPane.showMessageDialog(null, "Reporte encontrado");
                        JOptionPane.showMessageDialog(null, "ID: " + resultadoQuery.getInt(1)
                                + "\nTemperatura: " + resultadoQuery.getString(2)
                                + "\nHumedad: " + resultadoQuery.getString(3)
                                + "\nVelocidad del viento: " + resultadoQuery.getString(4)
                                + "\nPrecipitacion: " + resultadoQuery.getString(5)
                                + "\nNubosidad: " + resultadoQuery.getString(6)
                                + "\nRadiacion solar: " + resultadoQuery.getString(7)
                                + "\nPresion atmosferica: " + resultadoQuery.getString(8)
                                + "\nFecha y hora: " + resultadoQuery.getTimestamp(9));
                    }
                    if (!existe) {
                        JOptionPane.showMessageDialog(null, "Reporte no encontrado");
                    }
                    conectar.cerrarConexion();

                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        String id = JOptionPane.showInputDialog("Digite el ID del del reporte que desea eliminar");
        if (id != null && !id.isEmpty()) {

            try {
                Connection conexion = conectar.conectar();
                PreparedStatement eliminar = conexion.prepareStatement("DELETE FROM reporte WHERE id = ?");
                PreparedStatement buscar = conexion.prepareStatement("SELECT * FROM reporte WHERE id = ?");
                eliminar.setString(1, id);
                buscar.setString(1, id);
                ResultSet consulta = buscar.executeQuery();
                boolean existe = false;
                int opcion = -1;
                while (consulta.next()) {
                    existe = true;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar el reporte: " + consulta.getString("id"));
                }
                if (existe) {
                    if (opcion == 0) {
                        eliminar.executeUpdate(); // ejecutamos la peticion
                        JOptionPane.showMessageDialog(null, "Reporte eliminado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Reporte no eliminado");

                    }

                } else if (id.equals("")) {

                } else {
                    JOptionPane.showMessageDialog(null, "Reporte no registrado");

                }
                conectar.cerrarConexion();

            } catch (SQLException ex) {
                System.out.println(ex);

            }
        }

    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGenerarReporte;
    private javax.swing.JLabel btn_salir_JFInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMenude;
    // End of variables declaration//GEN-END:variables
}
