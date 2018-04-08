--create table article
DROP TABLE IF EXISTS article;
CREATE TABLE article (
	id uuid NOT NULL,
	title varchar(50) NOT NULL,
	body varchar(500) NOT NULL,
	author varchar(50) NOT NULL,
	created_at timestamp NULL,
	lastmodified timestamp NULL DEFAULT now()
);
--id
ALTER TABLE article ALTER COLUMN id SET DEFAULT uuid_in((md5((random())::text))::cstring);

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