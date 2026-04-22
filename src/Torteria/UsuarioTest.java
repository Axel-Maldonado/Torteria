
package Torteria;

public class UsuarioTest {
    public static void main(String[] args) {

        try {
            Usuario u1 = new Usuario("Juan");
            Usuario u2 = new Usuario("Ana");

            System.out.println(u1);
            System.out.println(u2);

            // Intentar duplicado
            Usuario u3 = new Usuario("Juan");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}