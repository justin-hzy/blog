create table Blog (
	id varchar(500),
	title varchar(500),
	content varchar(500),
	firstPicture varchar(500),
	flag varchar(500),
	views varchar(500),
	appreciation varchar(500),
	shareStatement varchar(500),
	commentTabled varchar(500),
	published varchar(500),
	recommend varchar(500),
	createTime Date,
	updateTime Date
);


create table tag (
	id varchar(500),
	name varchar(500)
);

create table type (
	id varchar(500),
	name varchar(500)
);



create table Comment(
	id varchar(500),
	nickname varchar(500),
	email varchar(500),
	content varchar(500),
	avatar varchar(500),
	createTime varchar(500)
);


create table User(
	id varchar(500),
	nickname varchar(500),
	password varchar(500),
	email varchar(500),
	avatar varchar(500),
	type varchar(500),
	createTime varchar(500),
	updateTime varchar(500)
);