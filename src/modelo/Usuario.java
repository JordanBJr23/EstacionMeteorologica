
package modelo;


public  class Usuario {
  private String id;
  private String nombre;
  private int edad;
  private String tipo;
  private String contrasena;

    public Usuario(String id, String nombre, int edad, String tipo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + edad + " " + tipo + " " + contrasena;
    }
     
   
}
