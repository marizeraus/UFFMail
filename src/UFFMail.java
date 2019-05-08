import java.util.Scanner;

public class UFFMail {

    public static String gerarUFFMail(String nome, String caminho) {
        /*função para a escolha do uffmail, retorna no fim o uffmail escolhido*/
        Scanner teclado = new Scanner(System.in);
        /*gera todos os existentes para não criar um uffmail que ja exista*/
        String existentes[] = ReadFile.listaExistentes(caminho);
        /*chama a função para gerar as opções de uffmail */
        String options[] = opcoes(nome, existentes);
        int escolhido;
        String nomes[] = nome.split(" ");
        System.out.println(nomes[0]+", por favor escolha uma das opções abaixo para seu UFFMail");
        for (int i=0; i<options.length; i++){
            System.out.println(i+1+" - "+ options[i]);
        }

        escolhido = teclado.nextInt();

        return options[escolhido-1];
    }

    private static String[] opcoes(String nome, String existentes[]){
        int numero_opcoes = 5;
        String fim;
        fim = "@id.uff.br";

        String opcoes = new String();
        /*transforma o nome em minusculo e separa para facilitar a criação das opções*/
        String nomes = nome.toLowerCase();
        String nomes2[] = nomes.split(" ");

        String opcao = nomes2[0]+"_"+nomes2[1]+fim;
        if (!existeUFFMail(existentes, opcao)){
            opcoes+=opcao;
            opcoes+=' ';
        }

        opcao = nomes2[0]+nomes2[1].substring(0,1)+nomes2[2].substring(0,1)+fim;
        if (!existeUFFMail(existentes, opcao)){
            opcoes+=opcao;
            opcoes+=' ';
        }

        opcao = nomes2[0]+nomes2[2]+fim;
        if (!existeUFFMail(existentes, opcao)){
            opcoes+=opcao;
            opcoes+=' ';
        }

        opcao = nomes2[0].substring(0,1)+nomes2[1]+fim;
        if (!existeUFFMail(existentes, opcao)){
            opcoes+=opcao;
            opcoes+=' ';
        }

        opcao = nomes2[0].substring(0,1)+nomes2[1]+nomes2[2]+fim;
        if (!existeUFFMail(existentes, opcao)){
            opcoes+=opcao;
            opcoes+=' ';
        }

        return opcoes.split(" ");



    }


    private static Boolean existeUFFMail(String existentes[], String novo) {
        /*checa a lista uffmails existentes para ver se ja existe um igual */
        for (int i = 0; i < existentes.length; i++) {
            if (existentes[i].equals(novo)) {
                return true;
            }
        }
        return false;
    }

}

