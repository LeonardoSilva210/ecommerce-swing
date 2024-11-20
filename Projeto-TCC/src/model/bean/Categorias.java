
package model.bean;


public class Categorias {
    
    private String nome, descricao;
    private boolean arquivado;
    private int id_categoria, quantidade_produtos;

    public Categorias(String nome, String descricao, boolean arquivado, int id_categoria, int quantidade_produtos) {
        this.nome = nome;
        this.descricao = descricao;
        this.arquivado = arquivado;
        this.id_categoria = id_categoria;
        this.quantidade_produtos = quantidade_produtos;
    }

    public Categorias() {
    }

    public int getQuantidade_produtos() {
        return quantidade_produtos;
    }

    public void setQuantidade_produtos(int quantidade_produtos) {
        this.quantidade_produtos = quantidade_produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public boolean isArquivado() {
        return arquivado;
    }

    public void setArquivado(boolean arquivado) {
        this.arquivado = arquivado;
    }
    
    
 
}
