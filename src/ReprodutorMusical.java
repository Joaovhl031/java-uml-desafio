public class ReprodutorMusical {
    private String musica;
    private String playlist;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public String getMusica() {
        return musica;
    }
    
    public String getPlaylist(){
        return playlist;
    }

    /**
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setMusica(String musica){
        this.musica = musica;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    

    public ReprodutorMusical(String musica, String playlist, String autor) {
        this.musica = musica;
        this.playlist = playlist;
        this.autor = autor;
    }

    public void adicionarPlaylist() {
        System.out.println("Musica adicionada na playlist");
    }

    public void pularMusica() {
        System.out.println("Pulando musica");
    }

    public void excluirMusica(){
        System.out.println("Excluindo musica da playlist");
    }

    public void pararReprodutor(){
        System.out.println("Parando musica no reprodutor");
    }

    public void continuarReprodutor(){
        System.out.println("Continuar tocando musica no reprodutor");
    }

}
