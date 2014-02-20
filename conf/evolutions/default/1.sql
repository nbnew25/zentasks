# --- First database schema

# --- !Ups

create table account (
  id                        bigint not null AUTO_INCREMENT,
  email                     varchar(255) not null UNIQUE,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (id)
);

create table project (
  id                        bigint not null AUTO_INCREMENT,
  name                      varchar(255),
  folder                    varchar(255),
  constraint pk_project primary key (id)
);

create table task (
  id                        bigint not null AUTO_INCREMENT,
  title                     varchar(255),
  done                      boolean,
  due_date                  timestamp,
  assigned_to_id            bigint,
  folder                    varchar(255),
  project_id                bigint,
  constraint pk_task primary key (id),
  foreign key (assigned_to_id) references account (id) on delete set null on update restrict,
  foreign key (project_id) references project (id) on delete cascade on update restrict
);

create table project_account (
  project_id                     bigint not null,
  account_id                     bigint not null,
  constraint pk_project_account primary key (project_id, account_id),
  foreign key (project_id) references project (id) on delete cascade on update restrict,
  foreign key (account_id) references account (id) on delete cascade on update restrict
);


# --- !Downs

drop table if exists task;
drop table if exists project_account;
drop table if exists project;
drop table if exists account;


