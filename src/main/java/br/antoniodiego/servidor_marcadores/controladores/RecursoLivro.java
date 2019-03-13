/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.controladores;

import br.antoniodiego.servidor_marcadores.itens.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@RestController
public class RecursoLivro {

    @Autowired
    private ReposLivros reposi;

    @GetMapping("livro")
    public Iterable<Livro> lista() {
        return reposi.findAll();
    }
    
     @PostMapping("livro")
    public Livro cadastra(@RequestBody Livro livroCadastar) {
        return reposi.save(livroCadastar);
    }
}
