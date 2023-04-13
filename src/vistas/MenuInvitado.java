package vistas;

import conexion.Conexion;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.*;
import modelo.clsFunciones;

public class MenuInvitado extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();
    clsFunciones funciones = new clsFunciones();


    public MenuInvitado(String tipo) {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JLabel();

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 120, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Generar Reporte");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/generarReporte.png"))); // NOI18N
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String[] args) {
        MenuInvitado in = new MenuInvitado("");
        in.setVisible(true);
    }
    private void btn_salir_JFInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_JFInicioMouseClicked
        this.dispose();
        InicioDeSesion i = new InicioDeSesion();
        i.setVisible(true);

    }//GEN-LAST:event_btn_salir_JFInicioMouseClicked
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnGenerarReporte;
    private javax.swing.JLabel btn_salir_JFInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMenude;
    // End of variables declaration//GEN-END:variables
}
