/* 0516 */
select deptno, sum(sal) from emp group by deptno having sum(sal) >= 10000 and deptno in(20,30);
-- 그룹의 합이 10000보다 크거나 같고 부서번호가 20 또는 30인 경우에만 출력 

select deptno, avg(sal), sum(sal) 
from emp where job='CLERK' 
group by deptno 
having avg(sal) >= 1000 and deptno in(20,30);
-- job이 그룹이 아니기 때문에 where 사용
-- habing절은 그룹으로 정한 컬럼이나 그룹함수 사용


select deptno, avg(sal), sum(sal) 
from emp where job='CLERK' 
group by deptno 
having avg(sal) >= 1000 and job='CLERK'; --에러 발생
-- job은 그룹으로 설정한 컬럼이 아니기 때문에 having절에서 사용하면 오류가 발생한다.

select max(sum(sal)) from emp group by deptno; --중첩함수는 한번만 사용한다.
-- 부서번호별로 합계를 구한 후에, 그 중에서 최댓값을 구함


select ename, hiredate, min(hiredate) from emp where deptno = 20;
-- group by를 사용하지 않아서 오류 발생
-- hiredate를 가지고 최솟값을 구하는 데 조건을 사용할 경우엔 group by절과 having절을 사용해야 한다.

select min(hiredate) from emp where deptno = 20;
-- 이 경우에는 정상 실행

select listagg(ename,';') within group(order by ename desc) "Ename",
listagg(hiredate,';') within group(order by ename desc) "hiredate", 
min(hiredate) "Earliest" from emp
where deptno = 20;
-- listagg : 목록 집계함수


-- rollup 예제 1 (rollup는 시험출제 빈도 낮음)
select deptno, count(*), sum(sal) from emp group by rollup(deptno);

-- rollup 예제 2
select deptno, job, sum(sal) from emp group by rollup(deptno,job);

-- rollup 예제 4
select deptno, job, mgr, sum(sal) from emp group by rollup(deptno,job,mgr); --속도저하를 일으키기 쉬움

-- cube 예제 1
select deptno, job, sum(sal) from emp group by cube(deptno, job); --rollup함수와는 반대(역방향) 출력
