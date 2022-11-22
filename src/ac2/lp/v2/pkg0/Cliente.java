package ac2.lp.v2.pkg0;


public class Cliente {
    
    private String nome = "";
    private String cpf = "";
    private String telefone = "";
    private String cidade = "";
    private String estado = "";
    private String email = "";

    public Cliente() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.cidade = "";
        this.estado = "";
        this.email = "";
    }
    
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getCpf() {
        return cpf;
    }

 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
     public void limpaCliente(){
       nome = "";
       cpf = "";
       cidade = "";
       estado = "";
       telefone = "";
       email = "";
 
     }

    //public Cliente(){};
    
}
