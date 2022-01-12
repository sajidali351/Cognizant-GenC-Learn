select distinct s.bus_no, b.bus_name
from schedule s join buses b
on s.bus_no = b.bus_no
where (s.source, s.destination) = any (
select s.destination, s.source 
from schedule s)
order by s.bus_no;