/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.repository;

import br.antoniodiego.servidor_marcadores.itens.MarcadorFisico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
public interface ReposMarcador extends JpaRepository<MarcadorFisico, Long>{
    public List<MarcadorFisico> findByLivroId(Long id);
}
