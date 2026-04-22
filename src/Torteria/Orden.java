
package Torteria;
public class Orden {

    private Pedidos pedido;
    private int prioridad;
    private boolean pago;
    private String estatus;

    public Orden(Pedidos pedido, int prioridad) {
        this.pedido = pedido;
        this.prioridad = prioridad;
        this.pago = false;
        this.estatus = "cocina";
    }

    public void pagar() {
        this.pago = true;
        this.estatus = "pagado";
    }

    public void cambiarEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isPago() {
        return pago;
    }

    public String getEstatus() {
        return estatus;
    }

    @Override
    public String toString() {
        return "Orden[usuario=" + pedido.getNombreDeUsuario() +
               ", torta=" + pedido.getNombreDeTorta() +
               ", prioridad=" + prioridad +
               ", estatus=" + estatus +
               ", pago=" + pago + "]";
    }
}