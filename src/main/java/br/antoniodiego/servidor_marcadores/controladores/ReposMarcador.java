/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.controladores;

import br.antoniodiego.servidor_marcadores.itens.Marcador;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
public interface ReposMarcador extends CrudRepository<Marcador, Long>{
    
}
