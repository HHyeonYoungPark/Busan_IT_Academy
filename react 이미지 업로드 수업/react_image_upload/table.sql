CREATE DATABASE reactjs;

use reactjs;

CREATE TABLE users(
id INT NOT NULL AUTO_INCREMENT,
username VARCHAR(30),
email VARCHAR(100),
phone VARCHAR(13),
image VARCHAR(255),
regdate VARCHAR(255),
PRIMARY KEY(id) 
);