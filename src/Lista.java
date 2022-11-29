public class Lista {

    No comeco;
    int tamanho;

    public Lista() {
        this.tamanho = tamanho;
    }

// adiciona o contado na lista
    public void addContato(Contato info) {

        No no = new No();
        no.info = info;
        no.proximo = comeco;
        comeco = no;
        tamanho++;
    }
//deleta o contato da lista
    public void excluirContato(Contato contato){
        No no = comeco;
        No anterior = new No();
        No proximo = new No();

        if(tamanho == 1){
            comeco = null;
        } else {
            while (no != null) {
                if (contato.getCodigo() == no.getContato().getCodigo()) {
                    proximo = no.getProximo();
                    No noAnterior = comeco;

                    try {
                        while (noAnterior != null) {
                            if (no.getContato().getCodigo() == noAnterior.getProximo().getContato().getCodigo()) {
                                anterior = noAnterior;
                                anterior.setProximo(proximo);
                                break;
                            }
                            noAnterior = noAnterior.getProximo();
                        }
                    } catch (Exception e) {
                        System.out.println("Não foi possivel deletar o contato");
                    }
                }
                no = no.getProximo();
            }
        }
        tamanho--;
    }


    public Contato pesquisarContato(int codigo) {
        No no = comeco;
        while (no != null){
            if (no.contato.codigo == codigo){
                return no.info;
            }
            no = no.proximo;
        }
        return null;
    }

    public Contato pesquisarNome(String nome) {
        No no = comeco;
        while (no != null){
            if (no.equals(no.contato.nome)){
                return no.info;
            }
            no = no.proximo;
        }
    return null;
    }


    public String toString() {
        String out = "";
        No no = comeco;
        while (no != null){
            out += no.info + " ";
            no = no.proximo;
        }
        return out;
    }
}
