public class Navegador {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Navegador(String url) {
        this.url = url;
    }

    public void abrirPaginas(){
        System.out.println("Abrindo paginas");
    }
    
    public void exibirHistorico(){
        System.out.println("Exibindo Historico");
    }

    public void deletarHistorico(){
        System.out.println("Deletando historico");
    }
}
