create database School;
use School;
create table Students(
student_id int auto_increment primary key, 
Name nvarchar (50),
phone int,
email nvarchar(30),
addres nvarchar(60)
);

create table Teacher(
teach_id int auto_increment primary key, 
Name nvarchar (50),
phone int,
email nvarchar(30),
addres nvarchar(60),
sub nvarchar(30),
class nvarchar(4)
);

create table Teach_Student(
Teach_Student_id int auto_increment primary key,
student_id int,
teach_id int,
foreign key (student_id) references Students(student_id),
foreign key (teach_id) references Teacher(teach_id)

); 

