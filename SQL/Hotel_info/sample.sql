select concat(hotel_name," is a ", hotel_type, " hotel") as HOTEL_INFO
from hotel_details
order by HOTEL_INFO desc;