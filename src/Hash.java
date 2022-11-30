
public class Hash {

    private int tamTabela;

    private Lista[] vetor;

    public Hash(int tamTabela) {
        this.tamTabela = tamTabela;
        vetor = new Lista[tamTabela];
        for (int i = 0; i < tamTabela; i++) {
            vetor[i] = new Lista();
        }
    }

    public void addContato(Contato contato) {
        int chave = contato.getCodigo() % tamTabela;
        vetor[chave].addContato(contato);
    }

    public void excluirContato(String nome) {
        try {
            boolean b = pesquisarPorNome(nome) != null;
            {
                Contato contato = pesquisarPorNome(nome);
                int chave = contato.getCodigo() % tamTabela;
                vetor[chave].excluirContato(contato);
            }
        }catch (NullPointerException g){
                System.out.println("Impossível deletar, contato não encontrado!");
            }
        }
    
    //funcao 'pesquisarContato' nao sera chamada na classe Agenda
    public Contato pesquisarContato(int codigo) {
        Contato retorno = vetor[codigo % tamTabela].pesquisarContato(codigo);
        System.out.println(retorno);
        return retorno;
    }

    public Contato pesquisarPorNome(String nome) {
        for (int i = 0; i < tamTabela; i++) {
            if (vetor[i].pesquisarNome(nome) != null) {
                return vetor[i].pesquisarNome(nome);
            };
        }
        System.out.println("Contato nao encontrado");
        return null;
    }

    public void exibirAgenda() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < tamTabela; i++) {
            out += "" + i + ": ";
            out += vetor[i % tamTabela] + "\n";
        }
        return out;
    }

}
