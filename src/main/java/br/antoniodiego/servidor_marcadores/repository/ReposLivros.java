/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.repository;

import br.antoniodiego.servidor_marcadores.itens.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
public interface ReposLivros extends JpaRepository<Livro, Long>{
    
}
