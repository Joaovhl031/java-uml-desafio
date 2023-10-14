public class Smartphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical repodutor = new ReprodutorMusical("Sing For The Moment", "Internacional", "Eminem");
        repodutor.adicionarPlaylist();
        repodutor.continuarReprodutor();
        repodutor.pararReprodutor();
        repodutor.pularMusica();
        repodutor.excluirMusica();
        System.out.println("==================");
        Telefone celPhone = new Telefone("53454", "Joaquim");
        celPhone.atenderLigacao();
        celPhone.recusarLigacao();
        celPhone.salvarContato();
        celPhone.editarContato();
        celPhone.excluirContato();
        celPhone.ligar();
        System.out.println("===============");
        Navegador browser = new Navegador("https/www.Exemplo.com/?");
        browser.abrirPaginas();
        browser.exibirHistorico();
        browser.deletarHistorico();
    }

}
