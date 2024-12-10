public class Podcast extends Audio {
    private String presentador;

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    @Override
    public int getClasificacion() {
        return (int) (getMeGusta() / 100); // Ejemplo de cálculo de clasificación
    }
}
