--create author_id_sequence
DROP SEQUENCE IF EXISTS author_id_seq CASCADE;
CREATE SEQUENCE author_id_seq
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1;

--create table author
DROP TABLE IF EXISTS author;
CREATE TABLE author (
	id serial NOT NULL,
	name varchar(50) NOT NULL
);

--create comment_id_sequence
DROP SEQUENCE IF EXISTS article_id_seq CASCADE;
CREATE SEQUENCE article_id_seq
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1;

--create table article
DROP TABLE IF EXISTS article;
CREATE TABLE article (
	id serial NOT NULL,
	title varchar(50) NOT NULL,
	body varchar(500) NOT NULL,
	author_id int4 NOT NULL,
	created_at timestamp NULL,
	lastmodified timestamp NULL DEFAULT now()
);

--create comment_id_sequence
DROP SEQUENCE IF EXISTS comment_id_seq CASCADE;
CREATE SEQUENCE comment_id_seq
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1;
--create table comment
DROP TABLE IF EXISTS comment;
CREATE TABLE comment (
	id serial NOT NULL,
	article_id int4 NOT NULL,
	text varchar(500) NOT NULL,
	author_id int4 NOT NULL,
	created_at timestamp NULL DEFAULT now()
);
---created_at
alter table article
	alter column created_at
		set default current_timestamp;
update article
	set created_at=current_timestamp;

---lastmodified
alter table article
	alter column lastmodified
		set default current_timestamp;
update article
	set lastmodified=current_timestamp;

--lastmodified auto trigger
CREATE OR REPLACE FUNCTION update_lastmodified_column()
        RETURNS TRIGGER as '
  BEGIN
    NEW.lastmodified = NOW();
    RETURN NEW;
  END;
'
LANGUAGE plpgsql;

DROP TRIGGER IF EXISTS update_lastmodified_trigger on "article";
CREATE TRIGGER update_lastmodified_trigger BEFORE UPDATE
  ON article FOR EACH ROW EXECUTE PROCEDURE
  update_lastmodified_column();

--created_at auto trigger
CREATE OR REPLACE FUNCTION update_created_at_column()
        RETURNS TRIGGER as '
  BEGIN
    NEW.created_at = NOW();
    RETURN NEW;
  END;
'
LANGUAGE plpgsql;

DROP TRIGGER IF EXISTS update_created_at_trigger on "article";
CREATE TRIGGER update_created_at_trigger BEFORE INSERT
  ON article FOR EACH ROW EXECUTE PROCEDURE
  update_created_at_column();