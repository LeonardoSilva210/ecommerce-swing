package model.bean;

import java.sql.Date;
import java.sql.Time;
import java.util.List;


public class Reservas {
    
    private int id_compra, fk_id_usuario,fk_id_carrinho,ativo, quantidade_total;
    private String pessoa, obs, codigo;
    private List<Produtos> produtos;
    private float valor_total;
    private Date data;
    private Time horario;

    public Reservas() {
    }

    public Reservas(int id_compra, int fk_id_usuario, int fk_id_carrinho, int ativo, int quantidade_total, String pessoa, String obs, String codigo, List<Produtos> produtos, float valor_total, Date data, Time horario) {
        this.id_compra = id_compra;
        this.fk_id_usuario = fk_id_usuario;
        this.fk_id_carrinho = fk_id_carrinho;
        this.ativo = ativo;
        this.quantidade_total = quantidade_total;
        this.pessoa = pessoa;
        this.obs = obs;
        this.codigo = codigo;
        this.produtos = produtos;
        this.valor_total = valor_total;
        this.data = data;
        this.horario = horario;
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

    public int getFk_id_carrinho() {
        return fk_id_carrinho;
    }

    public void setFk_id_carrinho(int fk_id_carrinho) {
        this.fk_id_carrinho = fk_id_carrinho;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
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

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public int getQuantidade_total() {
        return quantidade_total;
    }

    public void setQuantidade_total(int quantidade_total) {
        this.quantidade_total = quantidade_total;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
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

    
    
}
