# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table users (
  id                        bigint not null,
  name                      varchar(255),
  email                     varchar(255),
  observacao                varchar(255),
  constraint pk_users primary key (id))
;

create sequence users_seq;




# --- !Downs

drop table if exists users cascade;

drop sequence if exists users_seq;

