public class Telefone {
    private String numeroTel;
    private String contato;
    public String getNumeroTel() {
        return numeroTel;
    }
    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public Telefone(String numeroTel, String contato) {
        this.numeroTel = numeroTel;
        this.contato = contato;
    }

    public void ligar() {
        System.out.println("Ligando...");
    }
    
    public void salvarContato(){
        System.out.println("Salvando contato");
    }

    public void excluirContato() {
        System.out.println("Excluindo contato");
    }

    public void editarContato(){
        System.out.println("Editando contato");
    }

    public void atenderLigacao(){
        System.out.println("Atendendendo ligacao");
    }

    public void recusarLigacao(){
        System.out.println("Recusando ligacao");
    }

}
