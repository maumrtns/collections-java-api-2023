package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Maurício", 123456);
        agendaContatos.adicionarContato("Maurício", 5665);
        agendaContatos.adicionarContato("Maurício Martins", 1111111);
        agendaContatos.adicionarContato("Maurício Java", 654957);
        agendaContatos.adicionarContato("Maria de Lourdes", 1111111);
        agendaContatos.adicionarContato("Maurício", 44444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria de Lourdes");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maurício Java"));

    }


}
