package Classes;
public class Jogo {
    private String codigo;
    private String nome;
    private String mascote;

    public Jogo(String codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.mascote = mascote;
    }

    public Jogo(String codigo2, String nome2, String mascote2) {
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getMascote() {
        return mascote;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nome + " / " + mascote;
    }

    public String tentarSorte() {
        return null;
    }
    
}
