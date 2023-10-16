package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Jef", 11111111);
        agendaContatos.adicionarContato("Duda", 22222222);
        agendaContatos.adicionarContato("Paula", 33333333);
        agendaContatos.adicionarContato("Henrique", 444444444);
        agendaContatos.adicionarContato("Jess", 555555555);
        agendaContatos.adicionarContato("Camila", 666666666);


        System.out.println(agendaContatos.pesquisarPorNome("Duda"));
        agendaContatos.pesquisarPorNome("Camila");

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Camila");

        agendaContatos.exibirContatos();
    }
}


