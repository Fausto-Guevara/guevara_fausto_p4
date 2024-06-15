/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 01-Abril-2024 
 */

public class Billete {
    private int denominacionBillete;
    private String imagenFigurativa;
    private String numeroSerie;

    // Constructor por omisión
    public Billete() {
        this.denominacionBillete = 0;
        this.imagenFigurativa = "";
        this.numeroSerie = "";
    }

    // Constructor por parámetros
    public Billete(int denominacionBillete, String imagenFigurativa, String numeroSerie) {
        this.denominacionBillete = denominacionBillete;
        this.imagenFigurativa = imagenFigurativa;
        this.numeroSerie = numeroSerie;
    }

    // Constructor por copia
    public Billete(Billete b) {
        this.denominacionBillete = b.denominacionBillete;
        this.imagenFigurativa = b.imagenFigurativa;
        this.numeroSerie = b.numeroSerie;
    }

    // Métodos de acceso y modificación
    public int obtenerDenominacionBillete() {
        return denominacionBillete;
    }

    public void asignarDenominacionBillete(int denominacionBillete) {
        this.denominacionBillete = denominacionBillete;
    }

    public String obtenerImagenFigurativa() {
        return imagenFigurativa;
    }

    public void asignarImagenFigurativa(String imagenFigurativa) {
        this.imagenFigurativa = imagenFigurativa;
    }

    public String obtenerNumeroSerie() {
        return numeroSerie;
    }

    public void asignarNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Sobrescribir toString
    @Override
    public String toString() {
        return "Billete{" +
                "denominacionBillete=" + denominacionBillete +
                ", imagenFigurativa='" + imagenFigurativa + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }

    // Sobrescribir equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Billete billete = (Billete) obj;
        return denominacionBillete == billete.denominacionBillete &&
                imagenFigurativa.equals(billete.imagenFigurativa) &&
                numeroSerie.equals(billete.numeroSerie);
    }
}
