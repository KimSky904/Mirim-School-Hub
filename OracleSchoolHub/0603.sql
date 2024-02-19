-- 다중 행 서브쿼리(159p)
-- 예제 1
select empno, ename, sal, deptno 
    from emp 
    where sal = (SELECT MAX(sal) 
        from emp 
        group by deptno); --오류 발생
        -- sal값은 1개만 받을 수 있음
        -- 서브쿼리를 실행하면 3개의 값이 도출됨
    
select empno, ename, sal, deptno 
    from emp 
    where sal IN(SELECT MAX(sal) 
        from emp 
        group by deptno); --IN으로 바꿀 경우 정상 작동
        

-- 예제 2
select ename, sal, job 
    from emp where job!='SALESMAN' 
    and sal>ANY(SELECT sal 
    from emp where job='SALESMAN'); -- chleot  

select ename, sal, job --위 쿼리와 동일한 결과
    from emp
    where job!='SALESMAN'
    and sal>(select min(sal) 
    from emp where job='SALESMAN'); 
    
select ename, sal, job --위 쿼리와 동일한 결과
    from emp
    where job!='SALESMAN'
    and sal < (select max(sal) 
    from emp where job='SALESMAN'); -- 가장 큰 sal값보다 큰 값 출력(ANY를 쓰지 않아도 됨)
    
    
    
    
    
-- 예제 3 (MAX)
select ename, sal, job, hiredate, deptno 
    from emp
    where job!='SALESMAN' 
    and sal>ALL(select sal from emp where job='SALESMAN'); --서브쿼리의 최댓값보다 큰 값을 출력
    
select ename, sal, job, hiredate, deptno --위 쿼리와 동일한 결과
    from emp
    where job!='SALESMAN' 
    and sal > (select MAX(sal) from emp where job='SALESMAN');
 
 
-- 예제 3 (MIN)
select ename, sal, job, hiredate, deptno 
    from emp
    where job!='SALESMAN' 
    and sal<ALL(select sal from emp where job='SALESMAN'); --서브쿼리의 sal값들보다 작은 값 출력
    -- 즉 최솟값 1250보다 작은 값 출력
    
select ename, sal, job, hiredate, deptno   --위 쿼리와 동일한 결과
    from emp
    where job!='SALESMAN' 
    and sal< (select MIN(sal) from emp where job='SALESMAN');    
    -- ANY, ALL을 기본함수로 대체할 수 있음에도 사용하는 이유? : 속도때문
    
    
    
-- 다중 열 서브쿼리 (162p)
select ename, mgr, deptno
    from emp
    where mgr IN(select mgr from emp where ename IN('FORD','BLAKE'))
    and deptno IN(select deptno from emp where ename IN('FORD','BLAKE'))
    and ename NOT IN('FORD','BLAKE');
    
select ename, mgr, deptno
    from emp
    where (mgr,deptno) IN(select mgr,deptno from emp where ename IN('FORD','BLAKE'))
    and ename NOT IN('FORD','BLAKE');    
    
    
select ename, sal, deptno, hiredate, job
    from emp e
    where sal > (select AVG(sal) from emp where deptno=e.deptno);
    -- 메인쿼리에서 emp테이블의 한 행을 읽어서
    -- e.deptno값을 서브쿼리로 전달
    -- 서브쿼리는 메인쿼리에서 받은 부서번호로 평균 급여를 계산
    -- 다시 메인쿼리는 서브쿼리의 평균급여보다 큰 값이면 
    
    
