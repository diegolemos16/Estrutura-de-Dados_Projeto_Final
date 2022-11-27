public class Contato {

    int codigo;

    String nome;

    String telefone;

    String nascimento;

    String email;

    String celular;


    @Override
    public String toString() {
        return "Contato{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Contato(int codigo, String nome, String telefone, String nascimento, String email, String celular) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.celular = celular;



    }
}
