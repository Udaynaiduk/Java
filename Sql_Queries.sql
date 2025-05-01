https://bit.ly/FLM-Mysql-download

https://forms.gle/cC17ti5GxRUuY5BU8





DDL

CRETAE
------

CREATE DATABASE databasename;

CREATE DATABASE testDB;

CREATE TABLE employee;

ALTER
-----

-- ALTER TABLE sales add column (purchase_date date);

-- ALTER TABLE sales MODIFY COLUMN purchase_date DATETIME;

-- ALTER TABLE sales RENAME COLUMN purchase_date  TO purchaseday

-- ALTER TABLE sales  DROP COLUMN purchases;

RENAME
------

-- RENAME TABLE SALES TO SALE;

TRUNCATE
--------

TRUNCATE TABLE sale;

DROP
----

-- DROP TABLE sales

########################################################

DML
---

INSERT
------
INSERT INTO sale VALUES (2,'CAR');

INSERT INTO sale(item) VALUES('GUN');

UPDATE
------

UPDATE SALE SET id=100,item='BOX';

DELETE
------

DELETE FROM sale ;

#############################################

DQL
---

select * from sale;


DCL
---

SELECT user FROM mysql.user;

create user 'temp@localhost' identified by 'temp';

grant SELECT on bms.emp to 'temp2@localhost';

REVOKE SELECT on bms.emp from 'temp2@localhost'



TCL
---

SET autocommit=0;


SELECT * FROM emp;


UPDATE emp SET NAME='R';


COMMIT;

ROLLBACK;





################

SELECT * FROM employee;
-- Assignment operators

SELECT * FROM emp;

-- where id=1 ;

-- Arithm..

UPDATE employee SET sal=sal+100;

-- comparison

SELECT * FROM employee WHERE sal <= 300; -- cache (Map)

-- Logical operators
SELECT * FROM employee WHERE sal = 300 AND NAME = 'sai';

SELECT * FROM employee WHERE id BETWEEN 1 AND 2;

SELECT * FROM employee WHERE id NOT IN (1);

SELECT * FROM employee WHERE NAME IS NOT NULL;

SELECT * FROM employee WHERE dep LIKE '%Ops%';


-----------
Primary KEY
===========

orgid
accId
companyId
currencyId
regionId
bankId


create table user
(
cust_id int primary key auto_increment,
name varchar(42)

)
;

create table sales(
sale_id int primary key auto_increment,
product_name varchar(40) 

);

alter table sales

add foreign key (cus_id) references user(cust_id);


-----------

-- Aggregate Fn
---------------

select count(*) from table;

SELECT count( distinct col_name) from table;

select sum(id) from sal;

-- MAX

-- MIN

-- AVG
select AVG(id) from meetings;

select round(AVG(id)) from meetings; -- 2.3077

select round(AVG(id),2) from meetings; -- 2.3077


JOINS
-----


inner join --> common VALUES

-- SELECT * FROM cusj  JOIN  orderj k ON   cusj.id=k.cid

SELECT c.id,k.oamount FROM cusj c  JOIN  orderj k ON   c.id=k.cid

LJOIN

SELECT c.id,k.oamount FROM cusj c  LEFT JOIN  orderj k ON   c.id=k.cid

RJOIN
SELECT c.id,k.oamount FROM cusj c  RIGHT JOIN  orderj k ON   c.id=k.cid

==========

JDBC Drivers
------------

// com.mysql.jdbc.Driver
// com.mysql.cj.jdbc.Driver

// jdbc:mysql://127.0.0.1:3306/jdbcdemo
// jdbc:mysql://localhost:3306/jdbcdemo



