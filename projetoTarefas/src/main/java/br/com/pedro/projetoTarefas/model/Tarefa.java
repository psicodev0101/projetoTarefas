package br.com.pedro.projetoTarefas.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity /*transforma a classe em uma entidade*/
@Table /*permite manipular prop. da tabela*/ (name = "TAREFAS")/*altera o nome*/
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "DS_TAREFA", nullable = false, length = 150)
    /*marca o atributo como coluna, proibe valores nulos, limita o tamanho da entrada*/
    private String descricao;

    @Enumerated(EnumType.STRING)
    /*marca como tipo enumerado String*/
    private TarefaStatus status;

    private LocalDate dataEntrega;

    private boolean visivel;

//    private TarefaCategoria categoria;
//
//    private Usuario usuario;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TarefaStatus getStatus() {
        return status;
    }

    public void setStatus(TarefaStatus status) {
        this.status = status;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

//    public TarefaCategoria getCategoria() {
//        return categoria;
//    }
//
//    public void setCategoria(TarefaCategoria categoria) {
//        this.categoria = categoria;
//    }
//
//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
}
