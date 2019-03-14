/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.antoniodiego.servidor_marcadores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Antônoio Diego <antoniodiegoluz at gmail.com>
 */
@SpringBootApplication
public class Principal {

    private static final Logger logPrinc = LoggerFactory.getLogger(Principal.class);

    public Principal() {

    }

    public static void main(String[] args) {
        //  logPrinc.debug("Antes migrar");
//        Flyway fl = Flyway.configure().dataSource("jdbc:hsqldb:bancos/bancomarcadores;shutdown=true", "root", "sa").baselineOnMigrate(true).baselineVersion(MigrationVersion.fromVersion("1")).load();
//        try {
//            fl.migrate();
//        } catch (FlywayException ex) {
//            logPrinc.debug("Falha ao migrar");
//            fl.repair();
//        }
//        logPrinc.debug("Após migrar");
//        
       SpringApplication.run(Principal.class, args);
    }
}
