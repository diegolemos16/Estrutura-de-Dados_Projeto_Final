import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Hash hash = new Hash(10);

        Scanner s = new Scanner(System.in);

        int opcao = 0;

        int codigo = 1;

        try{
            while (opcao!=5) {
                Opcoes.opcoesMenu();
                opcao = s.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Informe o primeiro nome do contato: ");
                        String nome = s.next();
                        System.out.println("Informe o telefone: ");
                        String telefone = s.next();
                        System.out.println("Informe a data de nascimento: ");
                        String nascimento = s.next();
                        System.out.println("Informe o email: ");
                        String email = s.next();
                        System.out.println("Informe o celular: ");
                        String celular = s.next();
                        hash.addContato(new Contato(codigo, nome, telefone, nascimento, email, celular));
                        System.out.println("Contato Inserido com sucesso");
                        codigo++;
                        break;

                    case 2:
                        System.out.println("Digite o nome do contato que quer deletar: ");
                        String nome1 = s.next();
                        hash.excluirContato(nome1);
                        break;

                    case 3:
                        System.out.println("Digite o nome do contato para ser pesquisado: ");
                        String nome2 = s.next();
                        System.out.println(hash.pesquisarPorNome(nome2));
                        break;

                    case 4:
                        hash.exibirAgenda();
                        break;

                    case 5:
                        break;

                    default:
                        System.out.println("O numero invalido! Digite um numero de 1 a 5.");
                }
            }
        } catch (InputMismatchException n){
            System.out.println("Informe somente numeros");
        }
    }
}

