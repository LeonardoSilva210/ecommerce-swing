
package model.bean;

import java.sql.Date;
import java.sql.Time;


public class Notificacoes {
    
    private int id_notificacao, tipo;
    private String notificacao;
    private boolean visto;
    private Date data;
    private Time horario;

    public Notificacoes() {
    }

    public Notificacoes(int id_notificacao, int tipo, String notificacao, boolean visto, Date data, Time horario) {
        this.id_notificacao = id_notificacao;
        this.tipo = tipo;
        this.notificacao = notificacao;
        this.visto = visto;
        this.data = data;
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
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

    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    

}
