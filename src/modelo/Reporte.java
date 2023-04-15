package modelo;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Reporte {

    private double temperatura;
    private double humedad;
    private double vViento;
    private double precipitacion;
    private double nubosidad;
    private double radiacionSolar;
    private double presionAtmosferica;
    java.sql.Timestamp fechaActual;
    public Reporte(double temperatura, double humedad, double vViento, double precipitacion, double nubosidad, double radiacionSolar, double presionAtmosferica) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.vViento = vViento;
        this.precipitacion = precipitacion;
        this.nubosidad = nubosidad;
        this.radiacionSolar = radiacionSolar;
        this.presionAtmosferica = presionAtmosferica;
        LocalDateTime fechaGenerica = LocalDateTime.now();
        this.fechaActual = java.sql.Timestamp.valueOf(fechaGenerica); // CONVIERTE A FORMATO SQL
        
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public double getvViento() {
        return vViento;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public double getNubosidad() {
        return nubosidad;
    }

    public double getRadiacionSolar() {
        return radiacionSolar;
    }

    public double getPresionAtmosferica() {
        return presionAtmosferica;
    }

    public Timestamp getFechaActual() {
        return fechaActual;
    }
    
    @Override
    public String toString() {
        return " Reporte fecha y hora: " + fechaActual.toString()
                + "\n Temperatura: " + temperatura + " grados Celsius"
                + "\n Humedad: " + humedad + " %HR"
                + "\n Volumen del viento: " + vViento + " metros por segundo"
                + "\n Precipitacion: " + precipitacion + " pulgadas por hora (in/h)"
                + "\n Nubosidad: " + nubosidad + " octas"
                + "\n Radiacion solar: " + radiacionSolar + " vatios por metro cuadrado"
                + "\n Presion atmosferica: " + presionAtmosferica + " pascales";
                
    }

}
