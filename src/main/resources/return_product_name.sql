select product_name
from netology.orders o
         join netology.customers c on
    o.customer_id = c.id and LOWER(c.name) = :name

-- select product_name
-- from netology.orders
--          inner join netology.customers c on c.id = orders.customer_id
-- where lower(c.name) = lower(:name);
