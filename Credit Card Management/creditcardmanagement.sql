drop table transactions;
drop table customer;
drop table card;
drop table creditlimit;

drop database creditcard;

create database creditcard;

use creditcard;

create table card(
card_id int primary key,
card_number varchar(17),
exp_year int,
exp_month int,
pin int,
card_type varchar(10),
date_of_issue date,
blocked_status varchar(4)
);


create table customer (
customer_id int primary key,
first_name varchar(25),
last_name varchar(25),
contact_number int,
email varchar(40),
password varchar(50),
card_id int,
foreign key (card_id) references card(card_id)
);

create table transactions(
transaction_id int primary key,
customer_id int,
card_id int,
transaction_type varchar(10),
transaction_time timestamp,
foreign key (customer_id) references customer(customer_id),
foreign key (card_id) references card(card_id)
);


create table creditlimit(
card_id int primary key,
current_limit int,
limit_request int,
request_status varchar(10)
);
