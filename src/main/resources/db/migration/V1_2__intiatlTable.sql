drop table if exists item;
create table item (
                      itemId bigint not null,
                      itemCode varchar(20) not null,
                      itemName varchar(40),
                      description varchar(200),
                      primary key (itemId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


drop table if exists customer;
create table customer (
                          customerId bigint not null,
                          customerCode varchar(20) not null,
                          customerType varchar(40) not null,
                          firstName varchar(200) not null,
                          lastName varchar(20) not null,
                          primary key (customerId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;