/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.itens;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@Entity
public class MarcadorLivroVirtual extends Marcador implements Serializable {

    @Id
    private Long id;
    /**
     *
     */
    private LocalDateTime dataHoraPausa;
    /**
     *
     */
    private String descric;
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
        return descric;
    }

    public void setDescric(String descric) {
        this.descric = descric;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    
}
