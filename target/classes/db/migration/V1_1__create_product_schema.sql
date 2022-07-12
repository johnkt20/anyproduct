drop table if exists product;
CREATE TABLE PRODUCT (
                                    id bigint(20) NOT NULL AUTO_INCREMENT,
                                    name varchar(100) NOT NULL,
                                    price varchar(50) NOT NULL,
                                    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;