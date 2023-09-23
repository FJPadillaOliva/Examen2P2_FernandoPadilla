
package examenlab2p2_fernandopadilla;

import java.util.Date;


public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
        super();
    }

    public Single(String titulo, Date fechaL, int contLikes) {
        super(titulo, fechaL, contLikes);
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
