
create table memo
(
	mno int primary key auto_increment, 
	mtitle varchar(200),
	mnote text,
	mdate datetime default now()
);

insert into memo (mtitle,mnote) values
('ù ��° �����Դϴ�.','ù ��° �޸��Դϴ�.'),
('�� ��° �����Դϴ�.','�� ��° �޸��Դϴ�.'),
('�� ��° �����Դϴ�.','�� ��° �޸��Դϴ�.');



insert into memo (mnote) values('ù ��° �޸��Դϴ�');
insert into memo (mnote) values('�� ��° �޸��Դϴ�');
insert into memo (mnote) values('�� ��° �޸��Դϴ�');
