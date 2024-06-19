Create database buildar;

create table usuarios(
id_usuario int not null auto_increment primary key,
nome_usuario varchar(100) not null,
username_usuario varchar(20) not null,
email_usuario varchar(255) not null,
senha_usuario varchar(20) not null,
data_hora_cadastro_usuario timestamp default current_timestamp
);

create table if not exists pagamento(
id_pagamento int not null auto_increment primary key,
id_usuario int,
numero_cartao int not null,
cvv_cartao int not null,
data_validade_cartao date not null,
nome_cartao varchar(255) not null,
data_hora_pagamento timestamp default current_timestamp,
foreign key(id_usuario) references usuarios(id_usuario)
);

create table if not exists pagamento_status(
id_status_pagamento int not null auto_increment primary key,
id_pagamento int,
status_pagamento boolean,
foreign key (id_pagamento) references pagamento(id_pagamento)
);

create table if not exists eventos(
id_evento  int not null auto_increment primary key,
nome_evento varchar(255) not null,
endereço_evento varchar(500) not null,
numero_evento int not null,
data_evento date,
horario_evento time
);

create table if not exists voluntarios(
id_voluntario int not null auto_increment primary key,
nome_voluntario varchar(255) not null,
email_voluntario varchar(255) not null ,
descricao_atividade_voluntariada varchar(500) not null,
data_disponibilidade_voluntario date,
linkedin_voluntario text,
data_hora_cadastro_voluntario timestamp default current_timestamp
);

create table if not exists voluntario_status(
id_status_voluntario int not null auto_increment primary key,
id_voluntario int,
status_voluntario boolean,
foreign key (id_voluntario) references voluntarios(id_voluntario)
);







