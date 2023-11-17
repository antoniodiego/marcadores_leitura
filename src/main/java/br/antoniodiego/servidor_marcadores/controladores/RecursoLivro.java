/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.controladores;

import br.antoniodiego.servidor_marcadores.repository.ReposLivros;
import br.antoniodiego.servidor_marcadores.itens.Livro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@RestController
@RequestMapping(path = "/livros")
public class RecursoLivro {

    @Autowired
    private ReposLivros reposi;

    /**
     *
     */
    private final Logger logReL;

    public RecursoLivro() {
        logReL = LogManager.getLogger(RecursoLivro.class);
    }

    @CrossOrigin(origins = {"http://localhost:4200", "http://10.0.0.19:4200",
        "http://10.0.0.17:4200"})

    @GetMapping("/")
    public Iterable<LivroDTO> lista() {
        return reposi.findAll().stream().map((livro) -> {
            LivroDTO ld = new LivroDTO();
            ld.nome = livro.getNome();
            ld.link = livro.getUrlRaiz();
            return ld;
        }).toList();
    }

    @PostMapping("/")
    public Livro cadastra(@RequestBody Livro livroCadastar) {
        logReL.debug("L u: " + livroCadastar.getUrlRaiz());
        return reposi.save(livroCadastar);
    }

    public class LivroDTO {

        String nome;
        String link;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
        
        
    }
}
