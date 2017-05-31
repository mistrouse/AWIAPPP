# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table document (
  id                            bigint not null,
  title                         varchar(255),
  creation_date                 timestamp,
  constraint pk_document primary key (id)
);
create sequence document_seq;

create table groupe (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_groupe primary key (id)
);
create sequence groupe_seq;

create table groupe_user (
  groupe_id                     bigint not null,
  user_id                       bigint not null,
  constraint pk_groupe_user primary key (groupe_id,user_id)
);

create table message (
  id                            bigint not null,
  content                       varchar(255),
  creation_date                 timestamp,
  autheur_id                    bigint not null,
  groupe_id                     bigint,
  document_id                   bigint,
  constraint pk_message primary key (id)
);
create sequence message_seq;

create table user (
  id                            bigint not null,
  name                          varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  role                          integer,
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id)
);
create sequence user_seq;

alter table groupe_user add constraint fk_groupe_user_groupe foreign key (groupe_id) references groupe (id) on delete restrict on update restrict;
create index ix_groupe_user_groupe on groupe_user (groupe_id);

alter table groupe_user add constraint fk_groupe_user_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_groupe_user_user on groupe_user (user_id);

alter table message add constraint fk_message_autheur_id foreign key (autheur_id) references user (id) on delete restrict on update restrict;
create index ix_message_autheur_id on message (autheur_id);

alter table message add constraint fk_message_groupe_id foreign key (groupe_id) references groupe (id) on delete restrict on update restrict;
create index ix_message_groupe_id on message (groupe_id);

alter table message add constraint fk_message_document_id foreign key (document_id) references document (id) on delete restrict on update restrict;
create index ix_message_document_id on message (document_id);


# --- !Downs

alter table groupe_user drop constraint if exists fk_groupe_user_groupe;
drop index if exists ix_groupe_user_groupe;

alter table groupe_user drop constraint if exists fk_groupe_user_user;
drop index if exists ix_groupe_user_user;

alter table message drop constraint if exists fk_message_autheur_id;
drop index if exists ix_message_autheur_id;

alter table message drop constraint if exists fk_message_groupe_id;
drop index if exists ix_message_groupe_id;

alter table message drop constraint if exists fk_message_document_id;
drop index if exists ix_message_document_id;

drop table if exists document;
drop sequence if exists document_seq;

drop table if exists groupe;
drop sequence if exists groupe_seq;

drop table if exists groupe_user;

drop table if exists message;
drop sequence if exists message_seq;

drop table if exists user;
drop sequence if exists user_seq;

