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
                dados = linha.split(virgula);
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
        return lista.split(" ");

    }


}
