public class Agenda {

    public static void main(String[] args) {

        Hash hash = new Hash(6);

        hash.adicionarContato(new Contato(1,"Diego Lemos Machado", "(85)40040001","01/01/1990","diegolemos@unifor.com","(85)999887766"));
        hash.adicionarContato(new Contato(2,"Morgana Ramos", "(85)40040004","01/01/1992","morganaramos@unifor.br","(85)999776655"));
        hash.adicionarContato(new Contato(3,"Alano Regis", "(85)344776252", "10/06/1975","alano.regis@gmail.com","(85)999685525"));
        hash.adicionarContato(new Contato(4,"Mariana Milfont","(85)34458225", "13/04/2010","marianamilfont@gmail.com","(85)99695582"));
        hash.adicionarContato(new Contato(5,"Gabriela Gomes","(85)34773269", "07/09/1979","gabigomes@gmail.com","(85)995852545"));
        hash.adicionarContato(new Contato(6,"Raul Monte dos Anjos","(85)34773140", "15/04/1988","rauldosanjos@gmail.com","(85)994852565"));

        System.out.println(hash);
    }


}
