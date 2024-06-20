describe usuarios;
select * from usuarios;

insert into usuarios (nome_usuario, username_usuario, email_usuario, senha_usuario)
values ('Letícia', 'lelet23','leticia@gmail','leticia123'),
('Daniel', 'dannox10','daniel@gmail','daniel123'),
('Erik', 'erikito77','erik@gmail','erik123'),
('Gretzel', 'katchau20','gretzel@gmail','gretzel123'),
('Isaque', 'zaza01','isaque@gmail','isaque123'),
('Christian', 'chris33','christian@gmail','christian123'),
('Gustavo', 'bosak76','gustavo@gmail','gustavo123'),
('Eduardo', 'dudu55','eduardo@gmail','eduardo123');

describe pagamento;
select * from pagamento;

insert into pagamento (id_usuario, numero_cartao, cvv_cartao, data_validade_cartao, nome_cartao) 
values ('7','4539-1734-2112-5673', '123', '2025-12-01', 'Gustavo Bosak Santos'),
('3','5258-8410-4155-2865', '456', '2024-09-01', 'Gustavo Bosak Santos'),
('8','4716-1025-2821-7301', '789', '2023-06-01', 'Erik Paulino Tertuliano'),
('2','6011-6626-7491-4036', '321', '2026-03-01', 'Daniel Fernandes Santos'),
('4','4916-3368-7765-7737', '109', '2027-11-01', 'Gretzel Kattia Laura Penaloza'),
('6','5240-9604-9821-9763', '246', '2023-08-01', 'Christian William Neves Mendes'),
('5','4024-0071-9363-1672', '357', '2025-05-01', 'Isaque Barbosa de Souza'),
('1','4532-3434-3434-5566', '432', '2024-02-01', 'Letícia Nascimento de Almeida');

describe pagamento_status;
select * from pagamento_status;

insert into pagamento_status (id_pagamento, status_pagamento) values
('3','0'),
('5','0'),
('8','1'),
('6','0'),
('1','1'),
('2','1'),
('4','1'),
('7','0');

describe eventos;
select * from eventos;

insert into eventos (nome_evento, endereco_evento, numero_evento, data_evento, horario_evento) values
('Comunicação e Expressão', 'Rua das Flores', '123', '2024-07-15', '18:00'),
('Inteligencia Emocional no Trabalho', 'Avenida Central', '456', '2024-09-11', '09:30'),
('Proatividade dos Estagiários', 'Calle Principal', '789', '2024-12-16', '14:00'),
('Empatia e Inclusão', 'Park Lane', '101', '2024-08-31', '16:30'),
('Gestão de Tempo e Organização', 'Avenue du Commerce', '234', '2024-10-03', '10:00');

describe voluntarios;
select * from voluntarios;

insert into voluntarios (nome_completo_voluntario, email_voluntario, descricao_atividade_voluntariada, data_disponibilidade_voluntario, linkedin_voluntario) values
('Gabriel Augusto Azevedo', 'gabriel@gmail', 'Palestra sobre comportamento no ambiente profissional', '2024-06-20', 'www.gabriel.linkedin'),
('Adriana Parravano Neves', 'adriana@gmail', 'Palestra sobre gestão de tempo', '2024-06-21', 'www.adriana.linkedin'),
('Aurora Seles', 'aurora@gmail', 'Palestra sobre comunicação', '2024-06-22', 'www.aurora.linkedin'),
('Débora Paixão', 'debora@gmail', 'Palestra sobre resiliência', '2024-06-23', 'www.debora.linkedin'),
('Jailson Costa dos Santos', 'jailson@gmail', 'Palestra sobre trabalho em equipe', '2024-06-24', 'www.jailson.linkedin');

describe voluntario_staus;
select * from voluntario_status;

insert into voluntario_status (id_voluntario, status_voluntario) values
('2', '1'),
('3', '0'),
('5', '1'),
('1', '1'),
('4', '0');








