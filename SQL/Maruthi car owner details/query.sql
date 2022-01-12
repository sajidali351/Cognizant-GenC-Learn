select distinct o.owner_id, o.owner_name, o.address, o.phone_no 
from owners o, cars c
where o.owner_id = c.owner_id
and c.car_name like "Maruthi%"
order by o.owner_id;