import org.w3c.dom.ls.LSOutput;

public class Agenda {

    public static void main(String[] args) {

        Hash hash = new Hash(2);

        hash.adicionarContato(new Contato(01,"Diego Lemos Machado", "(85)40040001","01/01/1990","diegolemos@unifor.com","(85)999887766"));
        hash.adicionarContato(new Contato(02,"Morgana Ramos", "(85)40040004","01/01/1992","morganaramos@unifor.br","(85)999776655"));

        System.out.println(hash);
    }
}
