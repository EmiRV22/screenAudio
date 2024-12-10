public class Main {
    public static void main(String[] args) {
        // Crear instancias de Song
        Song firstSong = new Song();
        firstSong.setTitulo("Psychosocial");
        firstSong.setDuracion(282);
        firstSong.setReproductionsT(1500000);
        firstSong.setMeGusta(75000);
        firstSong.setArtista("Slipknot");

        Song secondSong = new Song();
        secondSong.setTitulo("Duality");
        secondSong.setDuracion(252);
        secondSong.setReproductionsT(2000000);
        secondSong.setMeGusta(100000);
        secondSong.setArtista("Slipknot");

        Song thirdSong = new Song();
        thirdSong.setTitulo("Before I Forget");
        thirdSong.setDuracion(270);
        thirdSong.setReproductionsT(1800000);
        thirdSong.setMeGusta(90000);
        thirdSong.setArtista("Slipknot");

        // Crear instancias de Podcast
        Podcast firstPodcast = new Podcast();
        firstPodcast.setTitulo("How to Learn Skills Faster");
        firstPodcast.setDuracion(5400);
        firstPodcast.setReproductionsT(50000);
        firstPodcast.setMeGusta(2500);
        firstPodcast.setPresentador("Andrew Huberman");

        Podcast secondPodcast = new Podcast();
        secondPodcast.setTitulo("Optimize & Control Your Brain Chemistry");
        secondPodcast.setDuracion(7200);
        secondPodcast.setReproductionsT(60000);
        secondPodcast.setMeGusta(3000);
        secondPodcast.setPresentador("Andrew Huberman");

        Podcast thirdPodcast = new Podcast();
        thirdPodcast.setTitulo("The Best Training Split");
        thirdPodcast.setDuracion(3600);
        thirdPodcast.setReproductionsT(40000);
        thirdPodcast.setMeGusta(2000);
        thirdPodcast.setPresentador("Andrew Huberman");

        // Usar polimorfismo para trabajar con objetos Clasificable
        Clasificable[] items = {firstSong, secondSong, thirdSong, firstPodcast, secondPodcast, thirdPodcast};

        for (Clasificable item : items) {
            if (item instanceof Audio) {
                Audio audio = (Audio) item;
                System.out.println("Título: " + audio.getTitulo());
                System.out.println("Duración: " + audio.getDuracion() + " segundos");
                System.out.println("Reproducciones: " + audio.getReproductionsT());
                System.out.println("Me Gusta: " + audio.getMeGusta());
                System.out.println("Clasificación: " + item.getClasificacion());
                System.out.println();
            }
        }
    }
}
