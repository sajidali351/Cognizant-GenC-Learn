/*select distinct u.name, u.address
from USERS u, BOOKINGDETAILS b
where u.USER_ID = b.USER_ID
and b.name not in ('HDFC')
order by u.name;*/

select distinct u.name, u.address
from USERS u, BOOKINGDETAILS b
where u.USER_ID = b.USER_ID
and b.USER_ID NOT IN (select bd.USER_ID from BOOKINGDETAILS bd where bd.name  ='HDFC')
order by u.name;

/*select distinct u.name, u.address from users u, (
select b.user_id, b.name from bookingdetails b where b.name != 'HDFC') bd
where u.user_id=bd.user_id
order by 1 */