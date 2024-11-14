
package model.bean;


public class Categorias {
    
    private String nome, descricao;
    private boolean arquivado;
    private int id_categoria;

    public Categorias(String nome, String descricao, boolean arquivado, int id_categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.arquivado = arquivado;
        this.id_categoria = id_categoria;
    }

    public Categorias() {
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
