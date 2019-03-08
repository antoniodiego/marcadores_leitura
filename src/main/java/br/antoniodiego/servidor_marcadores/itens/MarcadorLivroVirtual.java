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
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
}
