/*
*    2026 ITESS-TICS
*
* Periodo: Enero-Junio
* Asignatura:Programasion orientada a objetos 
* Dosente: Francisco Javier Montesillo Puente
* Descripsion : Crear una app de escritorio donde se utilizar los conceptos de 
* clases y objetos donde crear un flujo para un lugar donde vendan tortas
*             
*   -------------------------------------------------------------------------
*   | Torta
*   -------------------------------------------------------------------------
*   | -nombre: String
*   | -ingredientes: String
*   | -precio: Float
*   -------------------------------------------------------------------------
*   | +Tortas();
*   |+Tortas(Nombre: String, Ingredinetes: String[], precio: Float
*   |+Torta(nombre: String)
*   |
*   |+getNombre()String
*   |+setNombre(nombre: String):void
*   |+agregarIngrediente(String: ingredientes):void
*   |+toString():String
*   -------------------------------------------------------------------------
*   |  
*   | 
*   -------------------------------------------------------------------------
* Intento de Programador: AMPM 
* Fecha: 21-abril-2026
*/
package Torteria;

public class Torta {
    private final int Max_Ingredientes = 10;
    private String name ;
    private String [] ingredientes ; 
    private int numeroIngredientes;
    private float presio ;
    
    public Torta (){
       ingredientes= new String[Max_Ingredientes];
       numeroIngredientes=0;
    }

    public Torta(String name, String[] ingredientes, float presio) {
        this.name = name;
        this.ingredientes = ingredientes;
        this.presio = presio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setNumeroIngredientes(int numeroIngredientes) {
        this.numeroIngredientes = numeroIngredientes;
    }

    public void setPresio(float presio) {
        this.presio = presio;
    }

    @Override
    public String toString() {
                    String listaDeIngredientes="";
        if (ingredientes !=null){
            for(int i=0;i<numeroIngredientes;i++)
                listaDeIngredientes+=ingredientes[i]==null?"":ingredientes[i]+
                        ",";
        }
        return "Torta{" + "Max_Ingredientes=" + Max_Ingredientes + 
                ", name=" + name + ", ingredientes=" + ingredientes + 
                ", numeroIngredientes=" + numeroIngredientes + 
                ", presio=" + presio + '}';
    }

  
   public void agregarIngredientes(String ingrediente)throws Exception{
        if ( numeroIngredientes >=Max_Ingredientes){
        System.out.println("solo puedes pojer 10 ingredientes");
        throw new Exception("Maxima cantidad de ingredientes");
        }
        
        ingredientes [numeroIngredientes]= ingrediente;
        numeroIngredientes++;
   }
    }
    
 
