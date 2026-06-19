--activty10
SELECT * FROM orders
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesmans WHERE salesman_city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders
WHERE salesman_id IN( SELECT salesman_id FROM salesmans
WHERE commission=( SELECT MAX(commission) FROM salesmans));