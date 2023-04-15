package vistas;

import conexion.Conexion;
import java.sql.*;
import javax.swing.*;
import modelo.clsFunciones;

public class RegistroDeInvitado extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();
    clsFunciones funciones = new clsFunciones();

    public RegistroDeInvitado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.avisoId.setVisible(false);
        this.avisoNombre.setVisible(false);
        this.avisoEdad.setVisible(false);
        this.avisoContraseña.setVisible(false);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_salir_JFInicio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        avisoNombre = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        avisoEdad = new javax.swing.JLabel();
        avisoContraseña = new javax.swing.JLabel();
        avisoId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        btn_salir_JFInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btn_salir_JFInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salir_JFInicioMouseClicked(evt);
            }
        });
        jPanel1.add(btn_salir_JFInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALIR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 50, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Edad:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 120, -1));

        avisoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoNombre.setForeground(new java.awt.Color(255, 0, 0));
        avisoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avisoNombre.setText("*");
        jPanel1.add(avisoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 50, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ID:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Contraseña:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nombre:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 210, -1));

        txtId.setBorder(null);
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, -1));

        txtEdad.setBorder(null);
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 210, 10));

        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 210, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 210, 10));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("REGISTRATE");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));

        avisoEdad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoEdad.setForeground(new java.awt.Color(255, 0, 0));
        avisoEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avisoEdad.setText("*");
        jPanel1.add(avisoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 50, 20));

        avisoContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoContraseña.setForeground(new java.awt.Color(255, 0, 0));
        avisoContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avisoContraseña.setText("*");
        jPanel1.add(avisoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 50, 20));

        avisoId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoId.setForeground(new java.awt.Color(255, 0, 0));
        avisoId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avisoId.setText("*");
        jPanel1.add(avisoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 50, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 120, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_salir_JFInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_JFInicioMouseClicked
        this.dispose();
        InicioDeSesion i = new InicioDeSesion();
        i.setVisible(true);

    }//GEN-LAST:event_btn_salir_JFInicioMouseClicked
    private void camposVacios() {
        JTextField[] camposTexto = {txtId, txtNombre, txtEdad, txtContraseña};
        JLabel[] avisos = {avisoId, avisoNombre, avisoEdad, avisoContraseña};

        for (int i = 0; i < camposTexto.length; i++) {
            if (camposTexto[i].getText().length() == 0) {
                avisos[i].setVisible(true);
            } else {
                avisos[i].setVisible(false);
            }
        }

    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        camposVacios();
        int edad = 0;
        String id = txtId.getText();
        String nombre = txtNombre.getText();
        if (txtEdad.getText().length() > 1) {
            edad = Integer.parseInt(txtEdad.getText());
        }
        String contraseña = txtContraseña.getText();
        String tipo = "Invitado";
        if (validarDatos(id, nombre, edad, contraseña)) {
            try {

                Connection conexion = conectar.conectar();
                PreparedStatement insertar = conexion.prepareStatement("Insert into empleados values(?,?,?,?,?)"); // realiza la petición
                insertar.setString(1, id);
                insertar.setString(2, nombre);
                insertar.setInt(3, edad);
                insertar.setString(4, tipo);
                insertar.setString(5, contraseña);
                insertar.executeUpdate(); // hacemos la petioncion
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                conectar.cerrarConexion();
                this.dispose();
                InicioDeSesion i = new InicioDeSesion();
                i.setVisible(true);

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed
    private boolean validarDatos(String id, String nombre, int edad, String contraseña) {
        boolean correcto = false;
        if (funciones.validarId(id) && funciones.validarNombre(nombre) && funciones.validarEdad(edad)
                && funciones.validarContraseña(contraseña)) {
            correcto = true;
        }
        return correcto;

    }
    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtNombreKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoContraseña;
    private javax.swing.JLabel avisoEdad;
    private javax.swing.JLabel avisoId;
    private javax.swing.JLabel avisoNombre;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel btn_salir_JFInicio;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
