CREATE DATABASE IF NOT EXISTS KBank;
GRANT ALL PRIVILEGES ON KBank.* TO root@'%' IDENTIFIED BY 'qwerty';

USE KBank;

CREATE TABLE IF NOT EXISTS currencies (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  value FLOAT
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS users (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(30),
  firstname VARCHAR(30),
  lastname VARCHAR(30),
  surname VARCHAR(30),
  password VARCHAR(30),
  role VARCHAR(30),
  sex BOOLEAN,
  birthday DATE,
  INDEX(email)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS messages (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  topic VARCHAR(32),
  text VARCHAR(1024),
  date_of_creating DATE,
  sender_id BIGINT UNSIGNED ,
  resiver_id BIGINT UNSIGNED ,
  FOREIGN KEY (sender_id) REFERENCES users(id),
  FOREIGN KEY (resiver_id) REFERENCES users(id)  
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS accounts (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  money FLOAT,
  type VARCHAR(32),
  date_of_creating DATE,    
  user_id BIGINT UNSIGNED ,
  FOREIGN KEY (user_id) REFERENCES users(id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS transactions (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  money FLOAT,
  commission FLOAT,
  type VARCHAR(32),
  date_of_creating DATE,
  account_id1 BIGINT UNSIGNED ,
  account_id2 BIGINT UNSIGNED ,  
  user_id1 BIGINT UNSIGNED ,
  user_id2 BIGINT UNSIGNED ,
  FOREIGN KEY (account_id1) REFERENCES accounts(id),
  FOREIGN KEY (account_id2) REFERENCES accounts(id),
  FOREIGN KEY (user_id1) REFERENCES users(id),
  FOREIGN KEY (user_id2) REFERENCES users(id)  
) engine=InnoDB;