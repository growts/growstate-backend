create schema growstate;

create table DATABASECHANGELOG
(
	ID VARCHAR(255) not null,
	AUTHOR VARCHAR(255) not null,
	FILENAME VARCHAR(255) not null,
	DATEEXECUTED TIMESTAMP(6) not null,
	ORDEREXECUTED NUMERIC not null,
	EXECTYPE VARCHAR(10) not null,
	MD5SUM VARCHAR(35),
	DESCRIPTION VARCHAR(255),
	COMMENTS VARCHAR(255),
	TAG VARCHAR(255),
	LIQUIBASE VARCHAR(20),
	CONTEXTS VARCHAR(255),
	LABELS VARCHAR(255),
	DEPLOYMENT_ID VARCHAR(10)
);

create table DATABASECHANGELOGLOCK
(
	ID NUMERIC not null primary key,
	LOCKED NUMERIC(1) not null,
	LOCKGRANTED TIMESTAMP(6),
	LOCKEDBY VARCHAR(255)
);
