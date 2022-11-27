public class Hash {

    int operador;

    Lista [] vetor;

    Hash(int operador) {
        this.operador = operador;
        vetor = new Lista[operador];
        for (int i = 0; i < operador; i++){
            vetor[i] = new Lista();
        }
    }

    void adicionarContato(Contato contato){
        int chave = contato.codigo % operador;
        vetor[chave].adicionarContato(contato);
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
        for (int i = 0; i < operador; i++) {
            out += "" + i + ": ";
            out += vetor[i % operador] + "\n";
        }
        return out;
    }

}
