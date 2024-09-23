
package model.bean;

import java.sql.Date;
import java.sql.Time;


public class Relatorios {
    
    private int id_compra, fk_id_usuario, fk_id_produto, fk_id_carrinho, quantidade;
    private String produto, pessoa;
    private Date data;
    private Time horario;
    private float valorUnitario, valorTotal;

    public Relatorios() {
    }

    public Relatorios(int id_compra, int fk_id_usuario, int fk_id_produto, int fk_id_carrinho, int quantidade, String produto, String pessoa, Date data, Time horario, float valorUnitario, float valorTotal) {
        this.id_compra = id_compra;
        this.fk_id_usuario = fk_id_usuario;
        this.fk_id_produto = fk_id_produto;
        this.fk_id_carrinho = fk_id_carrinho;
        this.quantidade = quantidade;
        this.produto = produto;
        this.pessoa = pessoa;
        this.data = data;
        this.horario = horario;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
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

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
}
