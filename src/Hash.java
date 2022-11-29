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

    public void addContato(Contato contato){
        int chave = contato.codigo % tamTabela;
        vetor[chave].addContato(contato);

    }


    // Diego
    public void excluirContato(String nome){

    }

    public Contato pesquisarContato(int codigo){
        Contato resultado = vetor[codigo % tamTabela].pesquisarContato(codigo);
        return resultado;
    }

    // Diego
   public Contato pesquisarPorNome(String nome){

       return null;
   }

   void exibirAgenda(){
       System.out.println(this);

   }


    public String toString(){
        String out = "";
        for (int i = 0; i < tamTabela; i++) {
            out += "" + i + ": ";
            out += vetor[i % tamTabela] + "\n";
        }
        return out;
    }

}
