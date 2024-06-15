/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 01-Abril-2024 
 */

import java.util.Objects;

public class Cartera {
    private Billete b1, b2, b3, b4;
    private Tarjeta t1, t2, t3;
    private String material;
    private int apartados;

    public Cartera(Billete b1, Billete b2, Billete b3, Billete b4, Tarjeta t1, Tarjeta t2, Tarjeta t3, String material, int apartados) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.material = material;
        this.apartados = apartados;
    }

    public void asignarT3(Tarjeta t3) {
        this.t3 = t3;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cartera cartera = (Cartera) obj;
        return apartados == cartera.apartados &&
                Objects.equals(b1, cartera.b1) &&
                Objects.equals(b2, cartera.b2) &&
                Objects.equals(b3, cartera.b3) &&
                Objects.equals(b4, cartera.b4) &&
                Objects.equals(t1, cartera.t1) &&
                Objects.equals(t2, cartera.t2) &&
                Objects.equals(t3, cartera.t3) &&
                Objects.equals(material, cartera.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(b1, b2, b3, b4, t1, t2, t3, material, apartados);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cartera:\n");
        sb.append("Material: ").append(material).append("\n");
        sb.append("Apartados: ").append(apartados).append("\n");
        sb.append("Billetes:\n");
        sb.append("  b1: ").append(b1).append("\n");
        sb.append("  b2: ").append(b2).append("\n");
        sb.append("  b3: ").append(b3).append("\n");
        sb.append("  b4: ").append(b4).append("\n");
        sb.append("Tarjetas:\n");
        sb.append("  t1: ").append(t1).append("\n");
        sb.append("  t2: ").append(t2).append("\n");
        sb.append("  t3: ").append(t3).append("\n");
        return sb.toString();
    }
}
