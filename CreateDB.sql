--create database compose-postgres;
--grant all privileges on database compose-postgres to compose-postgres;
--use compose-postgres;
--CREATE SEQUENCE hibernate_sequence
--INCREMENT 1
--START 1;
--
--create table Product (
--    SKU SERIAL primary key,
--    TITLE varchar(255) not null,
--    DESCRIPTION varchar(255) not null,
--    PRICE float,
--    QUANTITY int
--);

--create database pim;
--grant all privileges on database pim to docker;

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