Create database college;
use college;
Create Table Student(StudentID varchar(9) primary key,
StudentName text(100), DOB date);

describe student;

Create table Course(CourseCode varchar(7) primary key, Coursename text);

describe Course;


alter table Student add CourseCode varchar(7);

alter table Student 
add constraint Course_StudentFK Foreign key(CourseCode) references Course(CourceCode);

describe student;

alter table student add Streetname varchar(65), add town varchar(65), add County varchar(65);

alter table student modify StreetName varchar(100);

alter table student drop DOB;

alter table student add Age int default 18;

describe student;

alter table Course;

alter table student add constraint Check_age check (age>17);

insert into Course values('BN001','Engineering');
insert into Course values('BN002','Computing');
insert into Course values('BN003','media');
insert into Course values('BN004','Electronics');
insert into Course values('BN005','Mechatronics');


insert into student values('1234','Graham','BN002','rathouth road','Dublin 7','Dublin','23');
insert into student values('2345','Dave','BN003','Harrow st','Rillrush','Meath','19');
insert into student values('3456','Mark','BN001','Johns st','cillmeaden','Cork','26');
insert into student values('4567','John','BN004','st davids rd','rush','Kildare','21');
insert into student values('5678','Stephen','BN005','Faussagh rd','Cavan Town','Cavan','28');
insert into student values('1000','Karl','BN001','Josephs rd','henz','Louth','31');

update student set coursecode = 'BN002';

select *
from student;

select * 
from course;

select *
from student;







