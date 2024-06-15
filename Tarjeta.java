/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 01-Abril-2024 
 */
public class Tarjeta {
    private long numeroTarjeta;
    private String fechaCaducidad;
    private String titular;
    private String emisor;
    private int cvv;

    // Constructor por omisión
    public Tarjeta() {
        this.numeroTarjeta = 0L;
        this.fechaCaducidad = "";
        this.titular = "";
        this.emisor = "";
        this.cvv = 0;
    }

    // Constructor por parámetros
    public Tarjeta(long numeroTarjeta, String fechaCaducidad, String titular, String emisor, int cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.titular = titular;
        this.emisor = emisor;
        this.cvv = cvv;
    }

    // Constructor por copia
    public Tarjeta(Tarjeta t) {
        this.numeroTarjeta = t.numeroTarjeta;
        this.fechaCaducidad = t.fechaCaducidad;
        this.titular = t.titular;
        this.emisor = t.emisor;
        this.cvv = t.cvv;
    }

    // Métodos de acceso y modificación
    public long obtenerNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void asignarNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String obtenerFechaCaducidad() {
        return fechaCaducidad;
    }

    public void asignarFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String obtenerTitular() {
        return titular;
    }

    public void asignarTitular(String titular) {
        this.titular = titular;
    }

    public String obtenerEmisor() {
        return emisor;
    }

    public void asignarEmisor(String emisor) {
        this.emisor = emisor;
    }

    public int obtenerCvv() {
        return cvv;
    }

    public void asignarCvv(int cvv) {
        this.cvv = cvv;
    }

    // Sobrescribir toString
    @Override
    public String toString() {
        return "Tarjeta{" +
                "numeroTarjeta=" + numeroTarjeta +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                ", titular='" + titular + '\'' +
                ", emisor='" + emisor + '\'' +
                ", cvv=" + cvv +
                '}';
    }

    // Sobrescribir equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tarjeta tarjeta = (Tarjeta) obj;
        return numeroTarjeta == tarjeta.numeroTarjeta &&
                cvv == tarjeta.cvv &&
                fechaCaducidad.equals(tarjeta.fechaCaducidad) &&
                titular.equals(tarjeta.titular) &&
                emisor.equals(tarjeta.emisor);
    }
}

