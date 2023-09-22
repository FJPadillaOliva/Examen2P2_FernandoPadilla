
package examenlab2p2_fernandopadilla;

import java.util.ArrayList;


public class Cliente extends Usuario{
    private ArrayList<Cancion> Favoritas = new ArrayList();
    private ArrayList<PlayList> playlists = new ArrayList();
    private ArrayList<Cancion> MeGusta = new ArrayList();

    public Cliente() {
    }

    public Cliente(String username, String password, int edad) {
        super(username, password, edad);
    }

    public ArrayList<Cancion> getFavoritas() {
        return Favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> Favoritas) {
        this.Favoritas = Favoritas;
    }

    public ArrayList<PlayList> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<PlayList> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Cancion> getMeGusta() {
        return MeGusta;
    }

    public void setMeGusta(ArrayList<Cancion> MeGusta) {
        this.MeGusta = MeGusta;
    }

    @Override
    public String toString() {
        return super.getUsername();
    }
    
    
}
