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

import java.util.HashSet;

public class Usuario {

    private static HashSet<String> nombresExistentes = new HashSet<>();
    private String nombre;

    public Usuario(String nombre) throws Exception {
        if (nombresExistentes.contains(nombre)) {
            throw new Exception("El usuario ya existe");
        }
        this.nombre = nombre;
        nombresExistentes.add(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombresExistentes.contains(nombre)) {
            throw new Exception("El usuario ya existe");
        }
        nombresExistentes.remove(this.nombre);
        this.nombre = nombre;
        nombresExistentes.add(nombre);
    }

    @Override
    public String toString() {
        return "Usuario[nombre=" + nombre + "]";
    }
}