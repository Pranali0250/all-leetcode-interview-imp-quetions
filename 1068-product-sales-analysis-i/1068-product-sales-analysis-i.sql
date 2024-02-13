# Write your MySQL query statement below
select product_name,year,price from Sales 
Inner join Product
on Sales.product_id=Product.product_id;
