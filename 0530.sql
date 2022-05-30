-- 0530 서브쿼리
-- 157p 예제 1
select ename, sal from emp where sal > (select sal from emp where empno = 7566);

select ename, job from emp 
    where job = 
    (select job from emp where empno=7369); -- 이 문장(서브쿼리)를 먼저 실행하고, 
    -- 그 결과값을 where job과 비교하여 같은 값들은 메인쿼리에서 출력
    

select ename, deptno, sal, hiredate from emp where sal = max(sal); --오류 발생
-- max는 그룹함수이기 떄문에 where에 사용할 수 없다.

select ename, deptno from emp where sal = (select max(sal) from emp); -- 다음과 같이 서브쿼리로 사용하면 정상 작동


-- 예제 4
select empno, ename, job, sal, deptno from emp where sal<(select avg(sal) from emp);

-- 예제 5
select deptno, min(sal) from emp group by deptno --부서번호를 기준으로 group화 / 부서번호와 부서의 최소값을 축력
    having min(sal) > (select min(sal) from emp where deptno = 20); 
