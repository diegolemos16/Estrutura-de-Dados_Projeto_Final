public class Hash {

    private int tamTabela;
    private Lista [] vetor;

    public Hash(int tamTabela) {
        this.tamTabela = tamTabela;
        vetor = new Lista[tamTabela];
        for (int i = 0; i < tamTabela; i++){
            vetor[i] = new Lista();
            break;
        }
    }

    void addContato(Contato contato){
        int chave = contato.codigo % tamTabela;
        vetor[chave].addContato(contato);

    }

    void excluirContato(Contato contato){

    }

   void pesquisarContato(String nome){

   }

   void exibirAgenda(){

   }

//    Contato pesquisarContato(int codigo){
//        return vetor[codigo % operador].pesquisarContato(codigo);
//    }

    public String toString(){
        String out = "";
        for (int i = 0; i < tamTabela; i++) {
            out += "" + i + ": ";
            out += vetor[i % tamTabela] + "\n";
        }
        return out;
    }

}
