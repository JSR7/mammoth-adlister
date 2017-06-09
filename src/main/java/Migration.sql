USE adlister_db;

DROP Table if exists ads;
drop table if exists users;

create table users (
id int unsigned not null AUTO_INCREMENT,
  username VARCHAR(200) not null,
  password VARCHAR(100) not NULL ,
  email VARCHAR(200) not null,
  primary KEY (id)
);

create table ads (
  id Int unsigned not null,
  user_id int UNSIGNED NOT NULL,
  title VARCHAR(200) not null,
  description text not null,
  primary KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id)
  on DELETE CASCADE

);