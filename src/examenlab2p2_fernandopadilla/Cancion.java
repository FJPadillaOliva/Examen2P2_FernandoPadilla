
package examenlab2p2_fernandopadilla;


public class Cancion {
    private String titulo;
    private int duracion;
    private Album album;
    private Single single;
    private String referencia;

    public Cancion() {
    }

    public Cancion(String titulo, int duracion, Album album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = album.getTitulo();
    }
    
    public Cancion(String titulo, int duracion, Single single) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = single.getTitulo();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferenciaA(Album album) {
        this.referencia = album.getTitulo();
    }
    
    public void setReferenciaS(Single single) {
        this.referencia = single.getTitulo();
    }

    @Override
    public String toString() {
        return  titulo + ", " + duracion + ", " + referencia;
    }
    
    
    
    
}
