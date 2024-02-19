
select ename 결과1, 'ABCDE' 결과2, sal 결과3, 500 결과4 from emp;
-- SMITH	ABCDE	800	500
-- ALLEN	ABCDE	1600	500

select ename || ':' || empno || ':' || job "이름사번업무" from emp;
-- SMITH:7369:CLERK
-- ALLEN:7499:SALESMAN

select ename || ':' || empno || ':' || job from emp;
-- SMITH:7369:CLERK
-- ALLEN:7499:SALESMAN

select ename || ' is the' || job "King is a JOB" from emp;
-- SMITH is theCLERK
-- ALLEN is theSALESMAN

select ename || ': 1 year salary = ' || sal*12 Monthly from emp;
-- SMITH: 1 year salary = 9600
-- ALLEN: 1 year salary = 19200

select ALL * from emp;
-- 모든 값 출력
-- select * from emp; 는 ALL이 생략된 상태

select job from emp;
-- CLERK
-- SALESMAN
-- SALESMAN
-- MANAGER
-- SALESMAN

select distinct job from emp;
-- job컬럼을 가지고 중복 제거
-- CLERK
-- SALESMAN
-- PRESIDENT

select distinct deptno, job from emp; --deptno와 job의 값이 동시에 같은 값 중복 제거

select ROWID, rownum, ename, sal from emp;
-- AAAE7FAABAAALDBAAA	1	SMITH	800

select ROWID, rownum, ename, sal from emp where rownum = 3; --결과 안나옴 (시험출제 X)
-- rowid와 rownum은 데이터 한 줄을 읽고 난 후에 번호를 부여한다.
-- 따라서 rowid값을 부여하는 시점에 3은 존재하지 않고, 결과가 나오지 않는다.


-- where절은 별칭을 사용할 수 없다.
-- wehre절의 실행이 select절보다 먼저 실행되기 때문(별칭은 select에서 설정)

-- WHERE절에서 산술식을 사용할 경우 왼쪽식에 산술식이 있으면 속도가 저하된다.

select empno, ename, job, sal from emp where job = 'MANAGER'; --정상결과
select empno, ename, job, sal from emp where job = 'MaNaGeR'; --결과 X
-- 실제 데이터는 모두 대문자로 저장된다.

select empno, ename, job, sal from emp where sal >= 3000; 
-- sal이 3000 이상인 값 출력


select empno, ename, job, sal, deptno from emp where deptno!=30;
select empno, ename, job, sal, deptno from emp where deptno<>30;
select empno, ename, job, sal, deptno from emp where deptno^=30;



select empno,ename,job,sal,comm,deptno from emp where comm = NULL; --결과X
-- 100 = NULL의 결과는 NULL이므로 사용 불가
select empno,ename,job,sal,comm,deptno from emp where comm IS NULL; -- 정상작동


select ename, job, sal, deptno from emp where sal BETWEEN 1300 AND 1700; --1300 ~ 1700
select ename, job, sal, deptno from emp where sal BETWEEN 1700 AND 1300; --결과 X

select empno,ename,job,sal,hiredate from emp where empno IN(7369,7934,7566);
select empno,ename,job,sal,hiredate from emp where empno = 7369 OR empno = 7934 OR empno = 7566; --결과 동일

select ename,sal,job from emp where ename LIKE '_A%';
-- WARD	1250	SALESMAN
-- MARTIN	1250	SALESMAN
-- JAMES	950	CLERK
