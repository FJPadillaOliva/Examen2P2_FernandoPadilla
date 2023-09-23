
package examenlab2p2_fernandopadilla;

import java.util.ArrayList;
import java.util.Date;


public class Album extends Lanzamiento {
    private ArrayList<Cancion> canciones = new ArrayList();
    private int cantC;

    public Album() {
    }

    public Album(int cantC, String titulo, Date fechaL, int contLikes) {
        super(titulo, fechaL, contLikes);
        this.cantC = this.canciones.size();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
        this.cantC = canciones.size();
    }

    public int getCantC() {
        return cantC;
    }

    @Override
    public String toString() {
        return super.getTitulo() +", " +cantC + " canciones";
    }

    
    
    
}
