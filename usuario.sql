create table usuario (
   usuid                SERIAL not null,
   usunombre       varchar  (100)               not null,
	usuapellido       varchar  (100)               not null,
    primary key (usuid)
);
insert into usuario (usunombre, usuapellido) values ('Marco','Guaman');
insert into usuario (usunombre, usuapellido) values ('Juan','Perez');



/*Script para heroku postgres*/

create table usuario(
usuid SERIAL,
usunombre varchar (100),
usuapellido varchar (100)
);
insert into usuario (usunombre,usuapellido) values ('Marco','Guaman');

create table preferencia(
id SERIAL,
descripcion varchar (100)
);

insert into preferencia (descripcion) values ('Voley');
