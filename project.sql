create database project;
use project;
create table student( id bigint primary key auto_increment,studentname varchar(233),course varchar(233),percentage int,mailid varchar(233),
	college varchar(233),roll long,qualification varchar(233),hallticketno int);
    select * from student;
    create table college( id bigint primary key auto_increment,collegename varchar(233),collegelocation varchar(233),collegeadmin varchar(233),collegeemail varchar(233));
    select * from college;
    create table placement(id bigint primary key auto_increment,name varchar(233),college varchar(233),date date,qualification varchar(233),year varchar(233));
    select * from placement;
    create table login(id bigint primary key auto_increment,username varchar(233),password varchar(233));
    select * from login;
