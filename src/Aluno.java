public class Aluno {
    private String matricula, nome, telefone, email, uffmail;
    private Boolean status;


    public Aluno(String matricula, String nome, String telefone, String email, String uffmail, String status){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.uffmail = uffmail;
        if (status.equals("Ativo")){
            /*pega a string de status do aluno e transforma num booleano*/
            this.status = true;
        }
        else{
            this.status = false;
        }
    }

    public String getMatricula(){
        /*retorna a matricula*/
        return this.matricula;
    }

    public String getNome(){
        /*retorna o nome*/
        return this.nome;
    }

    public String getTelefone(){
        /*retorna o telefone*/
        return this.telefone;
    }

    public String getEmail(){
        /*retorna o email*/
        return this.email;
    }

    public String getUFFMail(){
        /*retorna o uffmail*/
        return this.uffmail;
    }

    public Boolean getStatus(){
        /*retorna o status*/
        return this.status;
    }

    public void setUFFMail(String email){
        /*atualiza o uffmail*/
        this.uffmail = email;
    }
}

