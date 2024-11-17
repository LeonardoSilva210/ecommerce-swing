
package Globals;


public class GlobalAdmin {
    
    private static int id_admin;
    private static String nome, email, senha, foto;

    public static String getFoto() {
        return foto;
    }

    public static void setFoto(String foto) {
        GlobalAdmin.foto = foto;
    }
    
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

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        GlobalAdmin.email = email;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        GlobalAdmin.senha = senha;
    }
 
}
