
package Torteria;
public class OrdenTest {
    public static void main(String[] args) {

        try {
            Usuario u = new Usuario("Mario");

            Torta t = new Torta();
            t.setNombre("Vainilla");
            t.setPrecio(100);

            Pedidos p = new Pedidos(u, t);

            Orden o = new Orden(p, 1);

            System.out.println(o);

            o.pagar();
            System.out.println("Despues de pagar:");
            System.out.println(o);

            o.cambiarEstatus("entregado");
            System.out.println("Despues de entregar:");
            System.out.println(o);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}