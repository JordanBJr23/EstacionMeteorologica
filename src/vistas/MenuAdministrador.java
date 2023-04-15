package vistas;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import modelo.AccionesCRUD;
import modelo.Reporte;
import modelo.Usuario;
import modelo.clsFunciones;

public class MenuAdministrador extends javax.swing.JFrame implements AccionesCRUD {

    Conexion conectar = Conexion.getInstance();
    clsFunciones funciones = new clsFunciones();

    public MenuAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.labelMenude.setText("Menu de: Administrador");
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
        jLabel1.setText("Ver lista de empleados");
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
        btnAgregarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Agregar empleado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Editar empleado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Eliminar empleado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Buscar Empleado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        btnLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        btnLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaMouseClicked(evt);
            }
        });
        jPanel1.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String[] args) {
        MenuAdministrador in = new MenuAdministrador();
        in.setVisible(true);
    }
    private void btn_salir_JFInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_JFInicioMouseClicked
        this.dispose();
        InicioDeSesion i = new InicioDeSesion();
        i.setVisible(true);

    }//GEN-LAST:event_btn_salir_JFInicioMouseClicked
    // metodo para "descargar" la lista de la base de datos

    private ArrayList<Usuario> bajarbdEmpleados() {
        ArrayList<Usuario> bdEmpleados = new ArrayList<>();
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement descargar = conexion.prepareStatement("SELECT * FROM empleados");
            ResultSet consulta = descargar.executeQuery();
            while (consulta.next()) {
                String id = consulta.getString(1);
                String nombre = consulta.getString(2);
                int edad = consulta.getInt(3);
                String tipo = consulta.getString(4);
                String contraseña = consulta.getString(5);
                Usuario us = new Usuario(id, nombre, edad, tipo, contraseña);
                bdEmpleados.add(us);

            }
            conectar.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bdEmpleados;
    }

    // boton para ver la lista de empleados
    private void btnListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseClicked
        this.dispose();
        ArrayList<Usuario> bdEmpleados = bajarbdEmpleados();
        listaEmpleados lista = new listaEmpleados(bdEmpleados);
        lista.setVisible(true);

    }//GEN-LAST:event_btnListaMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoMouseClicked
        agregar();
    }//GEN-LAST:event_btnAgregarEmpleadoMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        buscar();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editar();

    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnGenerarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReporteMouseClicked
         Reporte reporte = funciones.generarReporte();
         JOptionPane.showMessageDialog(null, reporte);
        // TODO add your handling code here:
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

    @Override
    public void agregar() {
        this.dispose();
        MenuAdmin i = new MenuAdmin();
        i.setVisible(true);
    }

    @Override
    public void editar() {
        String idbuscar = JOptionPane.showInputDialog("Ingrese id del empleado");
        if (idbuscar != null && !idbuscar.isEmpty()) {

            String id = "", nombre = "", tipo = "", contraseña = "";
            int edad = 0;
            try {
                Connection conexion = conectar.conectar();
                PreparedStatement buscar = conexion.prepareStatement("Select * from empleados Where id = ?");
                buscar.setString(1, idbuscar);
                ResultSet b = buscar.executeQuery();
                boolean existe = false;
                while (b.next()) {
                    existe = true;
                    id = b.getString("id");
                    nombre = b.getString("nombre");
                    tipo = b.getString("tipo");
                    contraseña = b.getString("contraseña");
                    edad = b.getInt("edad");
                }
                if (existe) {
                    MenuAdmin m = new MenuAdmin(id, nombre, edad, tipo, contraseña);
                    m.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no registrado");
                }
                conectar.cerrarConexion();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }

    @Override
    public void eliminar() {
        String id = JOptionPane.showInputDialog("Digite el ID del empleado que desea eliminar");
        if (id != null && !id.isEmpty()) {

            try {
                Connection conexion = conectar.conectar();
                PreparedStatement eliminar = conexion.prepareStatement("DELETE FROM empleados WHERE id = ?");
                PreparedStatement buscar = conexion.prepareStatement("SELECT * FROM empleados WHERE id = ?");
                eliminar.setString(1, id);
                buscar.setString(1, id);
                ResultSet consulta = buscar.executeQuery();
                boolean existe = false;
                int opcion = -1;
                while (consulta.next()) {
                    existe = true;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar al empleado: " + consulta.getString("nombre"));
                }
                if (existe) {
                    if (opcion == 0) {
                        eliminar.executeUpdate(); // ejecutamos la peticion
                        JOptionPane.showMessageDialog(null, "Empleado eliminado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no eliminado");

                    }

                } else if (id.equals("")) {

                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no registrado");

                }
                conectar.cerrarConexion();

            } catch (SQLException ex) {
                System.out.println(ex);

            }
        }
    }

    @Override
    public void buscar() {
        String idbuscar = JOptionPane.showInputDialog("Ingrese id del empleado");
        if (idbuscar != null && !idbuscar.isEmpty()) {

            try {
                Connection conexion = conectar.conectar();
                PreparedStatement buscar = conexion.prepareStatement("Select * from empleados Where id = ?");
                buscar.setString(1, idbuscar);
                ResultSet consulta = buscar.executeQuery();
                boolean existe = false;
                while (consulta.next()) {
                    existe = true;
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    JOptionPane.showMessageDialog(null, " ID: " + consulta.getString("id")
                            + "\n Nombre: " + consulta.getString("nombre")
                            + "\n Edad: " + consulta.getInt("edad")
                            + "\n Tipo: " + consulta.getString("tipo"));

                }
                if (!existe) {
                    JOptionPane.showMessageDialog(null, "Empleado no registrado");

                }
                conectar.cerrarConexion();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }
}
