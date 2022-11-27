public class Lista {

    No inicio;

    int tamanho;

    public void adicionarContato(Contato info) {

        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;

    }

    public Contato pesquisarContato(int codigo) {
        No no = inicio;
        while (no != null){
            if (no.info.codigo == codigo){
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
