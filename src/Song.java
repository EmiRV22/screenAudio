public class Song extends Audio {
    private String artista;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public int getClasificacion() {
        return (int) (getReproductionsT() / 1000); // Ejemplo de cálculo de clasificación
    }
}

