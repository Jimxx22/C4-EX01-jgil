drop table if exists usuarios_grupos;
drop table if exists mensajes;
drop table if exists grupos;
drop table if exists videojuegos;
drop table if exists usuarios;

Create table usuarios(
	id int auto_increment,
	username varchar(100) not null,
	password varchar(100) not null,
	email varchar(255) not null,
	role varchar(100) not null,
	first_name varchar(255),
	last_name varchar(255),
	primary key (id)
);

Create table videojuegos(
	id int auto_increment,
	name varchar(100) not null,
	primary key (id)
);

Create table grupos(
	id int auto_increment,
	name varchar(100) not null,
    id_usuario_admin int,
    id_videojuego int,
	primary key (id),
	constraint fk_usuario_admin_grupo foreign key (id_usuario_admin)
    references usuarios(id) ON DELETE CASCADE ON UPDATE CASCADE,
	constraint fk_videojuego_grupo foreign key (id_videojuego)
    references videojuegos(id) ON DELETE CASCADE ON UPDATE CASCADE
);

Create table mensajes(
	id int auto_increment,
	contenido varchar(255) not null,
    date_mensaje datetime not null,
	id_usuario int,
    id_grupo int,
	primary key (id),
	constraint fk_usuario_mensaje foreign key (id_usuario)
    references usuarios(id) ON DELETE CASCADE ON UPDATE CASCADE,
	constraint fk_grupo_mensaje foreign key (id_grupo)
    references grupos(id) ON DELETE CASCADE ON UPDATE CASCADE
);

Create table usuarios_grupos(
	id int auto_increment,
	id_usuario int,
    id_grupo int,
	primary key (id),
	constraint fk_usuario_grupo foreign key (id_usuario)
    references usuarios(id) ON DELETE CASCADE ON UPDATE CASCADE,
	constraint fk_grupo_usuario foreign key (id_grupo)
    references grupos(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO usuarios (username, email, password, first_name, last_name, role) VALUES ('smelgar', 'smelgar@tsystems.com', 'smelgar_1', 'Sebastian', 'Melgar', 'admin');
INSERT INTO usuarios (username, email, password, first_name, last_name, role) VALUES ('ccampillo', 'ccampillo@tsystems.com', 'ccampillo_1', 'Camilo', 'Campillo','user');
INSERT INTO usuarios (username, email, password, first_name, last_name, role) VALUES ('gcalvo', 'gcalvo@tsystems.com', 'gcalvo_1', 'Gerardo', 'Calvo','user');
INSERT INTO usuarios (username, email, password, first_name, last_name, role) VALUES ('epostigo', 'epostigo@tsystems.com', 'epostigo_1', 'Elias', 'Postigo','user');
INSERT INTO usuarios (username, email, password, first_name, last_name, role) VALUES ('fbrito', 'fbrito@tsystems.com', 'fbrito_1', 'Ferran', 'Brito','user');

Insert into videojuegos (name) values('Super Mario Odyssey');
Insert into videojuegos (name) values('Fifa 22');
Insert into videojuegos (name) values('Assassin\'s Creed Valhalla');
Insert into videojuegos (name) values('Dark Souls III');
Insert into videojuegos (name) values('Call of Duty: Black Ops');

Insert into grupos (name, id_usuario_admin, id_videojuego) values ('grupo1', 1, 1);
Insert into grupos (name, id_usuario_admin, id_videojuego) values ('grupo2', 11, 21);
Insert into grupos (name, id_usuario_admin, id_videojuego) values ('grupo3', 1, 31);
Insert into grupos (name, id_usuario_admin, id_videojuego) values ('grupo4', 21, 1);
Insert into grupos (name, id_usuario_admin, id_videojuego) values ('grupo5', 31, 41);

Insert into mensajes (contenido, date_mensaje, id_usuario, id_grupo) values('Hola, soy admin', now(), 1, 1);
Insert into mensajes (contenido, date_mensaje, id_usuario, id_grupo) values('Hay alguien?', now(), 1, 31);
Insert into mensajes (contenido, date_mensaje, id_usuario, id_grupo) values('Quiero jugar', now(), 1, 21);
Insert into mensajes (contenido, date_mensaje, id_usuario, id_grupo) values('Alguien?', now(), 1, 41);
Insert into mensajes (contenido, date_mensaje, id_usuario, id_grupo) values('Adios', now(), 1, 11);

Insert into usuarios_grupos(id_usuario, id_grupo) values(1, 1);
Insert into usuarios_grupos(id_usuario, id_grupo) values(1, 11);
Insert into usuarios_grupos(id_usuario, id_grupo) values(1, 21);
Insert into usuarios_grupos(id_usuario, id_grupo) values(1, 31);
Insert into usuarios_grupos(id_usuario, id_grupo) values(1, 41);