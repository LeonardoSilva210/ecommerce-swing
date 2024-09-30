
package model.bean;

import java.sql.Date;
import java.sql.Time;

public class Compras {
    
    private int id_compra, fk_id_usuario, fk_id_produto, fk_id_carrinho;
    private Time horario;
    private Date data;

    public Compras() {
    }

    public Compras(int id_compra, int fk_id_usuario, int fk_id_produto, int fk_id_carrinho, Time horario, Date data) {
        this.id_compra = id_compra;
        this.fk_id_usuario = fk_id_usuario;
        this.fk_id_produto = fk_id_produto;
        this.fk_id_carrinho = fk_id_carrinho;
        this.horario = horario;
        this.data = data;
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
