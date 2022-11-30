public class Lista {

    private No comeco;

    private int tamanho;

    public Lista() {
    }

    public Lista(int tamanho) {

        this.tamanho = tamanho;
    }

    // adiciona o contado na lista
    public void addContato(Contato contato) {

        No no = new No();
        no.setContato(contato);
        no.setProximo(comeco);
        comeco = no;
        tamanho++;
    }

    //deleta o contato da lista
    public void excluirContato(Contato contato) {
        No no = comeco;
        No anterior = new No();
        No proximo = new No();

        if(tamanho == 1) {
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

    // pesquisa o conta por codigo (nao eh o que queremos)
    public Contato pesquisarContato(int codigo) {
        No no = comeco;
        while (no != null) {
            if (no.getContato().getCodigo() == codigo) {
                return no.getContato();
            }
            no = no.getProximo();
        }
        return null;
    }

    //pesquisa o contato por nome
    public Contato pesquisarNome(String nome) {
        No no = comeco;
        while (no != null) {
            if (nome.equalsIgnoreCase(no.getContato().getNome())) {
                return no.getContato();
            }
            no = no.getProximo();
        }
        return null;
    }

    @Override
    public String toString() {
        String out = "";
        No no = comeco;
        while (no != null) {
            out += no.getContato() + " ";
            no = no.getProximo();
        }
        return out;
    }

    public No getComeco() {
        return comeco;
    }

    public void setComeco(No comeco) {
        this.comeco = comeco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
