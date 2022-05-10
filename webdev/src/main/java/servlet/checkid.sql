create table userid(
	id varchar2(30) primary key
);

insert into userid values('jay');
insert into userid values('su');
insert into userid values('hee');
insert into userid values('ju');

select count(id) as cnt
from userid
where id='su';