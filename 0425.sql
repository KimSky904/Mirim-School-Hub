-- 0425

-- 예제 1(80p)
-- sal+comm에서 comm이 NULL이면 결과는 NULL이 된다.
-- 이에 대비하기 위해 NVL을 사용하여 comm이 NULL일 경우 0으로 치환
select ename, sal, sal+comm, sal+NVL(comm,0)
from emp where deptno = 30; 

-- 예제 2
select ename, deptno, mgr, NVL2(mgr,mgr||'담당','상위자') from emp where deptno<>30;

-- 예제 3
select ename, job, NULLIF(job,'SALESMAN') AS result from emp where deptno = 30;

-- 예제 4
-- comm이 NULL이 아니면 comm출력
-- comm이 NULL이고 sal이 NULL이 아니면 SAL출력
--> 순차적으로 읽어서 NULL이 아닌 값 출력
select ename, comm, sal, COALESCE(comm, sal, 50) result from emp;

-- 예제 5
-- sal과 comm중 큰 값 출력
-- 둘 중 하나라도 NULL이면 결과도 NULL가 나옴
select ename, sal, comm, GREATEST(sal,comm) 결과 from emp where comm is not null;

-- 예제 6
-- sal과 comm중 작은 값 출력
-- 둘 중 하나라도 NULL이면 결과도 NULL가 나옴
select ename, sal, comm, LEAST(sal,comm) 결과 from emp where comm is not null;

-- 예제 7
select empno, ename, sal, job, 
    DECODE(job,'ANALYST',sal*1.1, --job이 ANALYST이면 sal*1.1 출력
        'CLERK',sal*1.2,
        'MANAGER',sal*1.3,
        'PRESIDENT',sal*1.4,
        'SALESMAN',sal*1.5
        ,sal) 변경결과 -- default : sal 출력
    from emp;


-- 예제 9
select ename, sal, 
    DECODE(SIGN(sal-1000),-1,'A', --SIGN : 부호, 0보다 크면 1, 작으면 -1, 같으면 0
        decode(SIGN(sal-2500),-1,'B',
        'C')) grade 
    from emp; --sal값이 1000보다 크면 A, 2500보다 크면 B, 그 외의 경우 C
