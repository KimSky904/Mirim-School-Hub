select empno, ename, job, sal, deptno from emp where sal >=2800 AND job = 'MANAGER';
select empno, ename, job, sal, deptno from emp where sal >=2800 AND job = 'manager'; --data는 대소문자를 구별한다.


-- NOT
select empno, ename, job, sal, deptno from emp where job IN('MANAGER','CLERK','ANALYST');
select empno, ename, job, sal, deptno from emp where job NOT IN('MANAGER','CLERK','ANALYST');

select ename, sal from emp where sal BETWEEN 1000 AND 3000;
select ename, sal from emp where sal NOT BETWEEN 1000 AND 3000;

select * from emp where ename LIKE 'A%'; --A로 시작하는 이름 출력
select * from emp where ename NOT LIKE 'A%';

select ename,sal,comm,deptno from emp where comm IS NULL;
select ename,sal,comm,deptno from emp where comm IS NOT NULL; --NOT IS NULL이 아님을 주의


-- NVL
select ename,sal,comm,deptno from emp where (NVL(comm,0)=0); --comm이 NULL이면 0값으로 변경

-- 연산 순서
select empno,ename,job,sal from emp where sal>=1500 AND job='PRESIDENT' OR job='SALESMAN';  --1500이상이고 직업이 PRESIDENT '이거나' 직업이 SALESMAN인 결과 출력
select empno,ename,job,sal from emp where sal>=1500 AND (job='PRESIDENT' OR job='SALESMAN'); --1500이상'이고' 직업이 PRESIDENT이거나 SALESMAN인 결과 출력

-- 정렬
select empno, ename, job, sal, hiredate from emp order by hiredate; --과거 -> 현재 날짜 순으로 정렬
select empno, ename, job, sal, hiredate from emp; --동일한 결과 출력

select empno, ename, job, sal, hiredate from emp order by hiredate desc; --현재 -> 과거 날짜 순으로 정렬

select empno, ename, job, deptno,sal, hiredate from emp order by deptno,sal DESC; -- deptno는 오름차순, sal은 내림차순 적용
select empno, ename, job, deptno,sal, hiredate from emp order by deptno DESC,sal DESC; -- deptno와 sal 내림차순 적용

