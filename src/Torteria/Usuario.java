/*
* 2026 ITESS-TICS
*
* Periodo: Enero-Junio
* Asignatura: Programasion orientada a objetos 
* Dosente: Francisco Javier Montesillo Puente
* Descripsion : Creacion de la clase Usuario para el manejo de 
* credenciales unicas dentro del sistema de torteria.
* * -------------------------------------------------------------------------
* | Usuario
* -------------------------------------------------------------------------
* | - usuario: String
* -------------------------------------------------------------------------
* | + Usuario()
* | + Usuario(usuario: String)
* |
* | + getUsuario(): String
* | + setUsuario(usuario: String): void
* | + toString(): String
* -------------------------------------------------------------------------
* |  
* | 
* -------------------------------------------------------------------------
* Intento de Programador: AMPM 
* Fecha: 21-abril-2026
*/
package Torteria;

public class Usuario {

    private String usuario; //unico

    public Usuario() {

    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + '}';
    }

}
