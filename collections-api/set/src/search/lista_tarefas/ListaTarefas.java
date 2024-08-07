package search.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
     tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    tarefaSet.remove(t);
                    break;
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> listaConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if(t.isConcluida()) {
                listaConcluidas.add(t);
            }
        }
        System.out.println("Tarefas concluídas:\n" + listaConcluidas);
    }

    public void obterTarefasPendentes() {
        Set<Tarefa> listaPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if(!t.isConcluida()) {
                listaPendentes.add(t);
            }
        }
        System.out.println("Tarefas pendentes:\n" + listaPendentes);
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida();
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setPendente();
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {

        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        lista.adicionarTarefa("Tarefa 4");
        lista.adicionarTarefa("Tarefa 5");
        lista.marcarTarefaConcluida("Tarefa 1");
        lista.marcarTarefaConcluida("Tarefa 3");
        lista.marcarTarefaConcluida("Tarefa 4");
        lista.exibirTarefas();
        lista.removerTarefa("Tarefa 5");
        lista.marcarTarefaPendente("Tarefa 3");

        lista.obterTarefasPendentes();

        lista.obterTarefasConcluidas();

        System.out.println("Total de tarefas: " + lista.contarTarefas());

        System.out.println("Limpando lista de tarefas...");
        lista.limparListaTarefas();
        lista.exibirTarefas();

    }
}
