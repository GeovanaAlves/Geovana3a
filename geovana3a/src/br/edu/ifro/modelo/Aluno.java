
package br.edu.ifro.modelo;

import javax.persistence.Entity;

@Entity 
public class Aluno {
   @generatedValue(strategy.IDENTITY)
    private Integer id;

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
    private String nome;
}
