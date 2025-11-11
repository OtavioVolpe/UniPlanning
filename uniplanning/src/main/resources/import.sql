INSERT INTO Professor (nome, cpf, email, senha) VALUES
("Volpe", 39129011809, "otavio2leal@gmail.com", "123");

INSERT INTO Disciplina (nome, professor_id) VALUES
("MySQL", 1);

INSERT INTO Turma (nome) VALUES
("Turma A");

INSERT INTO Curso (nome, turma_id, disciplina_id) VALUES
("Engenharia de Software", 1, 1);

INSERT INTO Aluno (nome, cpf, email, senha, curso_id, turma_id) VALUES
("Lucas", 09876543211, "lucas2leal@gmail.com", 333, 1, 1);

INSERT INTO Progresso (disciplina_id, aluno_id) VALUES
(1, 5);

INSERT INTO Planner (prioridades, agenda, tarefas, aluno_id) VALUES
("Trabalho POO", "2025-11-11 09:40:00", "Escrever o Artigo", 5);

INSERT INTO Resumos (nome, aluno_id) VALUES
("POO em Java", 5);

INSERT INTO VideoAulas (titulo, curso_id, turma_id, professor_id) VALUES
("POO em Prática", 1, 1, 1);