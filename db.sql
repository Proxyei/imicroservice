drop database if exists clouddb01;
create database clouddb01 character set utf8;
use clouddb01;
drop table if exists person;
-- 与java 映射时候要保证名字一致， 创建表很严格，表名后面紧跟( ,varchar 后面必须有长度指定
create table  person(
	id bigint not null primary key auto_increment,
    personName varchar(50),
    dbSource varchar(50) 
);
insert into person(personName,dbSource)  values('wwww',database()),('xxx',database()),('yyy',database()),('为学院',database()),('天天天',database());
select * from person;


