import java.io.*;
import java.util.Arrays;

public class ReadFile {

    private static String virgula = ",";

    public static String[] achaMatricula(String caminho, String matricula) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(caminho)));
            String linha = new String();
            String dados[] = new String[10];
            try {
                while ((linha = reader.readLine()) != null) {
                    /* separa os dados da linha do arquivo*/
                    dados = linha.split(virgula);
                    /*checa se é a matricula desejada e, se for, retorna todos os dados*/
                    if (dados[1].equals(matricula)) {
                        return dados;
                    }
                }
            }
            catch (IOException e) {
                System.out.println("IOException");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
        String erro[] = new String[10];
        erro[0]="ERRO";
        /*se a matricula nao existir, retorna um vetor que avisa que ocorreu o erro*/
        System.out.println("Aluno não encontrado");
        return erro;

    }


    public static String[] listaExistentes(String caminho) {
        String lista = new String();
        lista="";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(caminho)));
            String linha = new String();
            String dados[] = new String[10];
            try {
                while ((linha = reader.readLine()) != null) {
                    dados = linha.split(virgula);
                    if (!dados[1].equals("")) {
                        /*pega todos os uffmails que existirem e coloca numa string
                                para depois ser separada em vetor*/
                        lista+=dados[4]+" ";
                    }
                }
            }
            catch (IOException e) {
                System.out.println("IOException");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
        /*retorna a string ja separada como um vetor de uffmails*/
        return lista.split(" ");
    }

}
