
CREATE TABLE IF NOT EXISTS Usuario (
  usuario VARCHAR(45) NOT NULL,
  nome VARCHAR(100) NOT NULL,
  sobrenome VARCHAR(200) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(45) NOT NULL,
  PRIMARY KEY (usuario) )
;

CREATE TABLE IF NOT EXISTS TipoResposta (
  id SERIAL NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  PRIMARY KEY (id) )
;

CREATE TABLE IF NOT EXISTS TipoPergunta (
  id SERIAL NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  TipoResposta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoResposta_id)
    REFERENCES TipoResposta (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE TABLE IF NOT EXISTS TipoQuestionario (
  id SERIAL NOT NULL,
  nome VARCHAR(100) NOT NULL,
  descricao VARCHAR(300) NULL,
  TipoPergunta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoPergunta_id)
    REFERENCES TipoPergunta (id))
;

CREATE TABLE IF NOT EXISTS Questionario (
  id SERIAL NOT NULL,
  nome VARCHAR(100) NOT NULL,
  descricao VARCHAR(300) NULL,
  Usuario_usuario VARCHAR(45) NOT NULL,
  TipoQuestionario_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (Usuario_usuario)
    REFERENCES Usuario (usuario)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY (TipoQuestionario_id)
    REFERENCES TipoQuestionario (id))
;

CREATE TABLE IF NOT EXISTS Pergunta (
  id SERIAL NOT NULL,
  pergunta VARCHAR(300) NOT NULL,
  TipoPergunta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoPergunta_id)
    REFERENCES TipoPergunta (id))
;

CREATE TABLE IF NOT EXISTS Resposta (
  id SERIAL NOT NULL,
  resposta VARCHAR(45) NOT NULL,
  TipoResposta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoResposta_id)
    REFERENCES TipoResposta (id))
;

CREATE TABLE IF NOT EXISTS Campus (
  id SERIAL NOT NULL,
  campus VARCHAR(100) NOT NULL,
  PRIMARY KEY (id) )
;

CREATE TABLE IF NOT EXISTS Curso (
  id SERIAL NOT NULL,
  curso VARCHAR(150) NOT NULL,
  Campus_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (Campus_id)
    REFERENCES Campus (id))
;

CREATE TABLE IF NOT EXISTS Disciplina (
  id SERIAL NOT NULL,
  disciplina VARCHAR(300) NOT NULL,
  Curso_id INT NOT NULL,
  periodo INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (Curso_id)
    REFERENCES Curso (id))
;

CREATE TABLE IF NOT EXISTS RespostaQuestionario (
  id SERIAL NOT NULL,
  alternativaMarcada VARCHAR(1) NOT NULL,
  semestreMarcado VARCHAR(6) NOT NULL,
  Questionario_id INT NOT NULL,
  Campus_id INT NOT NULL,
  Disciplina_id INT NOT NULL,
  Curso_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (Questionario_id)
    REFERENCES Questionario (id),
    FOREIGN KEY (Campus_id)
    REFERENCES Campus (id),
    FOREIGN KEY (Disciplina_id)
    REFERENCES Disciplina (id),
    FOREIGN KEY (Curso_id)
    REFERENCES Curso (id))
;

CREATE TABLE IF NOT EXISTS ListaRespostaMarcada (
  id SERIAL NOT NULL,
  RespostaQuestionario_id INT NOT NULL,
  Resposta_id INT NOT NULL,
  Pergunta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (RespostaQuestionario_id)
    REFERENCES RespostaQuestionario (id),
    FOREIGN KEY (Resposta_id)
    REFERENCES Resposta (id),
    FOREIGN KEY (Pergunta_id)
    REFERENCES Pergunta (id))
;