select  car_id, count(car_id) as "NO_OF_TRIPS"
from rentals
group by car_id
order by car_id;