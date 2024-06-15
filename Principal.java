/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 01-Abril-2024 
 */

public class Principal {
    public static void main(String[] args) {
        // Crear billetes
        Billete b1 = new Billete(50, "Personaje1", "12345678901");
        Billete b2 = new Billete(100, "Personaje2", "12345678902");
        Billete b3 = new Billete(200, "Personaje3", "12345678903");
        Billete b4 = new Billete(500, "Personaje4", "12345678904");

        // Crear tarjetas
        Tarjeta t1 = new Tarjeta(1234567812345678L, "12-12-2024", "Juan Perez", "Banco1", 123);
        Tarjeta t2 = new Tarjeta(8765432187654321L, "10-10-2025", "Ana Lopez", "Banco2", 456);
        Tarjeta t3 = new Tarjeta(1122334455667788L, "08-08-2023", "Carlos Diaz", "Banco3", 789);

        // Crear carteras
        Cartera cartera1 = new Cartera(b1, b2, b3, b4, t1, t2, t3, "Cuero", 5);
        Cartera cartera2 = new Cartera(b1, b2, b3, b4, t1, t2, t3, "Cuero", 5);
        Cartera cartera3 = new Cartera(b3, b4, b1, b2, t2, t3, t1, "Sintético", 4);

        // Modificar valores null
        cartera1.asignarT3(null);
        cartera2.asignarT3(null);

        // Verificar igualdad
        System.out.println("¿Cartera1 es igual a Cartera2?: " + cartera1.equals(cartera2));
        System.out.println("¿Cartera1 es igual a Cartera3?: " + cartera1.equals(cartera3));

        // Imprimir información de las carteras
        System.out.println(cartera1);
        System.out.println(cartera2);
        System.out.println(cartera3);
    }
}
