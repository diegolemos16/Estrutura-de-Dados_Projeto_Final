public class Lista {

    private No inicio;
    private int tamanho;

    
    public void addContato(Contato info) {

        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }
//pesqusia tem que ser por nome
    public Contato pesquisarContato(String nome) {
        No no = inicio;
        while (no != null){
            if (no.info.nome == nome){
                return no.info;
            }
            no = no.proximo;
        }
    return null;
    }


    public String toString() {
        String out = "";
        No no = inicio;
        while (no != null){
            out += no.info + " ";
            no = no.proximo;
        }
        return out;
    }
}
