select concat(owner_name, owner_id) as USERNAME, concat(substring(owner_name, 1,3), owner_id) as PASSWORD
from owners
order by USERNAME;