
package examenlab2p2_fernandopadilla;

import java.util.Date;


public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
    }

    public Single(Cancion cancion, String titulo, Date fechaL, int contLikes) {
        super(titulo, fechaL, contLikes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.getTitulo();
    }

   
    
    
}
