
package Torteria;
public class PedidoTest {
    public static void main(String[] args) {

        try {
            Usuario u = new Usuario("Luis");

            Torta t = new Torta();
            t.setNombre("Fresa");
            t.setPrecio(120);
            t.agregarIngrediente("Azucar");

            Pedidos p = new Pedidos(u, t);

            System.out.println(p);
            System.out.println("Usuario: " + p.getNombreDeUsuario());
            System.out.println("Torta: " + p.getNombreDeTorta());
            System.out.println("Precio: " + p.getPrecio());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}