/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.itens;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Representa um livro. Pode representar um livro de algum saite. Talvez ele
 * possa ser associado a algum URI raiz
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@Entity
@Table(name = "Livros")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(name = "URL_RAIZ")
    private String urlRaiz;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "livro")
    private List<MarcadorLivroVirtual> marcadores;

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

    public List<MarcadorLivroVirtual> getMarcadores() {
        return marcadores;
    }

    public void setMarcadores(List<MarcadorLivroVirtual> marcadores) {
        this.marcadores = marcadores;
    }

}
