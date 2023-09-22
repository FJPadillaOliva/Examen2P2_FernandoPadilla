
package examenlab2p2_fernandopadilla;

import java.util.Date;


public class Lanzamiento {
   private String titulo;
   private Date fechaL;
   private int contLikes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, Date fechaL, int contLikes) {
        this.titulo = titulo;
        this.fechaL = fechaL;
        this.contLikes = contLikes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaL() {
        return fechaL;
    }

    public void setFechaL(Date fechaL) {
        this.fechaL = fechaL;
    }

    public int getContLikes() {
        return contLikes;
    }

    public void setContLikes(int contLikes) {
        this.contLikes = contLikes;
    }

    @Override
    public String toString() {
        return  titulo;
    }
   
   
}
