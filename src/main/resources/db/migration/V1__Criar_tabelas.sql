/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Antônoio Diego <antoniodiegoluz at gmail.com>
 * Created: 08/03/2019
 */
CREATE TABLE LIVROS (
  ID BIGINT NOT NULL PRIMARY KEY,
  URL_RAIZ VARCHAR(256) NOT NULL,
  CONSTRAINT uri_unico UNIQUE URL_RAIZ
);


CREATE TABLE LMARCADOR (
  ID BIGINT NOT NULL PRIMARY KEY,
  DATA_HORA_PAUSA TIMESTAMP,
  DESCRICAO_POSIC VARCHAR(256),
  CONSTRAINT uri_unico UNIQUE URL_RAIZ
);