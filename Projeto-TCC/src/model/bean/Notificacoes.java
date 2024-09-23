
package model.bean;


public class Notificacoes {
    
    private int id_notificacao, tipo, fk_id_admin;
    private String notificacao, descricao;
    private boolean visto;

    public Notificacoes() {
    }

    public Notificacoes(int id_notificacao, int tipo, int fk_id_admin, String notificacao, String descricao, boolean visto) {
        this.id_notificacao = id_notificacao;
        this.tipo = tipo;
        this.fk_id_admin = fk_id_admin;
        this.notificacao = notificacao;
        this.descricao = descricao;
        this.visto = visto;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getId_notificacao() {
        return id_notificacao;
    }

    public void setId_notificacao(int id_notificacao) {
        this.id_notificacao = id_notificacao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getFk_id_admin() {
        return fk_id_admin;
    }

    public void setFk_id_admin(int fk_id_admin) {
        this.fk_id_admin = fk_id_admin;
    }

    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
