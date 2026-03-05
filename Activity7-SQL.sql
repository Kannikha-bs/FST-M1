SELECT SUM(purchase_amount) AS "Total Sum"
FROM orders;

SELECT AVG(purchase_amount) AS "Average"
FROM orders;

SELECT MAX(purchase_amount) AS "Maximum"
FROM orders;

SELECT MIN(purchase_amount) AS "Minimum"
FROM orders;

SELECT COUNT(DISTINCT salesman_id) AS "Total Count"
FROM orders;

SELECT * FROM orders;
