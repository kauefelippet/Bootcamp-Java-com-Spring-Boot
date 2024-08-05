package list.basic_ops.lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Primeira tarefa");
        listaTarefa.adicionarTarefa("Segunda tarefa");
        listaTarefa.adicionarTarefa("Terceira tarefa");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Primeira tarefa");
        listaTarefa.obterDescricoesTarefas();

    }
}
