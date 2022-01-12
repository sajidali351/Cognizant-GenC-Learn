select distinct(d.hotel_id), d.hotel_name, d.rating
from hotel_details d , orders o
where o.order_date between '2019-07-01' and '2019-07-31'
and d.hotel_id=o.hotel_id
order by hotel_id;
