
package modelo;


public class Administrador extends Usuario {
    
    public Administrador(String id, String nombre, int edad, String tipo, String contraseña) {
        super(id, nombre, edad, tipo, contraseña);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
