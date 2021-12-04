create database compose-postgres;

CREATE SEQUENCE hibernate_sequence
INCREMENT 1
START 1;

create table Product (
    SKU SERIAL primary key,
    TITLE varchar(255) not null,
    DESCRIPTION varchar(255) not null,
    PRICE float,
    QUANTITY int
);


