import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Digite Sua Matrícula:");
        Scanner teclado = new Scanner(System.in);
        String matricula = teclado.nextLine();

        String caminho = "alunos.csv";


        String dados[] = ReadFile.achaMatricula(caminho,matricula);
        if (!dados[0].equals("ERRO")) {


            Aluno aluno = new Aluno(dados[1],dados[0],dados[2], dados[3], dados[4], dados[5]);
            if (aluno.getStatus()){
                if (aluno.getUFFMail().equals("")){
                    String email = new String();
                    email = UFFMail.gerarUFFMail(aluno.getNome(), caminho);
                    aluno.setUFFMail(email);

                    System.out.println("A criação de seu e-mail (" + email + ") será feita nos próximos minutos.");
                    System.out.println("Um SMS foi enviado para " + aluno.getTelefone() + " com a sua senha de acesso.");
                }
                else System.out.println("UFFMail já criado");
            }
            else System.out.println("Aluno não está com matrícula ativa");
        }
    }
}
