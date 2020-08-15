insert into LOCATION(id,name)values(1,'marathalli,bangalore');
insert into LOCATION(id,name)values(2,'manikular,bangalore');
insert into LOCATION(id,name)values(3,'agra,delhi');
insert into LOCATION(id,name)values(4,'domluru,bangalore');

insert into USERS(id,email,first_name,last_name,location_id)values(1,'dv@gmail.com','ram','chandra',1);
insert into USERS(id,email,first_name,last_name,location_id)values(2,'mv@gmail.com','rahish','samal',2);
insert into USERS(id,email,first_name,last_name,location_id)values(3,'pv@gmail.com','prilak','khan',3);
insert into USERS(id,email,first_name,last_name,location_id)values(4,'tv@gmail.com','tarik','chauhan',4);

insert into POSTS(id,details,post_dates,user_id)values(1,'very good post',CURRENT_TIMESTAMP(),1);
insert into POSTS(id,details,post_dates,user_id)values(2,'A rainy day',CURRENT_TIMESTAMP(),2);
insert into POSTS(id,details,post_dates,user_id)values(3,'this refine code',CURRENT_TIMESTAMP(),3);
insert into POSTS(id,details,post_dates,user_id)values(4,'this is hibernate',CURRENT_TIMESTAMP(),4);
