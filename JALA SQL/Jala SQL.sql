create database jaladb;
use jaladb;

create table salespeople(
SNUM int not null,
SNAME varchar(10) not null,
CITY varchar(20),
COMM decimal(8,3),
primary key(SNUM));

insert into salespeople
values (1001, "Peel" , "London" , 0.12), (1002, "Serres" , "San Jose" , 0.13),
(1004 , "Motika" , "London" , 0.11);
insert into salespeople
values (1007, "Rafkin" , "Barcelona" , 0.11), (1003, "Alexrod" , "New York" , 0.1);
select * from salespeople

create table CUST(
CNUM int not null,
CNAME varchar(20),
CITY varchar(20),
RATING int,
SNUM int,
primary key(CNUM));

INSERT INTO CUST VALUES (2001, 'Hoffman', 'London',100,1001); 
INSERT INTO CUST VALUES (2002, 'Giovanne', 'Rome',200,1003);
INSERT INTO CUST VALUES (2003, 'Liu', 'San Jose',300,1002);
INSERT INTO CUST VALUES (2004, 'Grass', 'Berlin',100,1002);
INSERT INTO CUST VALUES (2006, 'Clemens', 'London',300,1007);
INSERT INTO CUST VALUES (2007, 'Pereia', 'Rome',100,1004); 
select * from CUST

create table ORDERS(
ONUM int not null,
AMT decimal(5,2),
ODATE date,
CNUM int,
SNUM int,
primary key(ONUM));

alter table ORDERS
modify AMT decimal(6,2);

delete from ORDERS where ONUM = 3002;
select * from ORDERS

INSERT INTO ORDERS VALUES (3001,18.69,'1994-10-03',2008,1007); 
INSERT INTO ORDERS VALUES (3003,767.19,'1994-10-03',2001,1001);   
INSERT INTO ORDERS VALUES (3002,1900.10,'1994-10-03',2007,1004);
INSERT INTO ORDERS VALUES (3005,5160.45,'1994-10-03',2003,1002) , (3006,1098.1,'1994-10-04',2008,1007) , (3009,1713.23,'1994-10-04',2002,1003),
(3007,75.75,'1994-10-05',2006,1002) , (3008,4723.00,'1994-10-05',2006,1001) , (3010,1309.95,'1994-10-06',2004,1002) , 
(3011,9891.88,'1994-10-06',2006,1001);
select * from ORDERS

select distinct SNUM from ORDERS;

select SNAME , COMM from salespeople
where CITY = 'London';

select * from CUST
where RATING = 100;

select ONUM , ODATE , AMT from orders;

select * from cust
where CITY = 'San Jose' AND RATING > 200;

select * from cust
where CITY = 'San Jose' OR RATING > 200;

select * from orders
where AMT = 1000;

select SNAME , CITY from salespeople
where CITY = 'London' and COMM > 0.10;

select * from cust
where RATING <= 100 OR CITY = 'Rome';

select * from salespeople
where CITY = 'Barcelona' OR CITY = 'London';

select * from salespeople
where comm > 0.10 AND comm < 0.12 ;

select * from cust
where city is null;

select * from orders
where ODATE between '1994-10-03' and '1994-10-04';

select * from salespeople
where SNAME like 'A%';

select count(distinct SNUM) from orders;

select onum , max(AMT) as MAXIMUM , ODATE , SNUM from orders
group by odate
order by odate;

select max(AMT) , ONUM , ODATE CNUM from orders
where amt > 3000
group by ODATE;

select count(AMT) from orders
where ODATE = '1994-10-03';

select * from cust
where CNAME like 'G%'
order by CNAME;

select max(rating) as Rating , city from cust
group by city
order by city;

select sum(amt) as Total_Amount , odate , onum , snum from orders
group by odate
order by odate;

select sname , cname from cust , salespeople
where cust.city = salespeople.city;

select cname from cust , salespeople
where cust.snum = salespeople.snum;

select cname , onum from orders , cust
where orders.cnum = cust.cnum;

select sname as Salesperson , cname as Customer from salespeople , cust
where salespeople.snum = cust.snum;

select * from salespeople
where comm > 0.12;

select sname as Name , amt * comm as Commission from cust, orders, salespeople
where rating > 100 and
salespeople.snum = cust.snum and salespeople.snum = orders.snum and cust.cnum = orders.cnum;

select a.cname , b.cname , a.rating from cust a, cust b
where a.rating = b.rating and a.cnum != b.cnum;

select cname from cust where city = ( select city from salespeople where sname = 'Serres');
Select cname from cust where city in ( select city from cust, orders where cust.cnum = orders.cnum and orders.snum in ( select snum  from salespeople where sname = 'Serres')); 

Select cname from cust where snum in (select snum from cust group by snum having count(snum) > 1); 
Select distinct a.cname from cust a ,cust b where a.snum = b.snum and a.rowid != b.rowid;

select cname , city from cust 
where rating = (select rating from cust where cname = 'Hoffman');

select onum from orders
where snum = (select snum from salespeople where sname = 'Motika');

Select onum, sname, cname, amt from orders a, salespeople b, cust c where a.snum = b.snum and a.cnum = c.cnum and a.snum = ( select snum from orders where cnum = ( select cnum from cust where cname = 'Hoffman')); 

select onum from orders
where amt > (select avg(amt) from orders where odate = '1994-10-04');

select avg(comm) from salespeople
where city = 'London';

Select snum, cnum  from orders where cnum in (select cnum  from cust where city = 'London'); 

Select comm from salespeople where snum in (select snum from cust where city = ‘London’);

Select cnum, cname from cust where cnum > ( select snum+1000  from salespeople where sname = 'Serres');

select count(cname) from cust
where rating > (select avg(rating) from cust where city = 'San Jose');

