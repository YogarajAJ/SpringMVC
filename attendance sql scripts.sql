create database attendance;

use attendance;

create table employee (
id int primary key,
first_name varchar(30),
last_name varchar(30),
email_id varchar(40)
);

insert into employee values (
1001,
'Cheenu',
'Preethi',
'ajyoga18@gmail.com'
);

-- select * from employee;

drop table checkin_data ;

create table checkin_data (
id int primary key,
in_time timestamp,
out_time timestamp
);

select * from checkin_data;