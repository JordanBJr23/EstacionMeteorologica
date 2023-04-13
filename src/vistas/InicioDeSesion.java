package vistas;

import conexion.Conexion;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;

public class InicioDeSesion extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();

    public InicioDeSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_salir_JFInicio = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        jlAqui = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBorder(null);
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 250, 30));

        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 250, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario-de-perfil.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrasena.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        btn_salir_JFInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btn_salir_JFInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salir_JFInicioMouseClicked(evt);
            }
        });
        jPanel1.add(btn_salir_JFInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar-sesion.png"))); // NOI18N
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jlAqui.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlAqui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAqui.setText("Aquí");
        jlAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAquiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlAquiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlAquiMouseExited(evt);
            }
        });
        jPanel1.add(jlAqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 40, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALIR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 50, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 250, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 250, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -70, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INICIAR SESION");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Centro Meteorológico");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REGISTRATE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("¿NO TIENES CUENTA?");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
       String tipo = verificarDatos();
        if (!tipo.equals("")) {
            Menu m = new Menu(tipo);
            this.dispose();
            m.setVisible(true);
        }
       
    }//GEN-LAST:event_btn_loginMouseClicked
    public static void main(String[] args) {
        InicioDeSesion in = new InicioDeSesion();
        in.setVisible(true);
    }
    private void btn_salir_JFInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_JFInicioMouseClicked
        this.dispose();
        System.exit(0);

    }//GEN-LAST:event_btn_salir_JFInicioMouseClicked
private String verificarDatos(){
    String correcto = "";
     String user = txtUser.getText();
        String contraseña = txtContraseña.getText();
        try {
            Connection conectar = this.conectar.conectar();
            PreparedStatement consultar = conectar.prepareStatement("SELECT * FROM empleados where id = ? AND contraseña = ?");
            consultar.setString(1, user);
            consultar.setString(2, contraseña);
            ResultSet resultadoConsulta = consultar.executeQuery();
            if (resultadoConsulta.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Usuario y contraseña validos");
                  resultadoConsulta.next();
                   correcto = resultadoConsulta.getString("tipo");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y contraseña invalidos");
            }
            this.conectar.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    return correcto;
}
    private void jlAquiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAquiMouseEntered
        jlAqui.setForeground(Color.BLUE);
        Border border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLUE);
        jlAqui.setBorder(border);
    }//GEN-LAST:event_jlAquiMouseEntered

    private void jlAquiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAquiMouseExited
        jlAqui.setForeground(Color.BLACK);
        Border border = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLUE);
        jlAqui.setBorder(border);
    }//GEN-LAST:event_jlAquiMouseExited

    private void jlAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAquiMouseClicked
        this.dispose();
       RegistroDeInvitado i = new RegistroDeInvitado();
       i.setVisible(true);
    }//GEN-LAST:event_jlAquiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_login;
    private javax.swing.JLabel btn_salir_JFInicio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlAqui;
    public static javax.swing.JPasswordField txtContraseña;
    public static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
