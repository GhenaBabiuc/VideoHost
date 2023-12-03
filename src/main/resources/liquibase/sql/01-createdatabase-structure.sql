--liquibase formatted sql

--changeset gbabiuc:create-users-schema splitStatements:false
CREATE SCHEMA IF NOT EXISTS users;

--changeset gbabiuc:create-movie-schema splitStatements:false
CREATE SCHEMA IF NOT EXISTS movie;