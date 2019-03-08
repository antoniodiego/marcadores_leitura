/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.itens;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Representa um livro. Pode representar um livro de algum saite. Talvez ele
 * possa ser associado a algum URI raiz
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@Entity
public class Livro implements Serializable {

    @Id
    private Long id;
    private String urlRaiz;
    private List<Marcador> marcadores;

    public Livro() {
        marcadores = new ArrayList<>();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlRaiz() {
        return urlRaiz;
    }

    public void setUrlRaiz(String urlRaiz) {
        this.urlRaiz = urlRaiz;
    }

    public List<Marcador> getMarcadores() {
        return marcadores;
    }

    public void setMarcadores(List<Marcador> marcadores) {
        this.marcadores = marcadores;
    }

}
