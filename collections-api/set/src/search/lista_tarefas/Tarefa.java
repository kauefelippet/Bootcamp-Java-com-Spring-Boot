package search.lista_tarefas;

public class Tarefa {

    private String descricao;
    private boolean concluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida() {
        this.concluida = true;
    }

    public void setPendente() {
        this.concluida = false;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + " - " + "concluída:" + concluida;
    }
}
