﻿--CREATE DATABASE ReservasMesas

create table CLIENTE (
	Id int not null primary key,
	Nome varchar(255) not null,
	Email varchar(255) not null,
	Telefone varchar(255) not null,
	Senha varchar(255) not null
);

CREATE TABLE MESA (
	Id int not null primary key,
	CapacidadePessoas int not null
);

CREATE TABLE TURNO (
	Id int not null primary key,
	Nome varchar(255) not null
);

CREATE TABLE PERIODO (
	Id int not null primary key,
	IdTurno int not null,
	FOREIGN KEY (IdTurno) REFERENCES TURNO(Id)
);

create table CLIENTE_MESA (
	IdMesa int not null primary key ,
	IdCliente int not null primary key,
	IdPeriodo int not null primary key,
	Data date not null,
	QtdOcupada int not null,
	CONSTRAINT pk_id PRIMARY KEY (idmesa, idcliente, idperiodo),
	FOREIGN KEY (IdMesa) REFERENCES MESA(Id),
	FOREIGN KEY (IdCliente) REFERENCES CLIENTE(Id),
	FOREIGN KEY (IdPeriodo) REFERENCES PERIODO(Id)
);

-- DROP SEQUENCE cliente_seq RESTRICT;
-- DROP SEQUENCE mesa_seq RESTRICT;
-- DROP SEQUENCE turno_seq RESTRICT;
-- DROP SEQUENCE periodo_seq RESTRICT;

CREATE SEQUENCE cliente_seq AS INTEGER START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE mesa_seq AS INTEGER START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE turno_seq AS INTEGER START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE periodo_seq AS INTEGER START WITH 1 INCREMENT BY 1;

INSERT INTO TURNO(Id, Nome) VALUES(NEXT VALUE FOR turno_seq, 'Manhã');
INSERT INTO TURNO(Id, Nome) VALUES(NEXT VALUE FOR turno_seq, 'Tarde');
INSERT INTO TURNO(Id, Nome) VALUES(NEXT VALUE FOR turno_seq, 'Noite');

select * from turno