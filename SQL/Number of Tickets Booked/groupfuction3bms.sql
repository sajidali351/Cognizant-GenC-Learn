/*
*/

select USER_ID, count(BD_ID) as no_of_times
from bookingdetails
group by USER_ID
order by USER_ID;