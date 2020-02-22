create table j_user(
	id int primary key auto_increment,
	username varchar(50),
	password varchar(50),
	ctime datetime
);

create table j_weixin(
	id int primary key auto_increment,
	weixin_name varchar(50) unique,
	real_name varchar(20),
	phone varchar(11),
	ctime datetime,
	mtime datetime
);

create table j_account(
	id int primary key auto_increment,
	username varchar(50) unique,
	password varchar(50),
	weixin_id int,
	ctime datetime,
	mtime datetime
);

create table j_game_role(
	id int primary key auto_increment,
	name varchar(50),
	description varchar(100),
	account_id int,
	ctime datetime,
	mtime datetime
);

create table j_task_type(
	id int primary key auto_increment,
	name varchar(50),
	description varchar(100),
	money double(10,2),
	unit varchar(20),
	ctime datetime,
	mtime datetime
);

create table j_task_status(
	id int primary key auto_increment,
	name varchar(20) -- 新建，已做完，关闭，撤销
);

create table j_pay_status(
	id int primary key auto_increment,
	name varchar(20) -- 未付款，已付款
);

create table j_task(
	id int primary key auto_increment,
	game_role_id int,
	task_type_id int,
	begin_date date,
	end_date date,
	task_status_id int,
	pay_status_id int,
	ctime datetime,
	mtime datetime,
	complete_date date
);

create table j_task_log(
	id int primary key auto_increment,
	task_id int,
	game_role_id int,
	task_type_id int,
	task_status_id int,
	pay_status_id int,
	money double(10,2),
	remark varchar(100),
	ctime timestamp default current_timestamp
);

create table j_money(
	id int primary key auto_increment,
	game_role_id int,
	money double(10,2),
	task_id int,
	ctime timestamp default current_timestamp
);


