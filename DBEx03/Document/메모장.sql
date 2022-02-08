
create table memo
(
	mno int primary key auto_increment, 
	mtitle varchar(200),
	mnote text,
	mdate datetime default now()
);

insert into memo (mtitle,mnote) values
('첫 번째 제목입니다.','첫 번째 메모입니다.'),
('두 번째 제목입니다.','두 번째 메모입니다.'),
('세 번째 제목입니다.','세 번째 메모입니다.');



insert into memo (mnote) values('첫 번째 메모입니다');
insert into memo (mnote) values('두 번째 메모입니다');
insert into memo (mnote) values('세 번째 메모입니다');
