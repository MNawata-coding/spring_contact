CREATE TABLE contact (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  email varchar(255) NOT NULL,
  content text,
  PRIMARY KEY (id)
)