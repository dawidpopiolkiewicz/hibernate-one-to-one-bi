# Hibernate One-To-One Bi-Directional with Foreign Key Association [![HitCount](http://hits.dwyl.io/dawidpopiolkiewicz/hibernate-one-to-one-bi.svg)](http://hits.dwyl.io/dawidpopiolkiewicz/hibernate-one-to-one-bi)


## :clapper: Screenshots
![onetoonebi](https://github.com/dawidpopiolkiewicz/hibernate-one-to-one-bi/blob/master/src/main/resources/img/onetoonebi.jpg)
![appmainbi](https://github.com/dawidpopiolkiewicz/hibernate-one-to-one-bi/blob/master/src/main/resources/img/appmainbi.jpg)
![2bi](https://github.com/dawidpopiolkiewicz/hibernate-one-to-one-bi/blob/master/src/main/resources/img/2bi.jpg)
![diagram](https://github.com/dawidpopiolkiewicz/hibernate-one-to-one-bi/blob/master/src/main/resources/img/one-to-one-uni-diagram.jpg)
![address_table](https://github.com/dawidpopiolkiewicz/hibernate-one-to-one-bi/blob/master/src/main/resources/img/address.jpg)
![user_table](https://github.com/dawidpopiolkiewicz/hibernate-one-to-one-bi/blob/master/src/main/resources/img/user.jpg)
![structure](https://github.com/dawidpopiolkiewicz/hibernate-one-to-one-bi/blob/master/src/main/resources/img/structure-of-project.jpg)



## :beginner: Technologies
* Hibernate 5.2.17
* MySQL 6.0.6
* Maven 4.0

## :construction_worker: Scripts used to create tables

```sql

use hb_one_to_one;

create table address (
id int(11) not null auto_increment,
street varchar(45) default null,
city varchar(45) default null,
zip_code varchar(45) default null,
primary key (id)
);

create table user (
id int(11) not null auto_increment,
first_name varchar(45) default null,
last_name varchar(45) default null,
address_id int(11) default null,
primary key (id),
key FK_ADDRESS_idx (address_id),
constraint FK_ADDRESS foreign key (address_id)
references address (id)
);
```
## :e-mail: Contact
Created by <dawid.popiolkiewicz@gmail.com> - feel free to contact me! :boom:
