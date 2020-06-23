create table usuario (
   usuid                SERIAL not null,
   usunombre       varchar  (100)               not null,
	usuapellido       varchar  (100)               not null,
    primary key (usuid)
);
insert into usuario (usunombre, usuapellido) values ('Marco','Guaman');
insert into usuario (usunombre, usuapellido) values ('Juan','Perez');
