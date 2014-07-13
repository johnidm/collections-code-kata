# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table users (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  observacao                varchar(255),
  constraint pk_users primary key (id))
;

create table validacao (
  id                        bigint auto_increment not null,
  nome                      varchar(255),
  email                     varchar(255),
  cep                       varchar(255),
  idade                     integer,
  constraint pk_validacao primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table users;

drop table validacao;

SET FOREIGN_KEY_CHECKS=1;

