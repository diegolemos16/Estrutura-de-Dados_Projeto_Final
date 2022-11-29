public class Hash {

    int tamTabela;
    Lista [] vetor;

    public Hash(int tamTabela) {
        this.tamTabela = tamTabela;
        vetor = new Lista[tamTabela];
        for (int i = 0; i < tamTabela; i++){
            vetor[i] = new Lista();
                    }
    }

    void addContato(Contato contato){
        int chave = contato.codigo % tamTabela;
        vetor[chave].addContato(contato);

    }

    void excluir(String contato){

    }

   void pesquisarNome(String nome){

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
