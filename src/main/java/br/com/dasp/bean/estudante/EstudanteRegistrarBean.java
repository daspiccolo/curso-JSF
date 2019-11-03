package br.com.dasp.bean.estudante;

import br.com.dasp.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomeEstudante = {"Marina", "e", "Samuel", "sao", "lindos"};
    private List<String> nomeEstudant = asList("Marina", "e", "Samuel", "sao", "maravilhosos");
    private Set<String> nomesSet = new HashSet<>(asList("Marina2", "e2", "Samuel2", "sao2", "maravilhosos2"));
    private Map<String, String> nomesMap = new HashMap<>();


    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }


    {
        nomesMap.put("Samuel", "o mais inteligente");
        nomesMap.put("Marina", "A mais doce");
    }

    public void executar(){
        System.out.println("Fazendo uma busca BD");
        System.out.println("Processando uma busca BD");
        System.out.println("Exibindo uma busca BD");
    }
    public void executar(String param){
        System.out.println("Fazendo uma busca BD com o parametro: "+ param);
        System.out.println("Processando uma busca BD");
        System.out.println("Exibindo uma busca BD");
    }

    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }
    public String executarRetorno(String param){
        return "Quem eh a lindona? "+ param;
    }


    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public String[] getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String[] nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public List<String> getNomeEstudant() {
        return nomeEstudant;
    }

    public void setNomeEstudant(List<String> nomeEstudant) {
        this.nomeEstudant = nomeEstudant;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}



