package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Animais {
    
    String name;
    String type;
    List<String> vacinas = new ArrayList<>();
    Set<String> tratamentos = new HashSet<>();
    Map<String, String> dadosAdicionais = new HashMap<>();
    Queue<String> filaAtendimento = new LinkedList<>();

    public Animais(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void addVacina(String vacina) {
        vacinas.add(vacina);
    }

    public String getVacina(int ordem) {
        return vacinas.get(ordem);
    }

    public void addTratamento(String tratamento) {
        tratamentos.add(tratamento);
    }
    
    public Set<String> getTratamentos() {
        return tratamentos;
    }

    public void addDadoAdicional(String chave, String valor) {
        dadosAdicionais.put(chave, valor);
    }

    public String getDadoAdicional(String chave) {
        return dadosAdicionais.get(chave);
    }
    
    public void addFilaAtendimento(String atendimento) {
        filaAtendimento.add(atendimento);
    }

    public String atenderProximo() {
        return filaAtendimento.poll();
    }
}
