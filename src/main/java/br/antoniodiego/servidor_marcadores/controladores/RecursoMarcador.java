/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.controladores;

import br.antoniodiego.servidor_marcadores.itens.Marcador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ant�noio Diego <antoniodiegoluz at gmail.com>
 */
@RestController
public class RecursoMarcador {

    @Autowired
    private ReposMarcador repos;

    @GetMapping
    public Iterable<Marcador> lista() {
        return repos.findAll();
    }
    
     @PostMapping
    public Marcador cadastra(@RequestBody Marcador livroCadastar) {
        return repos.save(livroCadastar);
    }
}
