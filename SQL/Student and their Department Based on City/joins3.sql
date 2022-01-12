select s.student_name , d.department_name 
from student as s , department as d 
where d.department_id = s.department_id and s.city = "Coimbatore"
order by s.student_name;