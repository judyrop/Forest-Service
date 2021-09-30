SET MODE POSTGRESQL ;
CREATE TABLE animals (
    id int SERIAL PRIMARY KEY ,
name VARCHAR,
location VARCHAR,
ranger_name VARCHAR

);
CREATE TABLE endangered_animals (
    id int SERIAL PRIMARY KEY ,
    name VARCHAR,
    health VARCHAR,
    age VARCHAR,
    location VARCHAR,
    ranger_name VARCHAR

)