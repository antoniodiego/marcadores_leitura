/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.itens;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;


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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "url_raiz")
    private String urlRaiz;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "livro")
    private List<MarcadorFisico> marcadores;
    private String nome;

    
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

    public List<MarcadorFisico> getMarcadores() {
        return marcadores;
    }

    public void setMarcadores(List<MarcadorFisico> marcadores) {
        this.marcadores = marcadores;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
