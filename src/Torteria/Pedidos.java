
package Torteria;

public class Pedidos {

    private Usuario usuario;
    private Torta torta;

    public Pedidos(Usuario usuario, Torta torta) {
        this.usuario = usuario;
        this.torta = torta;
    }

    public String getNombreDeUsuario() {
        return usuario.getNombre();
    }

    public String getNombreDeTorta() {
        return torta.getNombre();
    }

    public float getPrecio() {
        return torta.getPrecio();
    }

    @Override
    public String toString() {
        return "Pedido[usuario=" + usuario.getNombre() +
               ", torta=" + torta.getNombre() +
               ", precio=" + torta.getPrecio() + "]";
    }
}