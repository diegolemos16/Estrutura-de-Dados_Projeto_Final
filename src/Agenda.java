import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Hash hash = new Hash(15);
        Scanner s = new Scanner(System.in);

        int opcao = 0;
        int codigo = 1;

        while (opcao != 5) {
            Opcoes.opcoesMenu();
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do contato: ");
                    String nome = s.next();
                    System.out.println("Informe o numero do telefone: ");
                    String telefone = s.next();
                    System.out.println("Informe a data de nascimento: ");
                    String nascimento = s.next();
                    System.out.println("Informe o email: ");
                    String email = s.next();
                    System.out.println("Informe o numero do celular: ");
                    String celular = s.next();
                    hash.addContato(new Contato(codigo, nome, telefone, nascimento, email, celular));
                    System.out.println("Contato Inserido com sucesso!");
                    codigo++;
                    break;

                case 2:
                    System.out.println("Digite o nome do contato qa ser excluido: ");
                    String nome1 = s.next();
                    hash.excluir(nome1);
                    break;

                case 3:
                    System.out.println("Digite o nome do contato para ser pesquisado: ");
                    String nome2 = s.next();
                    System.out.println(hash.pesquisarNome(nome2));
                    break;

                case 4:
                    hash.exibirAgenda();
                    break;

                case 5: // Finalizar
                    break;

                default:
                    System.out.println("O número inválido! Digite um número de 1 a 5.");
            }
        }
    }
}





