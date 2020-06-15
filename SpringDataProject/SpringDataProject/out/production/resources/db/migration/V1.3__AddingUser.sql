CREATE TABLE User(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(300) NOT NULL,
    email VARCHAR(50) NOT NULL,
    product INT NOT NULL,
    FOREIGN KEY (product) REFERENCES Product(id),
    PRIMARY KEY(id)
);

INSERT INTO User (name, password, email, product) VALUES ("nazwa1", "haslo1", "email1@gmail.com", 1);
INSERT INTO User (name, password, email, product) VALUES ("nazwa2", "haslo2", "email2@gmail.com", 7);
INSERT INTO User (name, password, email, product) VALUES ("nazwa3", "haslo3", "email3@gmail.com", 20);
INSERT INTO User (name, password, email, product) VALUES ("nazwa4", "haslo4", "email4@gmail.com", 13);
INSERT INTO User (name, password, email, product) VALUES ("nazwa5", "haslo5", "email5@gmail.com", 16);
INSERT INTO User (name, password, email, product) VALUES ("nazwa6", "haslo6", "email6@gmail.com", 3);
INSERT INTO User (name, password, email, product) VALUES ("nazwa7", "haslo7", "email7@gmail.com", 8);
INSERT INTO User (name, password, email, product) VALUES ("nazwa8", "haslo8", "email8@gmail.com", 12);
INSERT INTO User (name, password, email, product) VALUES ("nazwa9", "haslo9", "email9@gmail.com", 6);
INSERT INTO User (name, password, email, product) VALUES ("nazwa10", "haslo10", "email10@gmail.com", 5);