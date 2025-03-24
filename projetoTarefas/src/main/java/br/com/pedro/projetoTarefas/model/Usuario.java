package br.com.pedro.projetoTarefas.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table /*permite manipular prop. da tabela*/ (name = "USUARIOS")/*altera o nome*/
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String senha;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    /*> OneToMany - define uma relacao entre a classe atual (Usuario) como um (usuario) para muitas (tarefas)
    * foi usada dessa forma para mapear uma relaçao bidirecional entre tarefa e usuario, instanciando
    * uma lista de objetos do tipo tarefa que pode ser registrada para cada usuario
    * > mappedBy - define que as tarefas serao mapeadas de acordo com as configuracoes definidas na classe usuario*/
    private List<Tarefa> tarefas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
