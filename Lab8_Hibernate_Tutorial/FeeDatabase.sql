CREATE DATABASE fee;
USE fee;

CREATE TABLE feeslip (
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	regno INT,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    fee_month VARCHAR(50),
    total_fee VARCHAR(50)
);

