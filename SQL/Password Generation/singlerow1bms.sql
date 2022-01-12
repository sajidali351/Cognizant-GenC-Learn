select NAME, concat(substring(NAME, 1, 3),substring(PHNO, 1, 3)) as PASSWORD
from USERS
order by NAME;