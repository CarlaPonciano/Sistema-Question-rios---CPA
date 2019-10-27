
CREATE TABLE IF NOT EXISTS Usuario (
  usuario VARCHAR(45) NOT NULL,
  nome VARCHAR(100) NOT NULL,
  sobrenome VARCHAR(200) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(45) NOT NULL,
  PRIMARY KEY (usuario) )
;


-- -----------------------------------------------------
-- Table cpa.TipoResposta
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TipoResposta (
  id SERIAL NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  PRIMARY KEY (id) )
;


-- -----------------------------------------------------
-- Table cpa.TipoPergunta
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TipoPergunta (
  id SERIAL NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  TipoResposta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoResposta_id)
    REFERENCES cpa.TipoResposta (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;


-- -----------------------------------------------------
-- Table cpa.TipoQuestionario
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TipoQuestionario (
  id SERIAL NOT NULL,
  nome VARCHAR(100) NOT NULL,
  descricao VARCHAR(300) NULL,
  TipoPergunta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoPergunta_id)
    REFERENCES cpa.TipoPergunta (id))
;


-- -----------------------------------------------------
-- Table cpa.Questionario
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Questionario (
  id SERIAL NOT NULL,
  nome VARCHAR(100) NOT NULL,
  descricao VARCHAR(300) NULL,
  Usuario_usuario VARCHAR(45) NOT NULL,
  TipoQuestionario_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (Usuario_usuario)
    REFERENCES cpa.Usuario (usuario)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY (TipoQuestionario_id)
    REFERENCES cpa.TipoQuestionario (id))
;


-- -----------------------------------------------------
-- Table cpa.Pergunta
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Pergunta (
  id SERIAL NOT NULL,
  pergunta VARCHAR(300) NOT NULL,
  TipoPergunta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoPergunta_id)
    REFERENCES cpa.TipoPergunta (id))
;


-- -----------------------------------------------------
-- Table cpa.Resposta
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Resposta (
  id SERIAL NOT NULL,
  resposta VARCHAR(45) NOT NULL,
  TipoResposta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (TipoResposta_id)
    REFERENCES cpa.TipoResposta (id))
;


-- -----------------------------------------------------
-- Table cpa.Campus
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Campus (
  id SERIAL NOT NULL,
  campus VARCHAR(100) NOT NULL,
  PRIMARY KEY (id) )
;


-- -----------------------------------------------------
-- Table cpa.Curso
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Curso (
  id SERIAL NOT NULL,
  curso VARCHAR(150) NOT NULL,
  Campus_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (Campus_id)
    REFERENCES cpa.Campus (id))
;


-- -----------------------------------------------------
-- Table cpa.Disciplina
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Disciplina (
  id SERIAL NOT NULL,
  disciplina VARCHAR(300) NOT NULL,
  Curso_id INT NOT NULL,
  periodo INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (Curso_id)
    REFERENCES cpa.Curso (id))
;


-- -----------------------------------------------------
-- Table cpa.RespostaQuestionario
-- -----------------------------------------------------
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
    REFERENCES cpa.Questionario (id),
    FOREIGN KEY (Campus_id)
    REFERENCES cpa.Campus (id),
    FOREIGN KEY (Disciplina_id)
    REFERENCES cpa.Disciplina (id),
    FOREIGN KEY (Curso_id)
    REFERENCES cpa.Curso (id))
;


-- -----------------------------------------------------
-- Table cpa.ListaRespostaMarcada
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ListaRespostaMarcada (
  id SERIAL NOT NULL,
  RespostaQuestionario_id INT NOT NULL,
  Resposta_id INT NOT NULL,
  Pergunta_id INT NOT NULL,
  PRIMARY KEY (id) ,
    FOREIGN KEY (RespostaQuestionario_id)
    REFERENCES cpa.RespostaQuestionario (id),
    FOREIGN KEY (Resposta_id)
    REFERENCES cpa.Resposta (id),
    FOREIGN KEY (Pergunta_id)
    REFERENCES cpa.Pergunta (id))
;
