/*
 * Método responsável pela criação da classe usuário
 * 
 */
package modelo;

/**
 *
 * @author Sergio dos Santos Marangoni
 */
public class usuario {

    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;

    //construtores
    public usuario(Long id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    //metodos:
    public String getcpf() {
        return cpf;
    }

    public void setcpf(String text) {
        this.cpf = cpf;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String text) {
        this.nome = nome;
    }

    public String setemail(String text) {
        return email;
    }

    public String getemail() {
        return email;
    }
    
    public String gettelefone(){
        return nome;
    }
    
    public void settelefone(String text){
        this.telefone = telefone;
        
    }
    public Long getid(){
        return id;
    }
    
    public void setid(){
        this.id = id;
    }

//    public void setnome(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setcpf(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setemail(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void settelefone(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
