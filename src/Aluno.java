public class Aluno {
    private String matricula, nome, telefone, email, uffmail;
    private Boolean status;


    public Aluno(String matricula, String nome, String telefone, String email, String uffmail, String status){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.uffmail = uffmail;
        if (status.equals("Ativo")){
            this.status = true;
        }
        else{
            this.status = false;
        }
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEmail(){
        return this.email;
    }

    public String getUFFMail(){
        return this.uffmail;
    }

    public Boolean getStatus(){
        return this.status;
    }

    public void setUFFMail(String email){
        this.uffmail = email;
    }
}

