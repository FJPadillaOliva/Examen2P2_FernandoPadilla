
package examenlab2p2_fernandopadilla;

import java.io.Serializable;
import java.util.ArrayList;


public class PlayList implements Serializable{
    private String nombreP;
    private int contLikes;
    private ArrayList<Cancion> canciones = new ArrayList();

    public PlayList() {
    }

    public PlayList(String nombreP, int contLikes) {
        this.nombreP = nombreP;
        this.contLikes = contLikes;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getContLikes() {
        return contLikes;
    }

    public void setContLikes(int contLikes) {
        this.contLikes = contLikes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombreP + ", " + contLikes + "Me Gusta, " + canciones.size() + " canciones";
    }
    
    
    
    
}
