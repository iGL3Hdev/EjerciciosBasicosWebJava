

package POO.Ejercicio2;


public class Tablero {
    
    private int x;
    private int y;
    
    public Tablero( int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(){
        this.y = y;
    }
    
    
    public void moverArriva(int incremento){
        y += incremento;
    }
    
    public void moverAbajo(int incremento){
        y -= incremento;
    }
    
    public void moverDerecha(int incremento){
        x += incremento;
    }
    
    public void moverIzquierda(int incremento){
        x -= incremento;
    }

}
