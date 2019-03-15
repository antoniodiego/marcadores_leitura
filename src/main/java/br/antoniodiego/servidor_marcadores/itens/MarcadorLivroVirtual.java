/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.itens;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@Entity
@Table(name = "MARCADOR")
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
