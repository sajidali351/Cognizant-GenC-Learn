select o.order_id, c.customer_name, h.hotel_name, o.order_amount
from customers c, hotel_details h, orders o
where c.customer_id = o.customer_id and h.hotel_id = o.hotel_id
order by o.order_id;