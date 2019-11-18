use creditcard;

desc card;

INSERT INTO `creditcard`.`card`
(`card_id`,
`card_number`,
`exp_year`,
`exp_month`,
`pin`,
`card_type`,
`date_of_issue`,
`blocked_status`)
VALUES
(1001 ,
1234123412341234,
24,
11,
1234,
'Visa',
'2019-11-17',
'no'
);


INSERT INTO `creditcard`.`customer`
(`customer_id`,
`first_name`,
`last_name`,
`contact_number`,
`email`,
`password`,
`card_id`)
VALUES
(
12345,
'Cheenu',
'Rathinam',
'9600097497',
'abc@gmail.com',
123,
1001);

desc customer;

desc card;

ALTER TABLE customer
MODIFY COLUMN contact_number varchar(13);

ALTER TABLE card
MODIFY COLUMN card_number varchar(17);

select * from customer;
select * from card;

truncate table customer;
delete from customer where customer_id=8825;
delete from card where card_id=9387;
