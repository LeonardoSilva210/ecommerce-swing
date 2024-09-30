
package model.bean;


public class EstoqueBean {
    
    private int id_produto;
    private String nome_produto;
    private String descricao_produto;
    private int disponivel;
    private int fk_id_categoria;
    private float valor, valor_custo;
    private int quantidade;
    private String nome_categoria;
    private String descricao_categoria;
    

    public EstoqueBean() {
    }

    public EstoqueBean(int id_produto, String nome_produto, String descricao_produto, int disponivel, int fk_id_categoria, float valor, float valor_custo, int quantidade, String nome_categoria, String descricao_categoria) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.descricao_produto = descricao_produto;
        this.disponivel = disponivel;
        this.fk_id_categoria = fk_id_categoria;
        this.valor = valor;
        this.valor_custo = valor_custo;
        this.quantidade = quantidade;
        this.nome_categoria = nome_categoria;
        this.descricao_categoria = descricao_categoria;
    }

    public float getValor_custo() {
        return valor_custo;
    }

    public void setValor_custo(float valor_custo) {
        this.valor_custo = valor_custo;
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

    public int getFk_id_categoria() {
        return fk_id_categoria;
    }

    public void setFk_id_categoria(int fk_id_categoria) {
        this.fk_id_categoria = fk_id_categoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public String getDescricao_categoria() {
        return descricao_categoria;
    }

    public void setDescricao_categoria(String descricao_categoria) {
        this.descricao_categoria = descricao_categoria;
    }

  
    
    
}
