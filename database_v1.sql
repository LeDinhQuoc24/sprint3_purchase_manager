drop database if exists purchase_manager;
create database purchase_manager;
use purchase_manager;
create table goods(
good_id int(11) auto_increment primary key,
good_name varchar(50) not null,
price int(20) not null,
quantity int (20) not null,
category varchar(50) not null,
trademask varchar(255) not null,
sale_off int(11),
price_for_sale_off int(20),
delete_flag tinyint(4) default null
);
create table users(
user_id int(11) auto_increment primary key,
user_name varchar(25) not null,
full_name varchar(25) not null,
password varchar(25) not null,
delete_flag tinyint(4) default null
);
create table bills(
bill_id int(11) auto_increment primary key,
create_date date,
bill_type varchar(25) not null,
quantity int(20) not null,
delete_flag tinyint(4) default null,
good_id int(11),
user_id int(11),
foreign key (good_id) references goods(good_id),
foreign key (user_id) references users(user_id)
);