# Write your MySQL query statement below
with ProductCounts as (
  SELECT
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product ORDER BY product) AS products
  FROM Activities
  GROUP BY sell_date
)
SELECT sell_date, num_sold, products
FROM ProductCounts 
ORDER BY sell_date;
