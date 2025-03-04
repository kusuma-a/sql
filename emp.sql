use employeetable;
show tables;
create table Emp2( empno int ,ename char(40), job char(50),mgr int , hiredate date, salary decimal(10,2),comm decimal(10,2),deptno int );

insert into Emp2(empno,ename,job,mgr,hiredate,salary,comm,deptno)
values
(8369,'SMITH','CLERK',8902,'1990-12-18',800.00,NULL,20),
(8499,'ANYA','SALSEMAN',8698,'1991-02-20',1600.00,300.00,30),
(8521,'SETH','SALESMAN',8698,'1991-02-22',1250.00,500.00,30),
(8566,'MAHADEVAN','MANAGER',8839,'1991-04-02',2985.00,NULL,20),
(8654,'MOMIN','SALESMAN',8698,'1991-09-28',1250.00,1400.00,30),
(8698,'BINA','MANAGER',8839,'1991-05-01',2850.00,NULL,30),
(8882,'SHIVANSH','MANAGER',8839,'1991-06-09',2450.00,NULL,10),
(8888,'SCOTT','ANALYST',8566,'1992-12-09',3000.00,NULL,20),
(8839,'AMIR','PRESIDENT',NULL,'1991-11-18',5000.00,NULL,10),
(8844,'KULDEEP','SALSEMAN',8698,'1991-09-08',1500.00,null,30);


select * from Emp2;

select ename,salary from Emp2 where salary >= 2200;

select * from Emp2 where comm IS NULL;

select ename,salary from Emp2 where salary NOT between 2500 and 4000 ;

select ename,job,salary from Emp2 where mgr IS NULL;

select ename from Emp2 where ename like '__%a'; 

select ename from Emp2 where ename like '%t'; 
