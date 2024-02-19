

select min(ename), max(ename), min(hiredate), max(hiredate) from emp;
-- 문자 및 날짜데이터도 최소값, 최댓값을 구할 수 있다.

select ename, hiredate from emp order by ename;

select avg(sal), max(sal), min(sal), sum(sal) from emp where job='SALESMAN';

select count(*) c1, count(comm) c2, avg(comm) c3, avg(nvl(comm,0)) c4 from emp;
-- count(*) : emp테이블의 행의 개수
-- count(comm) : comm값이 NULL이 아닌 행의 개수
-- avg(nvl(comm,0)) : comm값이 NULL이면 0으로 변환한 후에 전체 평균 구함

select count(deptno) c_dept, count(distinct deptno) c_dis, count(distinct job) c_job from emp;

select avg(comm), sum(comm)/14 from emp; 
-- avg(comm) : comm에서 NULL을 제외한 값의 평균
-- comm합에서 전체 행의 개수로 나눔
select avg(NVL(comm,0)), sum(comm)/14 from emp; 

select count(deptno), count(distinct deptno), sum(deptno), sum(distinct deptno) from emp;

select deptno, count(*), TRUNC(avg(sal),1), min(sal), max(sal), sum(sal) from emp group by deptno;
-- 부서별 급여 평균, 최댓값, 최솟값,,,

select deptno, count(*), TRUNC(avg(sal),1), min(sal), max(sal), sum(sal) from emp group by deptno order by sum(sal) desc;
-- group by절에 있는 컬럼은 select절에 사용할 수 있지만, 없는 컬럼은 사용할 수 없다.

select job, count(*), TRUNC(avg(sal),1), min(sal), max(sal), sum(sal) from emp group by job;
-- job을 기준으로 group을 나눈다.
-- count(*)는 쿼리속도를 저하시킬 수 있다.

select job,deptno, count(*), TRUNC(avg(sal),1), min(sal), max(sal), sum(sal) from emp group by job, deptno;
-- job, deptno를 기준으로 그룹을 나눔

select deptno, count(*), sum(sal) from emp group by deptno having max(sal)>2900;
-- 부서 중에서 2900보다 큰 데이터가 있으면 출력 (부서 30번은 출력이 안됨)

select deptno, count(*), sum(sal) from emp group by deptno having count(*) > 4;

select job, avg(sal), sum(sal) from emp having avg(sal)>=3000 group by job;
-- select절에 없는 것도 group함수는 사용 가능




