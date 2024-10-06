
package model.bean;

import java.sql.Date;
import java.sql.Time;

public class Compras {
    
    private int id_compra, fk_id_usuario, fk_id_produto, fk_id_carrinho;
    private String codigo, obs;
    private Time horario;
    private Date data;

    public Compras() {
    }

    public Compras(int id_compra, int fk_id_usuario, int fk_id_produto, int fk_id_carrinho, String codigo, String obs, Time horario, Date data) {
        this.id_compra = id_compra;
        this.fk_id_usuario = fk_id_usuario;
        this.fk_id_produto = fk_id_produto;
        this.fk_id_carrinho = fk_id_carrinho;
        this.codigo = codigo;
        this.obs = obs;
        this.horario = horario;
        this.data = data;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(int fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }

    public int getFk_id_produto() {
        return fk_id_produto;
    }

    public void setFk_id_produto(int fk_id_produto) {
        this.fk_id_produto = fk_id_produto;
    }

    public int getFk_id_carrinho() {
        return fk_id_carrinho;
    }

    public void setFk_id_carrinho(int fk_id_carrinho) {
        this.fk_id_carrinho = fk_id_carrinho;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
