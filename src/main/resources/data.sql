INSERT INTO brands (id, name) VALUES (1, 'Zara');
INSERT INTO brands (id, name) VALUES (2, 'Pull&Bear');
INSERT INTO brands (id, name) VALUES (3, 'Bershka');

INSERT INTO price_lists (id, discount_percentage) VALUES (1, 8.86);
INSERT INTO price_lists (id, discount_percentage) VALUES (2, 34.66);
INSERT INTO price_lists (id, discount_percentage) VALUES (3, 21.69);
INSERT INTO price_lists (id, discount_percentage) VALUES (4, 30.0);

INSERT INTO products (id, name, price, brand_id) VALUES (1, 'Camisa Básica', 38.95, 1);
INSERT INTO products (id, name, price, brand_id) VALUES (2, 'Sudadera Básica', 19.99, 2);
INSERT INTO products (id, name, price, brand_id) VALUES (35455, 'Vestido Estampado', 34.99, 3);

INSERT INTO prices (id, brand_id, product_id, start_date, end_date, price_list, priority, price, currency)
VALUES (1, 1, 35455, '2020-06-14 00:00:00','2020-12-31 23:59:59', 1, 0, 35.50, 'EUR');

INSERT INTO prices (id, brand_id, product_id, start_date, end_date, price_list, priority, price, currency)
VALUES (2, 1, 35455, '2020-06-14 15:00:00','2020-06-14 18:30:00', 2, 1, 25.45, 'EUR');

INSERT INTO prices (id, brand_id, product_id, start_date, end_date, price_list, priority, price, currency)
VALUES (3, 1, 35455, '2020-06-15 00:00:00','2020-06-15 11:00:00', 3, 1, 30.50, 'EUR');

INSERT INTO prices (id, brand_id, product_id, start_date, end_date, price_list, priority, price, currency)
VALUES (4, 1, 35455, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 1, 38.95, 'EUR');