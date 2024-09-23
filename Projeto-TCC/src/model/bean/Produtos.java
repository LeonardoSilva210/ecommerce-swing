
package model.bean;


public class Produtos {
    
    private int id_produto;
    private String nome_produto;
    private String descricao_produto;
    private int disponivel;
    private float valor;
    private int fk_id_categoria;

    public Produtos() {
    }

    public Produtos(int id_produto, String nome_produto, String descricao_produto, int disponivel, float valor, int fk_id_categoria) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.descricao_produto = descricao_produto;
        this.disponivel = disponivel;
        this.valor = valor;
        this.fk_id_categoria = fk_id_categoria;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getFk_id_categoria() {
        return fk_id_categoria;
    }

    public void setFk_id_categoria(int fk_id_categoria) {
        this.fk_id_categoria = fk_id_categoria;
    }
    
    
    
    
    
}
