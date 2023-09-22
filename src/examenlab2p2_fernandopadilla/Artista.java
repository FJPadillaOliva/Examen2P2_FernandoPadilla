
package examenlab2p2_fernandopadilla;

import java.util.ArrayList;


public class Artista extends Usuario{
    private String nombreA;
    private ArrayList<Single> cancionesS = new ArrayList();
    private ArrayList<Album> albumesP = new ArrayList();

    public Artista() {
    }

    public Artista(String nombreA, String username, String password, int edad) {
        super(username, password, edad);
        this.nombreA = nombreA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public ArrayList<Single> getCancionesS() {
        return cancionesS;
    }

    public void setCancionesS(ArrayList<Single> cancionesS) {
        this.cancionesS = cancionesS;
    }

    public ArrayList<Album> getAlbumesP() {
        return albumesP;
    }

    public void setAlbumesP(ArrayList<Album> albumesP) {
        this.albumesP = albumesP;
    }

    @Override
    public String toString() {
        return  nombreA + ", " + cancionesS.size() + " lanzamientos";
    }
    
    
}
