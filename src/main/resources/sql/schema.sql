drop table product;
drop table orders;
drop table payment;

create table product(
    soldout BOOLEAN,
    product_id int primary KEY AUTO_INCREMENT,
    name VARCHAR(24) NOT null,
    price INT NOT null,
    stock INT NOT null
);

create table orders(
    cancel BOOLEAN,
    orders_id int primary KEY AUTO_INCREMENT,
    product_id INT NOT null,
    quantity INT NOT null,
    payment_id INT NOT null
);

create table payment(
    cancel BOOLEAN,
    payment_id int primary KEY AUTO_INCREMENT,
    total_quantity INT NOT null,
    total_price INT NOT null
);