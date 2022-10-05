CREATE TABLE member(
idx INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(10) NOT NULL,
userid VARCHAR(20) NOT NULL,
pw VARCHAR(20) NOT NULL,
email VARCHAR(50) NOT NULL,
grade VARCHAR(10),
regdate date
);


CREATE TABLE board(
idx INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(20) NOT NULL,
username VARCHAR(20) NOT NULL,
content VARCHAR(300) NOT NULL,
visit INT,
regdate date
);
