
-- 1 --
select deptno, count(*) as 'umber of Employees'
from emp
group by deptno
having count(*)>4;

-- 2 --
select mgr, min(sal) as 'Lowest paid salaries'
from emp
group by mgr
having min(sal) > 1000
order by min(sal);

-- 3 --
select e.empno, e.ename, e.deptno, d.dname
from emp e inner join dept d
WHERE e.deptno = d.deptno;

-- 4 --
select e.empno, e.ename, e.deptno, d.dname, d.loc
from emp e inner join dept d
on e.deptno = d.deptno;

-- 5 --
select e.ename, e.deptno, d.dname
from emp e inner join dept d
on e.deptno = d.deptno
order by ename, dname;

-- 6 --
select d.deptno, d.dname, sum(sal) + IFNULL(sum(comm),0)
from emp e inner join dept d
on e.deptno = d.deptno 
group by deptno;

-- 7 --
select d.deptno, d.dname, count(*)
from emp e inner join dept d
on e.deptno = d.deptno 
group by deptno;

-- 8 --
select d.deptno, d.dname, count(*)
from emp e inner join dept d
on e.deptno = d.deptno 
group by deptno
having count(*) > 4;

-- 9 --
select e.ename, g.grade
from emp e inner join salgrade g
on e.sal >= g.losal and e.sal <=g.hisal;

-- 10 --
select ename, g.grade, e.job, e.sal
from emp e inner join salgrade g
on e.sal >= g.losal and e.sal <=g.hisal;

-- 11 --
select e1.ename as 'Employee name', e1.empno as 'Employee ID', 
e2.empno as 'Manager Number', e2.ename as 'Manager Name'
from emp e1 inner join emp e2
ON e1.mgr = e2.empno;

