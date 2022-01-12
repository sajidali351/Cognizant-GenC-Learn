select h.hotel_id, h.hotel_name, count(o.hotel_id) as 'NO_OF_ORDERS' 
from hotel_details h , orders o
where h.hotel_id = o.hotel_id
group by h.hotel_id
having count(o.hotel_id)>5;


/*
select * from orders;
*/