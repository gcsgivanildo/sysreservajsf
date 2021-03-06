package br.edu.garanhuns.sysreservajsf.entity;
// Generated 14/11/2016 19:17:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Sala generated by hbm2java
 */
public class Sala{


     private Integer id;
     private String nome;
     private String localizacao;
     private Integer capacidade;
     private String tipo;
     private Set<Aula> aulas = new LinkedHashSet<Aula>();

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Set<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(Set<Aula> aulas) {
        this.aulas = aulas;
    }

    
}


