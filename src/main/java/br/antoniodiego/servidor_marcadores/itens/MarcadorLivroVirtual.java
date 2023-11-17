/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.itens;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@Entity
@Table(name = "MARCADORES")
public class MarcadorLivroVirtual implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    /**
     *
     */
    private LocalDateTime dataHoraPausa;
    /**
     *
     */
    @Column(name="DESCRICAO_POSIC")
    private String descricao_posic;
    /**
     *
     */
    @ManyToOne
    private Livro livro;

    public MarcadorLivroVirtual() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraPausa() {
        return dataHoraPausa;
    }

    public void setDataHoraPausa(LocalDateTime dataHoraPausa) {
        this.dataHoraPausa = dataHoraPausa;
    }

    public String getDescric() {
        return descricao_posic;
    }

    public void setDescric(String descric) {
        this.descricao_posic = descric;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    
}
