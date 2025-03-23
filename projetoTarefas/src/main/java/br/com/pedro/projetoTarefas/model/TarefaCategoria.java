package br.com.pedro.projetoTarefas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TAREFAS_CATEGORIA")
public class TarefaCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
