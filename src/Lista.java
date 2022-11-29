public class Lista {

    No comeco;
    int tamanho;

    public Lista() {
        this.tamanho = tamanho;
    }

// função para adicionar o contado na lista
    public void addContato(Contato info) {

        No no = new No();
        no.info = info;
        no.proximo = comeco;
        comeco = no;
        tamanho++;
    }
//função que delta o contato da lista
    public void excluirContato(Contato contato){
        No no = comeco;
        No anterior = new No();
        No proximo = new No();

        if(tamanho == 1){
            comeco = null;
        } else {
            while (no != null) {
                if (contato.getCodigo() == no.getContato().getCodigo()){
                    proximo = no.getProximo();
                    anterior = comeco;

                    try{
                        while(anterior != null){
                            if (no.getContato().getCodigo() == anterior.getProximo().getContato().getCodigo()){
                                anterior = noAnterior;
                            }
                        }
                    }
        }

    }


    public Contato pesquisarContato(String nome) {
        No no = comeco;
        while (no != null){
            if (no.info.nome == codigo){
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
