
package Globals;


public class GlobalAdmin {
    
    private static int id_admin;
    private static String nome, sobrenome, cpf, senha;

    public static int getId_admin() {
        return id_admin;
    }

    public static void setId_admin(int id_admin) {
        GlobalAdmin.id_admin = id_admin;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        GlobalAdmin.nome = nome;
    }

    public static String getSobrenome() {
        return sobrenome;
    }

    public static void setSobrenome(String sobrenome) {
        GlobalAdmin.sobrenome = sobrenome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        GlobalAdmin.cpf = cpf;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        GlobalAdmin.senha = senha;
    }
    
    
    
}
