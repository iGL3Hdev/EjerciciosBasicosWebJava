

package POO.Ejercicio4;


public class Atleta {
    
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;
    
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera){
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public int getNumeroAtleta(){
        return numeroAtleta;
    }
    
    public void setNumeroAtleta(int numeroAtleta){
        this.numeroAtleta = numeroAtleta;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public float getTiempoCarrera(){
        return tiempoCarrera;
    }
    
    public void setTiempoCarrera(int tiempoCarrera){
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public String mostrarDatosGanador(){
        return "Número del atleta: "+numeroAtleta+"\nNombre del atleta: "+nombre+
               " tiempo Carrera: "+tiempoCarrera+"\n";
               
    }

}
