/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores.controladores;

import br.antoniodiego.servidor_marcadores.itens.MarcadorFisico;
import br.antoniodiego.servidor_marcadores.repository.ReposMarcador;
import br.antoniodiego.servidor_marcadores.itens.MarcadorLivroVirtual;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ant�noio Diego <antoniodiegoluz at gmail.com>
 */
@RestController
@RequestMapping(path = "/marcadores")
public class RecursoMarcador {

    @Autowired
    private ReposMarcador repos;

    @GetMapping("/")
    public Iterable<MarcadorDTO> lista() {
       return repos.findAll().stream().map((marcador) -> {
            MarcadorDTO marcadorDTO = new MarcadorDTO();
            marcadorDTO.livro = marcador.getLivro().getId();
            marcadorDTO.pagina = Integer.parseInt(marcador.getPagina());
            return marcadorDTO;
        }).toList();
    }

    @GetMapping("/{id}")
    public Iterable<MarcadorDTO> lista(@PathVariable Long id) {
        System.out.println("id: "+id);
        return repos.findByLivroId(id).stream().map((marcador) -> {
            MarcadorDTO marcadorDTO = new MarcadorDTO();
            marcadorDTO.livro = marcador.getLivro().getId();
            marcadorDTO.pagina = Integer.parseInt(marcador.getPagina());
            return marcadorDTO;
        }).toList();
    }

    public class MarcadorDTO {

        Long livro;
        int pagina;
        LocalDate data;
        LocalTime hora;

        public Long getLivro() {
            return livro;
        }

        public void setLivro(Long livro) {
            this.livro = livro;
        }

        public int getPagina() {
            return pagina;
        }

        public void setPagina(int pagina) {
            this.pagina = pagina;
        }

        public LocalDate getData() {
            return data;
        }

        public void setData(LocalDate data) {
            this.data = data;
        }

        public LocalTime getHora() {
            return hora;
        }

        public void setHora(LocalTime hora) {
            this.hora = hora;
        }


    }

    @PostMapping("marcador")
    public MarcadorFisico cadastra(@RequestBody MarcadorFisico livroCadastar) {
        return repos.save(livroCadastar);
    }
}
