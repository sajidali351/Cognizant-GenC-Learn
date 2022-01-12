select concat(customer_id, " mail id is ",email_id) as CUSTOMER_MAIL_INFO
from customers
order by CUSTOMER_MAIL_INFO;