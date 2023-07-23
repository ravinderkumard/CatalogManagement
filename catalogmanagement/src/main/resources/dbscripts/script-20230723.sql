CREATE DATABASE Catalog
    DEFAULT CHARACTER SET = 'utf8mb4';
    

use Catalog;

create table CategoryGroup (
    id BIGINT NOT NULL AUTO_INCREMENT,
    catGroupCode varchar(256) UNIQUE,
    catGroupName varchar(128) NOT NULL,
    shortDescription varchar(500),
    longDescription varchar(500),
    imageUrl varchar(2048),
    thumbnailUrl VARCHAR(2048),
    parentCatGroup BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (parentCatGroup)
        REFERENCES CategoryGroup(id)
    );

