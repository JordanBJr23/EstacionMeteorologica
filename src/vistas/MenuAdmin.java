package vistas;

import conexion.Conexion;
import java.sql.*;
import javax.swing.*;
import modelo.clsFunciones;

public class MenuAdmin extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();
    clsFunciones funciones = new clsFunciones();

    public MenuAdmin(String id, String nombre, int edad, String tipo, String contraseña) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.avisoId.setVisible(false);
        this.avisoNombre.setVisible(false);
        this.avisoEdad.setVisible(false);
        this.avisoContraseña.setVisible(false);
        this.txtId.setText(id);
        this.txtNombre.setText(nombre);
        this.txtEdad.setText(Integer.toString(edad));
        this.jCPuesto.setSelectedItem(tipo);
        this.txtContraseña.setText(contraseña);
        this.txtId.setEditable(false);
        this.btnEditar.setEnabled(true);
        this.btnRegistrar.setVisible(false);
        this.btnRegistrar.setEnabled(false);

    }

    public MenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.avisoId.setVisible(false);
        this.avisoNombre.setVisible(false);
        this.avisoEdad.setVisible(false);
        this.avisoContraseña.setVisible(false);
        this.btnEditar.setVisible(false);
        this.btnEditar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
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
        jLabel16 = new javax.swing.JLabel();
        avisoEdad = new javax.swing.JLabel();
        avisoContraseña = new javax.swing.JLabel();
        avisoId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCPuesto = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JLabel();

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
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("REGISTRO");
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Contraseña:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 120, -1, -1));

        jCPuesto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Investigador", " " }));
        jPanel1.add(jCPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String[] args) {
        MenuAdmin in = new MenuAdmin();
        in.setVisible(true);
    }
    private void btn_salir_JFInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_JFInicioMouseClicked
        this.dispose();
        MenuAdministrador i = new MenuAdministrador();
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

    private void agregar() {
        camposVacios();
        int edad = 0;
        String id = txtId.getText();
        String nombre = txtNombre.getText();
        if (txtEdad.getText().length() > 1) {
            edad = Integer.parseInt(txtEdad.getText());
        }
        String contraseña = txtContraseña.getText();
        String tipo = jCPuesto.getSelectedItem().toString();
        if (validarDatos(id, nombre, edad, contraseña)) {
            System.out.println("aqui no llega");
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
                MenuAdministrador i = new MenuAdministrador();
                i.setVisible(true);

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }

    }

    private void editar() {
        int edad = 0;
        String id = txtId.getText();
        String nombre = txtNombre.getText();
        if (txtEdad.getText().length() > 1) {
            edad = Integer.parseInt(txtEdad.getText());
        }
        String contraseña = txtContraseña.getText();
        String tipo = jCPuesto.getSelectedItem().toString();
        if (validarDatos("abcdfghij", nombre, edad, contraseña)) {
            try {
                Connection conexion = conectar.conectar();
                PreparedStatement modificar = conexion.prepareStatement("UPDATE  empleados SET nombre = ?, edad = ?, tipo = ?, contraseña = ?  WHERE id = " + id);
                modificar.setString(1, nombre);
                modificar.setInt(2, edad);
                modificar.setString(3, tipo);
                modificar.setString(4, contraseña);
                modificar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado editada correctamente");
                this.dispose();
                conectar.cerrarConexion();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }

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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
        MenuAdministrador m = new MenuAdministrador();
        m.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        agregar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoContraseña;
    private javax.swing.JLabel avisoEdad;
    private javax.swing.JLabel avisoId;
    private javax.swing.JLabel avisoNombre;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel btn_salir_JFInicio;
    private javax.swing.JComboBox<String> jCPuesto;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
