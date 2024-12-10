public abstract class Audio implements Clasificable {
    private String titulo;
    private int duracion;
    private int reproductionsT;
    private int meGusta;
    private int clasificacion;

    // Métodos comunes
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

    public int getReproductionsT() {
        return reproductionsT;
    }

    public void setReproductionsT(int reproductionsT) {
        this.reproductionsT = reproductionsT;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}

