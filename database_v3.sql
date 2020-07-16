drop database if exists purchase_manager;
create database purchase_manager;
use purchase_manager;
create table category(
category_id int auto_increment primary key,
category_name nvarchar(100) not null);
create table goods(
good_id int auto_increment primary key,
good_name nvarchar(255) not null,
price int not null,
quantity int not null,
category nvarchar(50) not null,
trade_mask nvarchar(255),
sale_off int,
price_for_sale_off int,
delete_flag tinyint default null,
category_id int,
foreign key (category_id) references category(category_id)
);
insert into goods(good_name,price,quantity,category,sale_off) values
("Tủ mát MCD okiwi 1200 lít nhập khẩu",17500000,5,"Đồ gia dụng",5),
("Asus mới mua ssd 256 nvme bh gần 2 năm",7280000,2,"Đồ điện tử",20),
("Chân máy ảnh Nhật hàng cao cấp tải nặng",1300000,10,"Đồ điện tử",10),
("Bàn phím kết nối điện thoại rẻ ở T PLUS MOBILE NHA",100000,1,"Đồ điện tử",0),
("Camera an ninh theo dõi từ xa",489000,20,"Đồ điện tử",10),
("Detox Hoa quả sấy",230000,30,"Thực phẩm",50),
("Yaour sữa chua nhà làm",5000,100,"Thực phẩm",0),
("Ghẹ xanh sống",290000,8,"Thực phẩm",10),
("Orient Star Limited Semi Skeleton Re-av0111l00b",10800000,4,"Phụ kiện thời trang",30),
("Giày nhựa Native",80000,35,"Phụ kiện thời trang",25);
create table roles(
role_id int auto_increment primary key,
role_name varchar(50) default null);
insert into roles(role_name) values ("ROLE_ADMIN"),("ROLE_MEMBER"),("ROLE_GUEST");
create table users(
user_id int auto_increment primary key,
user_name varchar(25) not null,
fullName nvarchar(25) not null,
password varchar(25) not null,
delete_flag tinyint default null
);
insert into users(user_name,fullName,password) values
("Lam","Văn Nhân Lam","vnnhnlm"),
("Hòa","Nguyễn Đình Hòa","thatrathi"),
("Hùng","Võ Minh Hùng","vmhung"),
("Tân","Trần Ngọc Tân","mylinh");
create table role_user(
role_user_id int auto_increment primary key,
role_id int,
user_id int,
foreign key (role_id) references roles(role_id),
foreign key (user_id) references users(user_id)
);
create table bills(
bill_id int auto_increment primary key,
create_date datetime not null,
bill_type int not null,
quantity int not null,
delete_flag tinyint default null,
good_id int,
user_id int,
foreign key (good_id) references goods(good_id),
foreign key (user_id) references users(user_id)
);
insert into bills(create_date,bill_type,quantity,good_id,user_id) values
("2020-07-04",0,1,2,1),
("2020-04-03",1,1,1,3),
("2019-12-31",0,1,5,4),
("2000-02-28",1,1,4,2),
("2020-06-05",0,1,10,1),
("2020-02-07",1,1,9,3),
("2016-10-31",0,1,8,4),
("2006-10-10",1,1,7,2);