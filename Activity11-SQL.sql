SELECT c.customer_name AS name,
       c.customer_id   AS id,
       COUNT(o.order_no) AS total_orders
FROM customers c
JOIN orders o
ON c.customer_id = o.customer_id
GROUP BY c.customer_name, c.customer_id
HAVING COUNT(o.order_no) > 1

SELECT s.salesman_name AS name,
       s.salesman_id   AS id,
       COUNT(o.order_no) AS total_orders
FROM salesman s
JOIN orders o
ON s.salesman_id = o.salesman_id
GROUP BY s.salesman_name, s.salesman_id
HAVING COUNT(o.order_no) > 1

SELECT name, id, total_orders
FROM (
    SELECT c.customer_name AS name,
           c.customer_id AS id,
           COUNT(o.order_no) AS total_orders
    FROM customers c
    JOIN orders o
    ON c.customer_id = o.customer_id
    GROUP BY c.customer_name, c.customer_id
    HAVING COUNT(o.order_no) > 1

    UNION ALL

    SELECT s.salesman_name AS name,
           s.salesman_id AS id,
           COUNT(o.order_no) AS total_orders
    FROM salesman s
    JOIN orders o
    ON s.salesman_id = o.salesman_id
    GROUP BY s.salesman_name, s.salesman_id
    HAVING COUNT(o.order_no) > 1
)
ORDER BY name;


SELECT order_date,
       salesman_id,
       purchase_amount,
       CASE
           WHEN purchase_amount = (
               SELECT MAX(purchase_amount)
               FROM orders o2
               WHERE o2.order_date = o1.order_date
           ) THEN 'Highest on'
           WHEN purchase_amount = (
               SELECT MIN(purchase_amount)
               FROM orders o2
               WHERE o2.order_date = o1.order_date
           ) THEN 'Lowest on'
       END AS order_type
FROM orders o1
WHERE purchase_amount = (
          SELECT MAX(purchase_amount)
          FROM orders o2
          WHERE o2.order_date = o1.order_date
      )
   OR purchase_amount = (
          SELECT MIN(purchase_amount)
          FROM orders o2
          WHERE o2.order_date = o1.order_date
      )
ORDER BY order_date, order_type;
