/* CREATE AND USE DATABASE  */
CREATE DATABASE jpahibernate;
USE jpahibernate;

SHOW TABLES;

DROP TABLE ProductDetails, Product, T_Order;

/* CREATE FIRST ENTIY */
CREATE TABLE Product (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    description VARCHAR(255),
    price NUMERIC,
    quantity INT
);

/* TESTING ONE TO ONE */
CREATE TABLE ProductDetails(
	id_product_details INT PRIMARY KEY AUTO_INCREMENT,
    stock INT,
    supplier VARCHAR(255),
    purchasePrice FLOAT,
    id_product INT UNIQUE NOT NULL REFERENCES Product(id)
);

/* TESTING ONE TO MANY AND MANY TO ONE */
CREATE TABLE T_Order(
	id INT PRIMARY KEY AUTO_INCREMENT,
    total_price FLOAT,
    quantity INT,
    date DATE,
    product_id INT NOT NULL REFERENCES product(id)
);

INSERT INTO T_Order (total_price, quantity, date, product_id) VALUES 
(100.5, 19, '2018-09-24', 6),
(10.5, 15, '2008-05-30', 6),
(20.5, 26, '2016-09-24', 6),
(280.5, 12, '2015-09-24', 6);

INSERT INTO ProductDetails(stock, purchasePrice, supplier, id_product) VALUES 
(25, 3.5, "Google", 1),
(5, 5.5, "Amazon", 2),
(15, 10.5, "Microsoft", 3),
(52, 14.5, "Apple", 4);

SELECT * FROM Product;
SELECT * FROM ProductDetails;
SELECT * FROM T_Order;


DROP TABLE user, T_Role, role_user_association, user_informations, credit_card;

/* FIRST ENTITY */
CREATE TABLE user(
	id INT PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
    age INT
);
/* MANY TO MANY */
CREATE TABLE T_Role(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255)
);

CREATE TABLE role_user_association(
	id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL REFERENCES user(id),
    role_id INT NOT NULL REFERENCES T_Role(id)
);
/* ONE TO ONE */
CREATE TABLE user_informations (
	id_user_informations INT PRIMARY KEY AUTO_INCREMENT,
    address VARCHAR(255),
    city VARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(255),
    user_id INT UNIQUE NOT NULL REFERENCES user(id)
);
/* MANY TO ONE AND ONE TO MANY*/
CREATE TABLE credit_card(
	id_credit_card INT PRIMARY KEY AUTO_INCREMENT,
	card_code VARCHAR(20),
    date_exp VARCHAR(5),
    user_id INT NOT NULL REFERENCES user(id)
);

INSERT INTO T_Role(name) VALUES 
('ADMIN'),
('CUSTOMER'),
('SUPER_ADMIN'),
('SELLER');
INSERT INTO role_user_association(user_id, role_id) VALUES
(1, 1),
(1, 2),
(1, 4),
(2, 1),
(3, 4);
INSERT INTO USER (first_name, last_name, age) VALUES 
('Php', 'Laravel', 1),
('JavaScript', 'NodeJs', 29),
('Java', 'Spring', 25),
('Java', 'JEE', 12),
('Java', 'Kotlin', 5);
INSERT INTO user_informations (address, city, email, phone_number, user_id) VALUES
('France', 'Rennes', 'php@laravel.com', '0600000000',1),
('France', 'Paris', 'js@nodejs.com', '0600000000',2),
('France', 'Vannes', 'java@spring.com', '0600000000',3),
('Angleterre', 'Londres', 'java@jee.com', '0600000000',4),
('USA', 'NewYork', 'java@kotlin.com', '0600000000',5);
INSERT INTO credit_card(card_code, date_exp, user_id) VALUES
("5341 XXXX XXXX 0564", "12/24", 1),
("5341 XXXX XXXX 0548", "08/25", 1),
("2054 XXXX XXXX 5482", "06/24", 2),
("2095 XXXX XXXX 8049", "02/25", 3);


SHOW TABLES;

SELECT R.* FROM T_Role as R, role_user_association as RU, user AS U WHERE RU.user_id = U.id AND RU.role_id = R.id AND U.id = 1;
SELECT * FROM T_Role;
SELECT * FROM User, T_Role;
SELECT * FROM user;
SELECT * FROM user_informations;
SELECT * FROM user, user_informations WHERE user_informations.user_id = user.id;
SELECT * FROM user, credit_card WHERE credit_card.user_id = user.id;













