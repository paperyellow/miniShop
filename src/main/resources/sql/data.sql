insert into product(soldout, product_id,name, price, stock ) 
VALUES(1, 1, '바나나', 1000, 100);
insert into product(soldout, product_id,name, price, stock ) 
VALUES(1, 2, '딸기', 2000, 100);
insert into product(soldout, product_id,name, price, stock ) 
VALUES(1, 3, '참외', 1500, 100);

insert into orders(cancel,  product_id, quantity, payment_id) 
VALUES(1, 1, 20, 1); 
insert into orders(cancel,  product_id, quantity, payment_id) 
VALUES(1, 2, 30, 1); 
insert into orders(cancel,  product_id, quantity, payment_id) 
VALUES(1,  1, 10, 2); 
insert into orders(cancel,  product_id, quantity, payment_id) 
VALUES(1,  3, 40, 2); 
insert into orders(cancel,  product_id, quantity, payment_id) 
VALUES(0,  2, 10, 3); 

insert into payment(cancel,  total_quantity, total_price) 
VALUES(1,  50, 80000);
insert into payment(cancel,  total_quantity, total_price) 
VALUES(1,  50, 70000);
insert into payment(cancel, total_quantity, total_price) 
VALUES(0,  10, 20000);