
package modelo;


public class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
    
    public static boolean esNumero (String numero){
        boolean esnumero = false;
        try {
           Integer.parseInt(numero);
           esnumero = true;
        } catch (NumberFormatException e) {
            System.out.println("DIGITE EL NUMERO DEL REPORTE");
        }
        return esnumero;
    }
}




